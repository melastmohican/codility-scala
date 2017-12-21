package org.example.codility.lessons.sieveeratosthenes

/**
  * You are given an array A consisting of N integers.

For each number A[i] such that 0 ≤ i < N, we want to count the number of elements of the array that are not the divisors of A[i]. We say that these elements are non-divisors.

For example, consider integer N = 5 and array A such that:

    A[0] = 3
    A[1] = 1
    A[2] = 2
    A[3] = 3
    A[4] = 6
For the following elements:

A[0] = 3, the non-divisors are: 2, 6,
A[1] = 1, the non-divisors are: 3, 2, 3, 6,
A[2] = 2, the non-divisors are: 3, 3, 6,
A[3] = 3, the non-divisors are: 2, 6,
A[4] = 6, there aren't any non-divisors.
Write a function:

object Solution { def solution(a: Array[Int]): Array[Int] }

that, given an array A consisting of N integers, returns a sequence of integers representing the amount of non-divisors.

The sequence should be returned as:

a structure Results (in C), or
a vector of integers (in C++), or
a record Results (in Pascal), or
an array of integers (in any other programming language).
For example, given:

    A[0] = 3
    A[1] = 1
    A[2] = 2
    A[3] = 3
    A[4] = 6
the function should return [2, 4, 3, 2, 0], as explained above.

Assume that:

N is an integer within the range [1..50,000];
each element of array A is an integer within the range [1..2 * N].
Complexity:

expected worst-case time complexity is O(N*log(N));
expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).
  */
object CountNonDivisible {


  def solution(a: Array[Int]): Array[Int] = {
    val d: Array[Array[Int]] = Array.ofDim[Int](2 * a.length + 1, 2)
    val res: Array[Int] = Array.ofDim[Int](a.length)
    for (i <- 0 until a.length) {
      d(a(i))(0) += 1
      d(a(i))(1) = -1
    }
    for (i <- 0 until a.length) {
      if (d(a(i))(1) == -1) {
        d(a(i))(1) = 0
        var j: Int = 1
        while (j * j <= a(i)) {
          if (a(i) % j == 0) {
            d(a(i))(1) += d(j)(0)
            if (a(i) / j != j) d(a(i))(1) += d(a(i) / j)(0)
          }
          j += 1
        }
      }
    }
    for (i <- 0 until a.length) {
      res(i) = a.length - d(a(i))(1)
    }
    res
  }
}
