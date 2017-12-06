package org.example.codility.lessons.iterations

import scala.annotation.tailrec

/**
  * A binary gap within a positive integer N is any maximal sequence of consecutive zeros that is surrounded by ones at both ends in the binary representation of N.
  **
  * For example, number 9 has binary representation 1001 and contains a binary gap of length 2. The number 529 has binary representation 1000010001 and contains two binary gaps: one of length 4 and one of length 3. The number 20 has binary representation 10100 and contains one binary gap of length 1. The number 15 has binary representation 1111 and has no binary gaps.
  **
  *Write a function:
  **
  *object Solution { def solution(n: Int): Int }
*that, given a positive integer N, returns the length of its longest binary gap. The function should return 0 if N doesn't contain a binary gap.
  **
 *For example, given N = 1041 the function should return 5, because N has binary representation 10000010001 and so its longest binary gap is of length 5.
  **
 *Assume that:
  **
 *N is an integer within the range [1..2,147,483,647].
*Complexity:
  **
 *expected worst-case time complexity is O(log(N));
*expected worst-case space complexity is O(1).
  */
object BinaryGap {

  /*def solution(n: Int): Int = {
    val list = "(?<=1)0+(?=1)".r.findAllIn(n.toBinaryString).toList
    if (list.isEmpty) 0
    else list.maxBy(_.length).length
  }*/


  def solution(n: Int): Int = {

    @tailrec
    def solve(n: Int, count: Int = 0, max: Int = 0, fl: Boolean = false): Int =
      (n % 2, fl) match {
        case _ if n <= 0 => math.max(count, max)
        case (0, false) => solve(n / 2, count, max, fl)
        case (0, true) => solve(n / 2, count + 1, max, fl)
        case (1, _) => solve(n / 2, 0, math.max(count, max), true)

      }

    solve(n)
  }
}


