package org.example.codility.lessons.sorting

/**
  * Write a function

object Solution { def solution(a: Array[Int]): Int }
that, given a zero-indexed array A consisting of N integers, returns the number of distinct values in array A.

Assume that:

N is an integer within the range [0..100,000];
each element of array A is an integer within the range [−1,000,000..1,000,000].
For example, given array A consisting of six elements such that:

 A[0] = 2    A[1] = 1    A[2] = 1
 A[3] = 2    A[4] = 3    A[5] = 1
the function should return 3, because there are 3 distinct values appearing in array A, namely 1, 2 and 3.

Complexity:

expected worst-case time complexity is O(N*log(N));
expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).
  */
object Distinct {
  def solution(a: Array[Int]): Int = {
    if (a.length == 0) return 0

    val sorted = a.sorted
    var distinct = 1
    for (ind <- 1 until sorted.length) {
      if (sorted(ind - 1) != sorted(ind)) {
        distinct += 1
      }
    }
    return distinct
  }

  def solution1(a: Array[Int]): Int = {
    var distinct = Set[Int]()
    for (number <- a) {
      distinct += number
    }
    distinct.size
  }

  def solution2(a: Array[Int]): Int = {
    a.toList.distinct.length
  }
}
