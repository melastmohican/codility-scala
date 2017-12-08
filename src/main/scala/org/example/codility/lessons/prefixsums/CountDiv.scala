package org.example.codility.lessons.prefixsums

/**
  * Write a function:

object Solution { def solution(a: Int, b: Int, k: Int): Int }
that, given three integers A, B and K, returns the number of integers within the range [A..B] that are divisible by K, i.e.:

{ i : A ≤ i ≤ B, i mod K = 0 }
For example, for A = 6, B = 11 and K = 2, your function should return 3, because there are three numbers divisible by 2 within the range [6..11], namely 6, 8 and 10.

Assume that:

A and B are integers within the range [0..2,000,000,000];
K is an integer within the range [1..2,000,000,000];
A ≤ B.
Complexity:

expected worst-case time complexity is O(1);
expected worst-case space complexity is O(1).

  */
object CountDiv {
  def solution(a: Int, b: Int, k: Int): Int = (b / k - a / k) + (if(a % k == 0) 1 else 0)

  def solution1(a: Int, b: Int, k: Int): Int = {
    var counter = 0
    for(i <- a to b) {
      if (i % k == 0)
        counter += 1
    }
    counter
  }
}
