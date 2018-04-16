package ch.obermuhlner.alienscript

data class Font(
        val glyphs: Map<String, Glyph>)

data class Glyph(
        val width: Int,
        val height: Int,
        val strokes: List<Stroke>)

data class Stroke (
        val points: List<Point>)

data class Point(
        val x: Int,
        val y: Int,
        val bezierStartX: Int = 0,
        val bezierStartY: Int = 0,
        val bezierEndX: Int = 0,
        val bezierEndY: Int = 0) {

    val isStraight
        get() = bezierStartX == 0 && bezierStartY == 0 && bezierEndX == 0 && bezierEndY == 0
}

