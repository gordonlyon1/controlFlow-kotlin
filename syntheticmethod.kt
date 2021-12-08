fun main() {
    val colors: Array<Color> = Color.values()
    colors.forEach { color ->
        print(color)
    }
}
}

enum class Color (val value: Int) {
  RED(0xFF0000),
  BLUE(0X131323)
}