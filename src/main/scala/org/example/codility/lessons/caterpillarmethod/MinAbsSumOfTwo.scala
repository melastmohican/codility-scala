package org.example.codility.lessons.caterpillarmethod

import scala.collection.Searching._

/**
  * Let A be a non-empty zero-indexed array consisting of N integers.

The abs sum of two for a pair of indices (P, Q) is the absolute value |A[P] + A[Q]|, for 0 ≤ P ≤ Q < N.

For example, the following array A:

  A[0] =  1
  A[1] =  4
  A[2] = -3
has pairs of indices (0, 0), (0, 1), (0, 2), (1, 1), (1, 2), (2, 2).
The abs sum of two for the pair (0, 0) is A[0] + A[0] = |1 + 1| = 2.
The abs sum of two for the pair (0, 1) is A[0] + A[1] = |1 + 4| = 5.
The abs sum of two for the pair (0, 2) is A[0] + A[2] = |1 + (−3)| = 2.
The abs sum of two for the pair (1, 1) is A[1] + A[1] = |4 + 4| = 8.
The abs sum of two for the pair (1, 2) is A[1] + A[2] = |4 + (−3)| = 1.
The abs sum of two for the pair (2, 2) is A[2] + A[2] = |(−3) + (−3)| = 6.
Write a function:

object Solution { def solution(a: Array[Int]): Int }

that, given a non-empty zero-indexed array A consisting of N integers, returns the minimal abs sum of two for any pair of indices in this array.

For example, given the following array A:

  A[0] =  1
  A[1] =  4
  A[2] = -3
the function should return 1, as explained above.

Given array A:

  A[0] = -8
  A[1] =  4
  A[2] =  5
  A[3] =-10
  A[4] =  3
the function should return |(−8) + 5| = 3.

Assume that:

N is an integer within the range [1..100,000];
each element of array A is an integer within the range [−1,000,000,000..1,000,000,000].
Complexity:

expected worst-case time complexity is O(N*log(N));
expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).
  */
object MinAbsSumOfTwo {

  // 100/100
  def solution(a: Array[Int]): Int = {
    var result: Int = Integer.MAX_VALUE
    val sa = a.sorted
    for (number <- sa) {
      var index: Int = sa.search(-number).insertionPoint
      if (index < 0) {
        index = -1 - index
      }
      if (index < sa.length) {
        result = math.min(result, math.abs(number + sa(index)))
      }
      if (index >= 1) {
        result = math.min(result, math.abs(number + sa(index - 1)))
      }
    }
    result
  }

  // 100/100
  def solution1(a: Array[Int]): Int = {
    def findBestMatch(target: Int, a: Array[Int]): Int = {
      if (a.length == 1) return a(0)
      var beg: Int = 0
      var end: Int = a.length - 1
      while (beg <= end) {
        val middle: Int = (beg + end) / 2
        if (a(middle) == target) a(middle)
        if (end - beg == 1) {
          return if (math.abs(a(end) - target) < math.abs(a(beg) - target)) a(end) else a(beg)
        }
        if (a(middle) > target) {
          end = middle
        } else {
          beg = middle
        }
      }
      a(0)
    }


    val sa = a.sorted
    var min: Int = Integer.MAX_VALUE
    for (i <- 0 until sa.length) {
      min = math.min(min, math.abs(sa(i) + findBestMatch(-sa(i), sa)))
    }
    min
  }

  // 100/100
  def solution2(a: Array[Int]): Int = {
    def getMinSum(a: Array[Int]): Int = {
      //all positives
      if (a(0) >= 0) return a(0) * 2
      //all negatives
      if (a(a.length - 1) <= 0) return -a(a.length - 1) * 2
      var front: Int = a.length - 1
      var back: Int = 0
      var min: Int = math.abs(a(back) + a(front))
      while (back <= front) {
        val tmp: Int = math.abs(a(back) + a(front))
        min = math.min(min, tmp)
        if (math.abs(a(back + 1) + a(front)) <= tmp)
          back += 1
        else if (Math.abs(a(back) + a(front - 1)) <= tmp) {
          front -= 1
        } else {
          back += 1
          front -= 1
        }
      }
      min
    }

    getMinSum(a.sorted)
  }

}
