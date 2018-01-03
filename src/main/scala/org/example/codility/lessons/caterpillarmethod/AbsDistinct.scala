package org.example.codility.lessons.caterpillarmethod

/**
  * A non-empty zero-indexed array A consisting of N numbers is given. The array is sorted in non-decreasing order. The absolute distinct count of this array is the number of distinct absolute values among the elements of the array.

For example, consider array A such that:

  A[0] = -5
  A[1] = -3
  A[2] = -1
  A[3] =  0
  A[4] =  3
  A[5] =  6
The absolute distinct count of this array is 5, because there are 5 distinct absolute values among the elements of this array, namely 0, 1, 3, 5 and 6.

Write a function:

object Solution { def solution(a: Array[Int]): Int }

that, given a non-empty zero-indexed array A consisting of N numbers, returns absolute distinct count of array A.

For example, given array A such that:

  A[0] = -5
  A[1] = -3
  A[2] = -1
  A[3] =  0
  A[4] =  3
  A[5] =  6
the function should return 5, as explained above.

Assume that:

N is an integer within the range [1..100,000];
each element of array A is an integer within the range [−2,147,483,648..2,147,483,647];
array A is sorted in non-decreasing order.
Complexity:

expected worst-case time complexity is O(N);
expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).

  */
object AbsDistinct {

  def solution(a: Array[Int]): Int = a.map(math.abs(_)).distinct.length

  def solution1(a: Array[Int]): Int = {
    var dups: Int = 0
    for (i <- 0 until a.length if a(i) < 0) a(i) = -a(i)
    val s = a.sorted
    for (i <- 1 until s.length if s(i) == s(i - 1)) dups += 1
    a.length - dups
  }

  def solution2(a: Array[Int]): Int = {
    var absDistinctNum: Int = 0
    var previous: Long = Long.MaxValue
    var left: Int = 0
    var right: Int = a.length - 1
    while (left <= right) {
      val leftAbs: Long = math.abs(a(left).toLong)
      val rightAbs: Long = math.abs(a(right).toLong)
      var current: Long = 0l
      if (leftAbs >= rightAbs) {
        current = leftAbs
        left += 1
      } else {
        current = rightAbs
        right -= 1
      }
      if (current != previous) {
        absDistinctNum += 1
      }
      previous = current
    }
    absDistinctNum
  }

}
