package org.example.codility.lessons.binarysearchalgorithm

import scala.util.control.Breaks._

/**
  * You are given integers K, M and a non-empty zero-indexed array A consisting of N integers. Every element of the array is not greater than M.

You should divide this array into K blocks of consecutive elements. The size of the block is any integer between 0 and N. Every element of the array should belong to some block.

The sum of the block from X to Y equals A[X] + A[X + 1] + ... + A[Y]. The sum of empty block equals 0.

The large sum is the maximal sum of any block.

For example, you are given integers K = 3, M = 5 and array A such that:

  A[0] = 2
  A[1] = 1
  A[2] = 5
  A[3] = 1
  A[4] = 2
  A[5] = 2
  A[6] = 2
The array can be divided, for example, into the following blocks:

[2, 1, 5, 1, 2, 2, 2], [], [] with a large sum of 15;
[2], [1, 5, 1, 2], [2, 2] with a large sum of 9;
[2, 1, 5], [], [1, 2, 2, 2] with a large sum of 8;
[2, 1], [5, 1], [2, 2, 2] with a large sum of 6.
The goal is to minimize the large sum. In the above example, 6 is the minimal large sum.

Write a function:

object Solution { def solution(k: Int, m: Int, a: Array[Int]): Int }

that, given integers K, M and a non-empty zero-indexed array A consisting of N integers, returns the minimal large sum.

For example, given K = 3, M = 5 and array A such that:

  A[0] = 2
  A[1] = 1
  A[2] = 5
  A[3] = 1
  A[4] = 2
  A[5] = 2
  A[6] = 2
the function should return 6, as explained above.

Assume that:

N and K are integers within the range [1..100,000];
M is an integer within the range [0..10,000];
each element of array A is an integer within the range [0..M].
Complexity:

expected worst-case time complexity is O(N*log(N+M));
expected worst-case space complexity is O(1), beyond input storage (not counting the storage required for input arguments).

  */
object MinMaxDivision {
  def solution(k: Int, m: Int, a: Array[Int]): Int = {
    val n: Long = a.length.toLong
    var max: Long = n * m
    var min: Long = 0
    var result: Long = 0
    while (min <= max) {
      val mid: Long = (min + max) / 2
      var count = 0
      var sum: Long = 0
      breakable {
        for (ele <- a) {
          sum += ele
          if (ele > mid) {
            count = k + 1
            break
          }
          if (sum > mid) {
            count += 1
            sum = ele
          }
        }
      }
      count += 1
      if (count <= k) {
        max = mid - 1
        result = mid
      }
      else min = mid + 1
    }
    result.toInt
  }

  def solution1(k: Int, m: Int, a: Array[Int]): Int = {
    def countBlocks(a: Array[Int], largeSum: Int): Int = {
      var blockNum: Int = 1
      var remain: Int = largeSum
      for (number <- a) {
        if (remain < number) {
          remain = largeSum
          blockNum += 1
        }
        remain -= number
      }
      blockNum
    }

    var result: Int = -1
    var lower: Int = max(a)
    var upper: Int = sum(a)
    while (lower <= upper) {
      val middle: Int = (lower + upper) / 2
      if (countBlocks(a, middle) <= k) {
        result = middle
        upper = middle - 1
      } else {
        lower = middle + 1
      }
    }
    result
  }

  def max(a: Array[Int]): Int = {
    var result: Int = Integer.MIN_VALUE
    for (number <- a) {
      result = math.max(result, number)
    }
    result
  }

  def sum(a: Array[Int]): Int = {
    var result: Int = 0
    for (number <- a) {
      result += number
    }
    result
  }

}
