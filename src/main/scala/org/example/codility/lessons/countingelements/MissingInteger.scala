package org.example.codility.lessons.countingelements

/**
  * This is a demo task.

Write a function:

object Solution { def solution(a: Array[Int]): Int }

that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.

For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.

Given A = [1, 2, 3], the function should return 4.

Given A = [−1, −3], the function should return 1.

Assume that:

N is an integer within the range [1..100,000];
each element of array A is an integer within the range [−1,000,000..1,000,000].
Complexity:

expected worst-case time complexity is O(N);
expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).*/

object MissingInteger {
  def solution(a: Array[Int]): Int = {
    var s: Set[Int] = a.toSet
    var i: Int = 1
    while (true) {
      if (!s.contains(i)) {
        return i
      }
      i += 1
    }
    -1
  }
}
