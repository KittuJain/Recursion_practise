
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
    if (col == 0 || col == row) 1
    else pascal(col - 1, row - 1) + pascal(col, row - 1)
  }

  def balance(chars: List[Char]): Boolean = {
    def isBalanced(chars: List[Char], openNumBrac: Int): Boolean = {
      if (chars.isEmpty) openNumBrac == 0
      else {
        val head = chars.head
        val numOfBrackets =
          if (head == '(') openNumBrac + 1
          else if (head == ')') openNumBrac - 1
          else openNumBrac
        if (numOfBrackets >= 0) isBalanced(chars.tail, numOfBrackets)
        else false
      }
    }
    isBalanced(chars, 0)
  }


}