package org.example.codility.lessons.euclideanalgorithm

import scala.annotation.tailrec
import scala.util.control.Breaks._

/**
  * A prime is a positive integer X that has exactly two distinct divisors: 1 and X. The first few prime integers are 2, 3, 5, 7, 11 and 13.

A prime D is called a prime divisor of a positive integer P if there exists a positive integer K such that D * K = P. For example, 2 and 5 are prime divisors of 20.

You are given two positive integers N and M. The goal is to check whether the sets of prime divisors of integers N and M are exactly the same.

For example, given:

N = 15 and M = 75, the prime divisors are the same: {3, 5};
N = 10 and M = 30, the prime divisors aren't the same: {2, 5} is not equal to {2, 3, 5};
N = 9 and M = 5, the prime divisors aren't the same: {3} is not equal to {5}.
Write a function:

object Solution { def solution(a: Array[Int], b: Array[Int]): Int }

that, given two non-empty zero-indexed arrays A and B of Z integers, returns the number of positions K for which the prime divisors of A[K] and B[K] are exactly the same.

For example, given:

    A[0] = 15   B[0] = 75
    A[1] = 10   B[1] = 30
    A[2] = 3    B[2] = 5
the function should return 1, because only one pair (15, 75) has the same set of prime divisors.

Assume that:

Z is an integer within the range [1..6,000];
each element of arrays A, B is an integer within the range [1..2,147,483,647].
Complexity:

expected worst-case time complexity is O(Z*log(max(A)+max(B))2);
expected worst-case space complexity is O(1), beyond input storage (not counting the storage required for input arguments).
  */
object CommonPrimeDivisors {
  def solution(a: Array[Int], b: Array[Int]): Int = {
    var result = 0
    for (i <- 0 until a.length) {
      if (same(a(i), b(i))) result += 1
    }
    result
  }

  @tailrec
  def gcd(x: Int, y: Int): Int = if (y == 0) x else gcd(y, x % y)

  def same(x: Int, y: Int): Boolean = {
    if (x == y) return true

    else if (x > y) same(y, x)
    else {
      val gec = gcd(x, y)
      if (gec == 1) return false

      var a = x
      breakable {
        while (a != 1) {
          val gecd = gcd(a, gec)
          if (gecd == 1) break
          a /= gecd
        }
      }

      if (a != 1) return false

      var b = y
      breakable {
        while (b != 1) {
          val gecd = gcd(b, gec)
          if (gecd == 1) break
          b /= gecd
        }
      }

      return b == 1
    }
  }
}
