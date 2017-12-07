package org.example.codility.lessons.arrays

/**
  * A zero-indexed array A consisting of N integers is given. Rotation of the array means that each element is shifted right by one index, and the last element of the array is moved to the first place. For example, the rotation of array A = [3, 8, 9, 7, 6] is [6, 3, 8, 9, 7] (elements are shifted right by one index and 6 is moved to the first place).

The goal is to rotate array A K times; that is, each element of A will be shifted to the right K times.

Write a function:

object Solution { def solution(a: Array[Int], k: Int): Array[Int] }
that, given a zero-indexed array A consisting of N integers and an integer K, returns the array A rotated K times.

For example, given

    A = [3, 8, 9, 7, 6]
    K = 3
the function should return [9, 7, 6, 3, 8]. Three rotations were made:

    [3, 8, 9, 7, 6] -> [6, 3, 8, 9, 7]
    [6, 3, 8, 9, 7] -> [7, 6, 3, 8, 9]
    [7, 6, 3, 8, 9] -> [9, 7, 6, 3, 8]
For another example, given

    A = [0, 0, 0]
    K = 1
the function should return [0, 0, 0]

Given

    A = [1, 2, 3, 4]
    K = 4
the function should return [1, 2, 3, 4]

Assume that:

N and K are integers within the range [0..100];
each element of array A is an integer within the range [−1,000..1,000].
In your solution, focus on correctness. The performance of your solution will not be the focus of the assessment.
  */
object CyclicRotation {

  // Brute Force
  def solution(a: Array[Int], k: Int): Array[Int] = {
    if (a.length > 0) {
      var temp: Int = 0
      var previous: Int = 0
      for (i <- 0 until k) {
        previous = a(a.length - 1)
        for (j <- 0 until a.length) {
          temp = a(j)
          a(j) = previous
          previous = temp
        }
      }
    }
    a
  }

  // Using Extra Array
  def solution1(a: Array[Int], k: Int): Array[Int] = {
    val result: Array[Int] = Array.ofDim[Int](a.length)
    for (i <- 0 until a.length) {
      result((i + k) % a.length) = a(i)
    }
    result
  }

  // Cyclic Replacements
  def solution2(a: Array[Int], k: Int): Array[Int] = {
    var count: Int = 0
    var start: Int = 0
    while (count < a.length) {
      var current: Int = start
      var prev: Int = a(start)
      do {
        val next: Int = (current + k % a.length) % a.length
        val temp: Int = a(next)
        a(next) = prev
        prev = temp
        current = next
        count += 1
      } while (start != current)
      start += 1
    }
    a
  }

  // Reverse
  def solution3(a: Array[Int], k: Int): Array[Int] = {
    reverse(a, 0, a.length - 1)
    reverse(a, 0, (k % a.length) - 1)
    reverse(a, k % a.length, a.length - 1)
    a
  }

  def reverse(a: Array[Int], start: Int, end: Int): Unit = {
    var s = start
    var e = end
    while (s < e) {
      val temp: Int = a(s)
      a(s) = a(e)
      a(e) = temp
      s += 1
      e -= 1
    }
  }
}


