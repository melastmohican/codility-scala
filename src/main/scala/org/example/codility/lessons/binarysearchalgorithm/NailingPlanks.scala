package org.example.codility.lessons.binarysearchalgorithm

/**
  * You are given two non-empty zero-indexed arrays A and B consisting of N integers. These arrays represent N planks. More precisely, A[K] is the start and B[K] the end of the K−th plank.

Next, you are given a non-empty zero-indexed array C consisting of M integers. This array represents M nails. More precisely, C[I] is the position where you can hammer in the I−th nail.

We say that a plank (A[K], B[K]) is nailed if there exists a nail C[I] such that A[K] ≤ C[I] ≤ B[K].

The goal is to find the minimum number of nails that must be used until all the planks are nailed. In other words, you should find a value J such that all planks will be nailed after using only the first J nails. More precisely, for every plank (A[K], B[K]) such that 0 ≤ K < N, there should exist a nail C[I] such that I < J and A[K] ≤ C[I] ≤ B[K].

For example, given arrays A, B such that:

    A[0] = 1    B[0] = 4
    A[1] = 4    B[1] = 5
    A[2] = 5    B[2] = 9
    A[3] = 8    B[3] = 10
four planks are represented: [1, 4], [4, 5], [5, 9] and [8, 10].

Given array C such that:

    C[0] = 4
    C[1] = 6
    C[2] = 7
    C[3] = 10
    C[4] = 2
if we use the following nails:

0, then planks [1, 4] and [4, 5] will both be nailed.
0, 1, then planks [1, 4], [4, 5] and [5, 9] will be nailed.
0, 1, 2, then planks [1, 4], [4, 5] and [5, 9] will be nailed.
0, 1, 2, 3, then all the planks will be nailed.
Thus, four is the minimum number of nails that, used sequentially, allow all the planks to be nailed.

Write a function:

object Solution { def solution(a: Array[Int], b: Array[Int], c: Array[Int]): Int }

that, given two non-empty zero-indexed arrays A and B consisting of N integers and a non-empty zero-indexed array C consisting of M integers, returns the minimum number of nails that, used sequentially, allow all the planks to be nailed.

If it is not possible to nail all the planks, the function should return −1.

For example, given arrays A, B, C such that:

    A[0] = 1    B[0] = 4
    A[1] = 4    B[1] = 5
    A[2] = 5    B[2] = 9
    A[3] = 8    B[3] = 10

    C[0] = 4
    C[1] = 6
    C[2] = 7
    C[3] = 10
    C[4] = 2
the function should return 4, as explained above.

Assume that:

N and M are integers within the range [1..30,000];
each element of arrays A, B, C is an integer within the range [1..2*M];
A[K] ≤ B[K].
Complexity:

expected worst-case time complexity is O((N+M)*log(M));
expected worst-case space complexity is O(M), beyond input storage (not counting the storage required for input arguments).

  */
object NailingPlanks {
  def solution(a: Array[Int], b: Array[Int], c: Array[Int]): Int = {
    def minIndex(a: Int, b: Int, nails: Array[Array[Int]], oldRes: Int): Int = {
      var beg: Int = 0
      var end: Int = nails.length - 1
      var result: Int = -1
      while (beg <= end) {
        val middle: Int = (beg + end) / 2
        if (nails(middle)(0) < a) {
          beg = middle + 1
        } else if (nails(middle)(0) > b) {
          end = middle - 1
        } else {
          end = middle - 1
          result = middle
        }
      }
      if (result == -1 || nails(result)(0) > b) return -1
      var min: Int = nails(result)(1)
      while (result < nails.length && nails(result)(0) <= b) {
        min = Math.min(min, nails(result)(1))
        if (min <= oldRes) return oldRes
        result += 1
      }
      min
    }

    val n: Int = a.length
    val m: Int = c.length
    var nails: Array[Array[Int]] = Array.ofDim[Int](m, 2)
    for (i <- 0 until m) {
      nails(i)(0) = c(i)
      nails(i)(1) = i
    }
    var sortedNails = nails.sortBy(_ (0))
    var result: Int = 0
    for (i <- 0 until n) {
      result = minIndex(a(i), b(i), sortedNails, result)
      if (result == -1) return -1
    }
    result + 1
  }
}
