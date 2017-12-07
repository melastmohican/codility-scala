package org.example.codility.lessons.timecomplexity

/**
  * A zero-indexed array A consisting of N different integers is given. The array contains integers in the range [1..(N + 1)], which means that exactly one element is missing.

Your goal is to find that missing element.

Write a function:

object Solution { def solution(a: Array[Int]): Int }

that, given a zero-indexed array A, returns the value of the missing element.

For example, given array A such that:

  A[0] = 2
  A[1] = 3
  A[2] = 1
  A[3] = 5
the function should return 4, as it is the missing element.

Assume that:

N is an integer within the range [0..100,000];
the elements of A are all distinct;
each element of array A is an integer within the range [1..(N + 1)].
Complexity:

expected worst-case time complexity is O(N);
expected worst-case space complexity is O(1), beyond input storage (not counting the storage required for input arguments).


  */
object PermMissingElem {
  // 80%
  def solution1(a: Array[Int]): Int = {
    val n = a.length + 1
    val expectedSum: Int = (n * (n + 1)) / 2
    val actualSum: Int = a.sum
    expectedSum - actualSum
  }

  def solution(a: Array[Int]): Int = {
    val n = a.length
    var missing = (n + 1L) * (n + 2) / 2
    for (element <- a) {
      missing -= element
    }
    missing.toInt
  }
}
