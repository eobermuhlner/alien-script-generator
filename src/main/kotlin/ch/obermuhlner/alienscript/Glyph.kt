package ch.obermuhlner.alienscript

data class Font(
        val glyphs: Map<String, Glyph>)

data class Glyph(
        val width: Int,
        val height: Int,
        val strokes: List<Stroke>)

data class Stroke(
        val points: List<Point>)

data class Point(
        val x: Int,
        val y: Int,
        val bezierStartX: Int = x,
        val bezierStartY: Int = y,
        val bezierEndX: Int = x,
        val bezierEndY: Int = y) {

    val isStraight
        get() = bezierStartX == x && bezierStartY == y && bezierEndX == x && bezierEndY == y
}

