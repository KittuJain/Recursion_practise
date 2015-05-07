
object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 5) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
        println()
    }
  }


  def pascal(col: Int, row: Int): Int = {
    var val1 = 0
    var val2 = 0
    if (col == 0 || col == row)
      return 1
    val1 = pascal(col - 1, row - 1)
    val2 = pascal(col, row - 1)
    val1 + val2
  }
}