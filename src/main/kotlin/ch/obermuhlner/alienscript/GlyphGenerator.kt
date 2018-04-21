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

class GlyphGenerator(
        val random: Random = Random(),
        private val width: Int = randomPick(random, 3, 3, 3, 3, 4, 4, 4, 5, 5, 6, 7, 8, 9),
        private val height: Int = randomPick(random, 3, 3, 3, 3, 4, 4, 4, 5, 5, 6, 7, 8, 9),

        private val gridBorderProbabilityRange: ClosedFloatingPointRange<Double> = 0.0 .. 3.0,
        private val gridXProbabilityRange: ClosedFloatingPointRange<Double> = 0.0 .. 2.0,
        private val gridYProbabilityRange: ClosedFloatingPointRange<Double> = 0.0 .. 2.0,
        private val gridCellProbabilityRange: ClosedFloatingPointRange<Double> = 0.0 .. 1.0,

        private val hasStartBaseline: Boolean = random.nextDouble() < 0.6,
        private val hasEndBaseline: Boolean = hasStartBaseline,
        private val baselineY: Int = randomInt(random, 0, height),

        private val curveProbability: Double = if (random.nextDouble() < 0.05) 0.0 else random.nextDouble(),
        private val curveContinuousProbability: Double = random.nextDouble(),
        private val curveUseGridProbability: Double = random.nextDouble(),
        private val curveRangeX: IntRange = randomInt(random, -width, 0) .. randomInt(random, 0, width),
        private val curveRangeY: IntRange = randomInt(random, -height, 0) .. randomInt(random, 0, height),

        private val strokeCountRange: IntRange = randomPick(random, 1, 2) .. randomPick(random, 2, 2, 2, 2, 3, 3, 3, 4),
        private val primaryPointCountRange: IntRange = randomPick(random, 3, 4) .. randomPick(random, 4, 4, 4, 5, 5, 6),
        private val secondaryPointCountRange: IntRange = randomPick(random, 1, 2, 2, 2) .. randomPick(random, 2, 3, 3, 4)) {


    private val gridProbabilities = DoubleArray((width + 1) * (height + 1))
    private val totalGridProbability: Double = run {
        var total = 0.0
        for (y in 0 .. height) {
            val yRandom = randomDouble(random, gridYProbabilityRange)
            for (x in 0 .. width) {
                val xRandom = randomDouble(random, gridXProbabilityRange)
                val isBorderX = x == 0 || x == width - 1
                val isBorderY = y == 0 || y == height - 1
                val borderXRandom = if (isBorderX) randomDouble(random, gridBorderProbabilityRange) else 0.0
                val borderYRandom = if (isBorderY) randomDouble(random, gridBorderProbabilityRange) else 0.0

                val cellRandom = randomDouble(random, gridCellProbabilityRange)
                val r = borderXRandom + borderYRandom + xRandom + yRandom + cellRandom
                total += r * r

                val index = x + y*(width+1)
                gridProbabilities[index] = total
            }
        }

        println("gridProbabilities=")
        var lastValue = 0.0
        for (y in 0 until height) {
            for (x in 0 until width) {
                val index = x + y*(width+1)
                val value = gridProbabilities[index]
                val probability = (value - lastValue) / total
                print("$probability, ")
                lastValue = value
            }
            println()
        }

        total
    }

    init {
        println("width = $width")
        println("height = $height")
        println("gridBorderProbabilityRange = $gridBorderProbabilityRange")
        println("gridXProbabilityRange = $gridXProbabilityRange")
        println("gridYProbabilityRange = $gridYProbabilityRange")
        println("gridCellProbabilityRange = $gridCellProbabilityRange")

        println("hasStartBaseline = $hasStartBaseline")
        println("hasEndBaseline = $hasEndBaseline")
        println("baselineY = $baselineY")

        println("curveProbability = $curveProbability")
        println("curveContinuousProbability = $curveContinuousProbability")
        println("curveUseGridProbability = $curveUseGridProbability")
        println("curveRangeX = $curveRangeX")
        println("curveRangeY = $curveRangeY")

        println("strokeCountRange = $strokeCountRange")
        println("primaryPointCountRange = $primaryPointCountRange")
        println("secondaryPointCountRange = $secondaryPointCountRange")
        println()
    }

    fun digitGlyphGenerator(): GlyphGenerator {
        return GlyphGenerator(
                random,
                width=width,
                height=height,
                gridBorderProbabilityRange=gridBorderProbabilityRange,
                gridXProbabilityRange=gridXProbabilityRange,
                gridYProbabilityRange=gridYProbabilityRange,
                gridCellProbabilityRange=gridCellProbabilityRange,

                hasStartBaseline=hasStartBaseline,
                hasEndBaseline=hasEndBaseline,
                baselineY=baselineY,

                curveProbability=randomDelta(random, curveProbability, -0.3, 0.3, 0.0, 1.0),
                curveContinuousProbability=randomDelta(random, curveProbability, -0.3, 0.3, 0.0, 1.0),
                curveUseGridProbability=random.nextDouble(),
                curveRangeX=curveRangeX,
                curveRangeY=curveRangeY,

                strokeCountRange=strokeCountRange.first .. strokeCountRange.last/2,
                primaryPointCountRange=primaryPointCountRange.first .. Math.max(primaryPointCountRange.last/2, 2),
                secondaryPointCountRange=secondaryPointCountRange)
    }

    fun punctuationGlyphGenerator(): GlyphGenerator {
        return GlyphGenerator(
                random,
                width=width,
                height=height,
                gridBorderProbabilityRange=gridBorderProbabilityRange,
                gridXProbabilityRange=gridXProbabilityRange,
                gridYProbabilityRange=gridYProbabilityRange,
                gridCellProbabilityRange=gridCellProbabilityRange,

                hasStartBaseline=false,
                hasEndBaseline=false,
                baselineY=baselineY,

                curveProbability=curveProbability,
                curveContinuousProbability=curveContinuousProbability,
                curveUseGridProbability=curveUseGridProbability,
                curveRangeX=curveRangeX,
                curveRangeY=curveRangeY,

                strokeCountRange=randomPick(random, 1, 1, 1, 2) .. randomPick(random, 1, 2, 2, 2),
                primaryPointCountRange=2 .. randomPick(random, 2, 2, 2, 3),
                secondaryPointCountRange=randomPick(random, 1, 2, 2) .. 2)
    }

    fun operatorGlyphGenerator(): GlyphGenerator {
        return GlyphGenerator(
                random,
                width=width,
                height=height,
                gridBorderProbabilityRange=gridBorderProbabilityRange,
                gridXProbabilityRange=gridXProbabilityRange,
                gridYProbabilityRange=gridYProbabilityRange,
                gridCellProbabilityRange=gridCellProbabilityRange,

                hasStartBaseline=false,
                hasEndBaseline=false,
                baselineY=baselineY,

                curveProbability=curveProbability,
                curveUseGridProbability=curveUseGridProbability,
                curveRangeX=curveRangeX,
                curveRangeY=curveRangeY,

                strokeCountRange=randomPick(random, 1, 2) .. randomPick(random, 1, 2, 2, 3),
                primaryPointCountRange=randomPick(random, 2, 3) .. randomPick(random, 2, 3),
                secondaryPointCountRange=randomPick(random, 1, 2, 3) .. 2)
    }

    fun create(): Glyph {
        val strokes = mutableListOf<Stroke>()
        val strokeCount = randomInt(random, strokeCountRange)

        val baselineStartStrokeIndex = 0
        val baselineEndStrokeIndex = randomInt(random, 0, strokeCount-1)

        for (strokeIndex in 0 until strokeCount) {
            val points = mutableListOf<Point>()
            val pointCount = randomInt(random, if (strokeIndex == 0) primaryPointCountRange else secondaryPointCountRange)

            for (pointIndex in 0 until pointCount) {
                if (hasStartBaseline) {
                    if (strokeIndex == baselineStartStrokeIndex && pointIndex == 0) {
                        //points.add(nextBaselineStartPoint(-1, 0))
                        points.add(nextBaselineStartPoint())
                    }
                }

                points.add(nextPoint())

                if (hasEndBaseline) {
                    if (strokeIndex == baselineEndStrokeIndex && pointIndex == pointCount-1) {
                        points.add(nextBaselineEndPoint())
                        //points.add(nextBaselineEndPoint(1, 0))
                    }
                }
            }

            strokes.add(Stroke(points))
        }

        return Glyph(width, height, strokes)
    }

    fun createSpace(): Glyph {
        return Glyph(width, height, listOf())
    }

    fun createBrackets(): List<Glyph> {
        val openGlyph = create()
        val closeGlyph = createMirror(openGlyph)
        return listOf(openGlyph, closeGlyph)
    }

    private fun createMirror(sourceGlyph: Glyph): Glyph {
        val strokes = mutableListOf<Stroke>()
        for (sourceStroke in sourceGlyph.strokes) {
            val points = mutableListOf<Point>()

            for (sourcePoint in sourceStroke.points) {
                val point = Point(
                        x = width - sourcePoint.x,
                        y = sourcePoint.y,
                        bezierStartX = width - sourcePoint.bezierStartX,
                        bezierStartY = sourcePoint.bezierStartY,
                        bezierEndX = width - sourcePoint.bezierEndX,
                        bezierEndY = sourcePoint.bezierEndY)
                points.add(point)
            }

            strokes.add(Stroke(points))
        }

        return Glyph(sourceGlyph.width, sourceGlyph.height, strokes)
    }

    private fun nextBaselineStartPoint(deltaX: Int = 0, deltaY: Int = 0): Point {
        val x = 0 + deltaX
        val y = baselineY + deltaY

        if (random.nextDouble() < curveProbability) {
            return Point(x, y, x+1, y,x-1, y)
        } else {
            return Point(x, y)
        }
    }

    private fun nextBaselineEndPoint(deltaX: Int = 0, deltaY: Int = 0): Point {
        val x = width + deltaX
        val y = baselineY + deltaY

        if (random.nextDouble() < curveProbability) {
            return Point(x, y, x+1, y,x-1, y)
        } else {
            return Point(x, y)
        }
    }

    private fun nextPoint(): Point {
        val gridWidth = width + 1
        val gridHeight = height + 1

        val randomGridIndex = randomGridIndex()
        val x = randomGridIndex % gridWidth
        val y = randomGridIndex / gridWidth

        if (random.nextDouble() < curveProbability) {
            if (random.nextDouble() < curveUseGridProbability) {
                val bezierStartGridIndex = randomGridIndex()
                val bezierStartX = if (isGridBorderY(y)) x else bezierStartGridIndex % gridWidth
                val bezierStartY = if (isGridBorderX(x)) y else bezierStartGridIndex / gridWidth
                if (random.nextDouble() < curveContinuousProbability) {
                    val bezierSymmetricEndX = x + x - bezierStartX
                    val bezierSymmetricEndY = y + y - bezierStartY
                    if (isValidGrid(bezierSymmetricEndX, bezierSymmetricEndY)) {
                        return Point(x, y, bezierStartX, bezierStartY, bezierSymmetricEndX, bezierSymmetricEndY)
                    }
                }
                val bezierEndGridIndex = randomGridIndex()
                val bezierEndX = bezierEndGridIndex % gridWidth
                val bezierEndY = bezierEndGridIndex / gridWidth
                return Point(x, y, bezierStartX, bezierStartY, bezierEndX, bezierEndY)
            } else {
                val bezierStartX = if (isGridBorderY(y)) x else clamp(x + randomInt(random, curveRangeX, false), 0, gridWidth)
                val bezierStartY = if (isGridBorderX(x)) y else clamp(y + randomInt(random, curveRangeY, false), 0, gridHeight)
                if (random.nextDouble() < curveContinuousProbability) {
                    val bezierSymmetricEndX = x + x - bezierStartX
                    val bezierSymmetricEndY = y + y - bezierStartY
                    if (isValidGrid(bezierSymmetricEndX, bezierSymmetricEndY)) {
                        return Point(x, y, bezierStartX, bezierStartY, bezierSymmetricEndX, bezierSymmetricEndY)
                    }
                }
                val bezierEndX = if (isGridBorderY(y)) x else clamp(x + randomInt(random, curveRangeX, false), 0, gridWidth)
                val bezierEndY = if (isGridBorderX(x)) y else clamp(y + randomInt(random, curveRangeY, false), 0, gridHeight)
                return Point(x, y, bezierStartX, bezierStartY, bezierEndX, bezierEndY)
            }
        } else {
            return Point(x, y)
        }
    }

    private fun isGridBorder(x: Int, y: Int): Boolean {
        return (x == 0 || x == width + 1) && (y == 0 || y == height + 1)
    }

    private fun isGridBorderX(x: Int): Boolean {
        return x == 0 || x == width + 1
    }

    private fun isGridBorderY(y: Int): Boolean {
        return y == 0 || y == height + 1
    }

    private fun isValidGrid(x: Int, y: Int): Boolean {
        return x in 0..width && y in 0..height
    }

    private fun randomGridIndex(): Int {
        val r = random.nextDouble() * totalGridProbability
        for (i in gridProbabilities.indices) {
            if (r < gridProbabilities[i]) {
                return i
            }
        }
        return 0
    }
}

class FontGenerator(val glyphGenerator: GlyphGenerator) {

    val knownGlyphs = mutableSetOf<Glyph>()
    val glyphToImageConverter = GlyphToImageConverter(widthStep = 5, heightStep = 5, strokeWidth = 2f)
    val knownImages = mutableSetOf<String>()

    fun create(): Font {
        val glyphsMap = mutableMapOf<String, Glyph>()
        for(key in listOf("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z")) {
            glyphsMap[key] = createGlyph(glyphGenerator)
        }
        
        val digitGlyphGenerator = glyphGenerator.digitGlyphGenerator()
        for(key in listOf("0", "1", "2", "3", "4", "5", "6", "7", "8", "9")) {
            glyphsMap[key] = createGlyph(digitGlyphGenerator)
        }

        val punctuationGlyphGenerator = glyphGenerator.punctuationGlyphGenerator()
        for(key in listOf("_point", "_comma", "_colon", "_semicolon", "_exclamation", "_question")) {
            glyphsMap[key] = createGlyph(punctuationGlyphGenerator)
        }

        val operatorGlyphGenerator = glyphGenerator.operatorGlyphGenerator()
        for(key in listOf("_plus", "_minus", "_mult", "_div", "_equal")) {
            glyphsMap[key] = createGlyph(operatorGlyphGenerator)
        }
        for(key in listOf("_square_bracket", "_round_bracket", "_curly_bracket")) {
            val bracketGlyphs = createBracketGlyphs(operatorGlyphGenerator)
            glyphsMap["_open$key"] = bracketGlyphs[0]
            glyphsMap["_close$key"] = bracketGlyphs[1]
        }

        glyphsMap["_space"] = glyphGenerator.createSpace()

        return Font(glyphsMap)
    }

    private fun createGlyph(glyphGenerator: GlyphGenerator): Glyph {
        for (i in 0..1000) {
            val glyph = glyphGenerator.create()
            if (!knownGlyphs.contains(glyph)) {
                val image = convertImageToString(glyphToImageConverter.convert(glyph))

                if (!knownImages.contains(image)) {
                    knownGlyphs.add(glyph)
                    knownImages.add(image)
                    return glyph
                }
            }
        }
        throw IllegalArgumentException("Failed to generate distinct glyph.\n$knownGlyphs" )
    }

    private fun createBracketGlyphs(glyphGenerator: GlyphGenerator): List<Glyph> {
        for (i in 0..1000) {
            val bracketGlyphs = glyphGenerator.createBrackets()

            val bracketImages = mutableListOf<String>()
            for (bracketGlyph in bracketGlyphs) {
                if (!knownGlyphs.contains(bracketGlyph)) {
                    val image = convertImageToString(glyphToImageConverter.convert(bracketGlyph))

                    if (!knownImages.contains(image) && !bracketImages.contains(image)) {
                        bracketImages.add(image)
                    }
                }
            }
            if (bracketImages.size == bracketGlyphs.size) {
                knownGlyphs.addAll(bracketGlyphs)
                knownImages.addAll(bracketImages)
                return bracketGlyphs
            }
        }
        throw IllegalArgumentException("Failed to generate distinct bracket glyphs.\n$knownGlyphs" )
    }

    private fun checkGlyph(glyph: Glyph) {

    }

    private fun convertImageToString(image: BufferedImage): String {
        val result = StringBuilder()
        for (y in 0 until image.height) {
            for (x in 0 until image.width) {
                val rgb = image.getRGB(x, y)
                if (rgb == 0) {
                    result.append(' ')
                } else {
                    result.append('X')
                }
            }
            result.append("\n")
        }
        return result.toString()
    }
}

class GlyphToImageConverter(
        val widthStep: Int = 10,
        val heightStep: Int = 10,
        private val inset: Int = 4,
        private val insetLeft: Int = inset,
        private val insetRight: Int = inset,
        private val insetTop: Int = inset,
        private val insetBottom: Int = inset,
        val strokeWidth: Float = 3.0f,
        val debug: Boolean = false) {

    fun convert(glyph: Glyph): BufferedImage {
        val debugShapeSize = 9

        val width = glyph.width * widthStep + insetLeft + insetRight
        val height = glyph.height * heightStep + insetTop + insetBottom

        val image = BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB)

        val gc = image.createGraphics()
        gc.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON)

        if (debug) {
            gc.paint = Color.LIGHT_GRAY
            for (x in 0 .. glyph.width) {
                gc.drawLine(toX(x).toInt(), toY(0).toInt(), toX(x).toInt(), toY(height).toInt())
            }
            for (y in 0 .. glyph.height) {
                gc.drawLine(toX(0).toInt(), toY(y).toInt(), toX(width).toInt(), toY(y).toInt())
            }
        }

        for (stroke in glyph.strokes) {
            val path = GeneralPath()

            for (pointIndex in stroke.points.indices) {
                val point = stroke.points[pointIndex]

                if (debug) {
                    gc.paint = Color.RED
                    gc.fillOval(toX(point.x).toInt() - debugShapeSize/2, toY(point.y).toInt() - debugShapeSize/2, debugShapeSize, debugShapeSize)
                }

                if (pointIndex == 0) {
                    path.moveTo(toX(point.x), toY(point.y))
                } else if (point.isStraight) {
                    path.lineTo(toX(point.x), toY(point.y))
                } else {
                    val lastPoint = stroke.points[pointIndex-1]

                    if (debug) {
                        gc.paint = Color.BLUE
                        gc.drawLine(toX(point.x).toInt(), toY(point.y).toInt(), toX(lastPoint.bezierStartX).toInt(), toY(lastPoint.bezierStartY).toInt())
                        gc.fillOval(toX(lastPoint.bezierStartX).toInt() - debugShapeSize/2, toY(lastPoint.bezierStartY).toInt() - debugShapeSize/2, debugShapeSize, debugShapeSize)
                        gc.drawLine(toX(point.x).toInt(), toY(point.y).toInt(), toX(point.bezierEndX).toInt(), toY(point.bezierEndY).toInt())
                        gc.fillOval(toX(point.bezierEndX).toInt() - debugShapeSize/2, toY(point.bezierEndY).toInt() - debugShapeSize/2, debugShapeSize, debugShapeSize)
                    }
                    path.curveTo(
                            toX(lastPoint.bezierStartX), toY(lastPoint.bezierStartY),
                            toX(point.bezierEndX), toY(point.bezierEndY),
                            toX(point.x), toY(point.y))
                }
            }

            gc.paint = Color.BLACK
            gc.stroke = BasicStroke(strokeWidth, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND)

            gc.draw(path)
        }

        return image
    }

    private fun toX(x: Int) = x.toDouble() * widthStep + insetLeft
    private fun toY(y: Int) = y.toDouble() * heightStep + insetTop
}

private fun <T> randomPick(random: Random, vararg elements: T): T {
    val r = random.nextInt(elements.size)
    return elements[r]
}

private fun randomDelta(random: Random, value: Double, minDelta: Double, maxDelta: Double, min: Double, max: Double): Double {
    if (random.nextBoolean()) {
        val v = value + minDelta
        if (v in min..max) {
            return v
        }
    }

    return value + maxDelta
}

private fun randomInt(random: Random, range: IntRange, allowZero: Boolean = true): Int {
    return randomInt(random, range.first, range.last, allowZero)
}

private fun randomInt(random: Random, min: Int, max: Int, allowZero: Boolean = true): Int {
    if (min >= max) {
        return min
    }
    for (i in 0 .. 1000) {
        val r = random.nextInt(max - min) + min
        if (allowZero || r != 0) {
            return r
        }
    }
    throw IllegalArgumentException("No random value found: $min, $max")
}

private fun randomDouble(random: Random, range: ClosedFloatingPointRange<Double>): Double {
    return randomDouble(random, range.start, range.endInclusive)

}

private fun randomDouble(random: Random, min: Double, max: Double): Double {
    if (min >= max) {
        return min
    }
    return random.nextDouble() * (max - min) + min
}

private fun clamp(value: Int, min: Int, max: Int): Int {
    if (value < min) {
        return min
    }
    if (value > max) {
        return max
    }
    return value
}

private fun clamp(value: Double, min: Double, max: Double): Double{
    if (value < min) {
        return min
    }
    if (value > max) {
        return max
    }
    return value
}

fun save(image: RenderedImage, name: String) {
    try {
        val file = File("$name.png");
        ImageIO.write(image, "png", file);
    } catch (e: IOException) {
        e.printStackTrace()
    }
}

fun createExampleFonts(seed: Long = 0) {
    for (f in 1..9) {
        println("Generating font #$f")
        createExampleFont("docs/fonts/example$f", GlyphGenerator(Random(f.toLong() + seed)))
    }
}


fun createExampleReferenceFonts(seed: Long = 0) {
    createExampleFont("docs/fonts/exampleLatin", GlyphGenerator(Random(seed),
            width=5,
            height=3,
            gridBorderProbabilityRange=20.0 .. 20.0,
            gridXProbabilityRange=0.0 .. 0.0,
            gridYProbabilityRange=0.0 .. 0.0,
            gridCellProbabilityRange=1.0 .. 1.0,

            hasStartBaseline=false,
            hasEndBaseline=false,
            baselineY=0,

            curveProbability=0.3,
            curveContinuousProbability=0.3,
            curveUseGridProbability=0.9,
            curveRangeX=-5 .. 5,
            curveRangeY=-4 .. 4,

            strokeCountRange=2 .. 3,
            primaryPointCountRange= 2 .. 4,
            secondaryPointCountRange=2 .. 3))
}

fun createExampleFont(path: String, glyphGenerator: GlyphGenerator) {
    val fontGenerator = FontGenerator(glyphGenerator)
    val font = fontGenerator.create()

    val converter = GlyphToImageConverter()
    for(entry in font.glyphs) {
        val image = converter.convert(entry.value)
        save(image, "$path/${entry.key}")
    }
}

fun createLargeGlyph(seed: Long = 0) {
    val glyphGenerator = GlyphGenerator(
            Random(seed),
            width = 5,
            height = 5,
            gridBorderProbabilityRange = 10.0 .. 10.0,
            gridXProbabilityRange = 0.0 .. 0.0,
            gridYProbabilityRange = 0.0 .. 0.0,
            gridCellProbabilityRange = 0.0 .. 1.0,
            hasStartBaseline = true,
            baselineY = 1,
            curveProbability = 1.0,
            curveContinuousProbability=1.0,
            curveRangeX = -1 .. 1,
            curveRangeY = -1 .. 1,
            strokeCountRange = 2 .. 2,
            primaryPointCountRange = 4 .. 4,
            secondaryPointCountRange = 2 .. 2)

    val converter = GlyphToImageConverter(widthStep=100, heightStep=100, debug=true)

    val glyph = glyphGenerator.create()
    val image = converter.convert(glyph)

    save(image, "docs/glyphs/large_glyph")
}

fun main(args: Array<String>) {
    createExampleFonts()
    createExampleReferenceFonts()
    createLargeGlyph(0)
}


