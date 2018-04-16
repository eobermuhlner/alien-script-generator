package ch.obermuhlner.alienscript

import java.awt.BasicStroke
import java.awt.Color
import java.awt.RenderingHints
import java.awt.geom.GeneralPath
import java.awt.image.BufferedImage
import java.awt.image.RenderedImage
import java.io.File
import java.io.IOException
import java.util.*
import javax.imageio.ImageIO

class GlyphGenerator(val random: Random = Random()) {

    private val width = nextInt(3..8)
    private val height = nextInt(2..5)

    private val gridProbabilities = DoubleArray(width * height)
    private val totalGridProbability: Double = run {
        var total = 0.0
        for (y in 0 until height) {
            val yRandom = random.nextDouble()
            for (x in 0 until width) {
                val xRandom = random.nextDouble()

                val cellRandom = random.nextDouble()
                val r = xRandom + yRandom + cellRandom
                total += r * r

                val index = x + y*width
                gridProbabilities[index] = total

            }
        }
        total
    }

    private val strokeCountRange = nextInt(1..2) .. nextInt(2..5)
    private val pointCountRange = nextInt(2..4) .. nextInt(2..6)

    private val hasBaseline = random.nextDouble() < 0.6
    private val baselineY = nextInt(0, height)

    private val curveProbability = if (random.nextDouble() < 0.05) 0.0 else random.nextDouble()

    init {
        println("width = $width")
        println("height = $height")
        println("strokeCountRange = $strokeCountRange")
        println("pointCountRange = $pointCountRange")
        println("hasBaseline = $hasBaseline")
        println("baselineY = $baselineY")
        println("curveProbability = $curveProbability")
        println()
    }

    fun create(): Glyph {
        val strokes = mutableListOf<Stroke>()
        val strokeCount = nextInt(strokeCountRange)

        for (strokeIndex in 0 until strokeCount) {
            val points = mutableListOf<Point>()
            val pointCount = nextInt(pointCountRange)

            for (pointIndex in 0 until pointCount) {
                if (hasBaseline) {
                    if (strokeIndex == 0 && pointIndex == 0) {
                        points.add(nextBaselineStartPoint())
                    }
                }

                points.add(nextPoint())

                if (hasBaseline) {
                    if (strokeIndex == strokeCount-1 && pointIndex == pointCount-1) {
                        points.add(nextBaselineEndPoint())
                    }
                }
            }

            strokes.add(Stroke(points))
        }

        return Glyph(width, height, strokes)
    }

    private fun nextBaselineStartPoint(): Point {
        val x = 0
        val y = baselineY

        if (random.nextDouble() < curveProbability) {
            return Point(x, y, 1, 0,-1, 0)
        } else {
            return Point(x, y)
        }
    }

    private fun nextBaselineEndPoint(): Point {
        val x = width
        val y = baselineY

        if (random.nextDouble() < curveProbability) {
            return Point(x, y, 1, 0,-1, 0)
        } else {
            return Point(x, y)
        }
    }

    private fun nextPoint(): Point {
        val randomGridIndex = nextGridIndex()
        val x = randomGridIndex % width
        val y = randomGridIndex / width

        if (random.nextDouble() < curveProbability) {
            val bezierMinX = if (x == 0) 0 else -1
            val bezierMaxX = if (x == width - 1) 0 else 1
            val bezierMinY = if (y == 0) 0 else -1
            val bezierMaxY = if (y == height - 1) 0 else 1
            return Point(x, y, nextInt(bezierMinX, bezierMaxX), nextInt(bezierMinY, bezierMaxY), nextInt(bezierMinX, bezierMaxX), nextInt(bezierMinY, bezierMaxY))
        } else {
            return Point(x, y)
        }
    }

    private fun nextGridIndex(): Int {
        val r = random.nextDouble() * totalGridProbability
        for (i in gridProbabilities.indices) {
            if (r < gridProbabilities[i]) {
                return i
            }
        }
        return 0
    }

    private fun nextInt(range: IntRange): Int {
        return nextInt(range.first, range.last)
    }

    private fun nextInt(min: Int, max: Int): Int {
        if (min >= max) {
            return min
        }
        return random.nextInt(max - min) + min
    }
}

class FontGenerator(val glyphGenerator: GlyphGenerator) {

    fun create(): Font {
        val knownGlyphs = mutableSetOf<Glyph>()
        val glyphsMap = mutableMapOf<String, Glyph>()
        for(key in listOf("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z")) {
            val glyph = createGlyph(glyphGenerator, knownGlyphs)
            glyphsMap[key] = glyph
            knownGlyphs.add(glyph)
        }
        return Font(glyphsMap)
    }

    private fun createGlyph(glyphGenerator: GlyphGenerator, knownGlyphs: Set<Glyph>): Glyph {
        for (i in 0..1000) {
            val glyph = glyphGenerator.create()
            if (!knownGlyphs.contains(glyph)) {
                return glyph
            }
        }
        throw IllegalArgumentException("Failed to generate distinct glyph.\n$knownGlyphs" )
    }
}

class GlyphToImageConverter {
    val width = 40
    val height = 40
    val insetLeft = 2
    val insetRight = 2
    val insetTop = 2
    val insetBottom = 2

    fun convert(glyph: Glyph): RenderedImage {
        val image = BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB)

        val gc = image.createGraphics()
        gc.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON)

        gc.paint = Color.BLACK
        gc.stroke = BasicStroke(3.0f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND)

        for (stroke in glyph.strokes) {
            val path = GeneralPath()

            for (pointIndex in stroke.points.indices) {
                val point = stroke.points[pointIndex]
                if (pointIndex == 0) {
                    path.moveTo(toX(point.x, glyph), toY(point.y, glyph))
                } else if (point.isStraight) {
                    path.lineTo(toX(point.x, glyph), toY(point.y, glyph))
                } else {
                    val lastPoint = stroke.points[pointIndex-1]
                    path.curveTo(
                            toX(lastPoint.x + lastPoint.bezierStartX, glyph), toY(lastPoint.y + lastPoint.bezierStartY, glyph),
                            toX(point.x + point.bezierEndX, glyph), toY(point.y + point.bezierEndY, glyph),
                            toX(point.x, glyph), toY(point.y, glyph))
                }
            }

            gc.draw(path)
        }

        return image
    }

    private fun toX(x: Int, glyph: Glyph) = x.toDouble() * (width - insetLeft - insetRight) / glyph.width + insetLeft
    private fun toY(y: Int, glyph: Glyph) = y.toDouble() * (height - insetTop - insetBottom) / glyph.height + insetTop
}

fun save(image: RenderedImage, name: String) {
    try {
        val file = File("$name.png");
        ImageIO.write(image, "png", file);
    } catch (e: IOException) {
        e.printStackTrace()
    }
}

fun main(args: Array<String>) {
    val offset = 0L;
    for (f in 1..9) {
        println("Generating font #$f")
        val generator = FontGenerator(GlyphGenerator(Random(f.toLong() + offset)))
        val font = generator.create()

        val converter = GlyphToImageConverter()
        for(entry in font.glyphs) {
            val image = converter.convert(entry.value)
            save(image, "docs/fonts/example$f/${entry.key}")
        }
    }
}
