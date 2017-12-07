package org.example.codility.lessons.timecomplexity

import scala.annotation.tailrec

/**
  * A non-empty zero-indexed array A consisting of N integers is given. Array A represents numbers on a tape.
 **
 Any integer P, such that 0 < P < N, splits this tape into two non-empty parts: A[0], A[1], ..., A[P − 1] and A[P], A[P + 1], ..., A[N − 1].
 **
 The difference between the two parts is the value of: |(A[0] + A[1] + ... + A[P − 1]) − (A[P] + A[P + 1] + ... + A[N − 1])|
 **
 In other words, it is the absolute difference between the sum of the first part and the sum of the second part.
 **
 For example, consider array A such that:
 **
 A[0] = 3
  *A[1] = 1
  *A[2] = 2
  *A[3] = 4
  *A[4] = 3
*We can split this tape in four places:
 **
 P = 1, difference = |3 − 10| = 7
*P = 2, difference = |4 − 9| = 5
*P = 3, difference = |6 − 7| = 1
*P = 4, difference = |10 − 3| = 7
*Write a function:
 **
 object Solution { def solution(a: Array[Int]): Int }
 **
 that, given a non-empty zero-indexed array A of N integers, returns the minimal difference that can be achieved.
 **
 For example, given:
 **
 A[0] = 3
  *A[1] = 1
  *A[2] = 2
  *A[3] = 4
  *A[4] = 3
*the function should return 1, as explained above.
 **
 Assume that:
 **
 N is an integer within the range [2..100,000];
*each element of array A is an integer within the range [−1,000..1,000].
*Complexity:
 **
 expected worst-case time complexity is O(N);
*expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).
  */
object TapeEquilibrium {
  def solution(a: Array[Int]): Int = {
    var res: Int = Integer.MAX_VALUE
    var tmp: Int = 0
    var sum: Int = 0
    for (i <- 0 until a.length) {
      sum += a(i)
    }
    for (i <- 0 until a.length - 1) {
      tmp += a(i)
      res = Math.min(res, Math.abs(tmp - (sum - tmp)))
    }
    res
  }

  def solutionR(a: Array[Int]): Int = {
    if (a.length < 2) return Integer.MAX_VALUE
    val sum = a.sum

    def diff(sumLeft: Int, sumRight: Int): Int = Math.abs(sumLeft - sumRight)

    @tailrec
    def equilibrium(P: Int, sumLeft: Int, curMin: Int): Int =
      if (P == a.length) curMin
      else equilibrium(P + 1, sumLeft + a(P - 1), Math.min(curMin, diff(sumLeft, sum - sumLeft)))

    equilibrium(2, a(0), diff(a(0), sum - a(0)))
  }
}
