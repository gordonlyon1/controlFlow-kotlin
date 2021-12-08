fun main() {
  val red : Color = Color.RED

  print(red)
}

enum class Color(val value: Int) {
  RED(0xFF0000) {
    override fun printValue() {
      println("value of RED is $value")
    }
  },
  BLUE(0x0000FF){
    override fun printValue(){
      println("value of BLUE is $value")
    }
  };

  abstract fun printValue()
}