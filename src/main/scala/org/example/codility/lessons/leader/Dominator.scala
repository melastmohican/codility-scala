package org.example.codility.lessons.leader

import scala.annotation.tailrec
import scala.collection.mutable

/**
  * A zero-indexed array A consisting of N integers is given. The dominator of array A is the value that occurs in more than half of the elements of A.
  **
  * For example, consider array A such that
  **
  *A[0] = 3    A[1] = 4    A[2] =  3
  *A[3] = 2    A[4] = 3    A[5] = -1
  *A[6] = 3    A[7] = 3
  *The dominator of A is 3 because it occurs in 5 out of 8 elements of A (namely in those with indices 0, 2, 4, 6 and 7) and 5 is more than a half of 8.
  **
  *Write a function
  **
 *object Solution { def solution(a: Array[Int]): Int }
  **
 *that, given a zero-indexed array A consisting of N integers, returns index of any element of array A in which the dominator of A occurs. The function should return −1 if array A does not have a dominator.
  **
 *Assume that:
  **
 *N is an integer within the range [0..100,000];
*each element of array A is an integer within the range [−2,147,483,648..2,147,483,647].
*For example, given array A such that
 **
 *A[0] = 3    A[1] = 4    A[2] =  3
 *A[3] = 2    A[4] = 3    A[5] = -1
 *A[6] = 3    A[7] = 3
*the function may return 0, 2, 4, 6 or 7, as explained above.
 **
 *Complexity:
 **
 *expected worst-case time complexity is O(N);
*expected worst-case space complexity is O(1), beyond input storage (not counting the storage required for input arguments).
  */
object Dominator {
  def solution(a: Array[Int]): Int = {
    if (a.length == 0) {
      return -1
    }

    var candidate = a(0)
    var occurrences = 1
    var firstIndex = -1

    for (ind <- 1 until a.length) {
      if (candidate != a(ind)) {
        occurrences -= 1
      } else {
        occurrences += 1
      }

      if (occurrences == 0) {
        candidate = a(ind)
        occurrences = 1
      }
    }

    var count = 0
    for (ind <- a.indices) {
      if (a(ind) == candidate) {
        if (firstIndex == -1) {
          firstIndex = ind
        }
        count += 1
      }
    }

    if (count <= a.length / 2) {
      firstIndex = -1
    }

    firstIndex
  }

  def solution1(a: Array[Int]): Int = {
    def count(a: Array[Int], item: Int): Int = {
      @tailrec
      def count(A: Array[Int], item: Int, ind: Int, cnt: Int): Int = {
        if (ind >= A.length) {
          cnt
        } else if (A(ind) == item) {
          count(A, item, ind + 1, cnt + 1)
        } else {
          count(A, item, ind + 1, cnt)
        }
      }

      count(a, item, 0, 0)
    }

    def findFirst(a: Array[Int], item: Int): Int = {
      @tailrec
      def findFirst(A: Array[Int], item: Int, ind: Int): Int = {
        if (ind >= A.length) {
          -1
        } else if (A(ind) == item) {
          ind
        } else {
          findFirst(A, item, ind + 1)
        }
      }

      findFirst(a, item, 0)
    }

    if (a.length == 0) {
      return -1
    }

    var candidate = a(0)
    var occurrences = 1
    var firstIndex = -1

    for (ind <- 1 until a.length) {
      if (candidate != a(ind)) {
        occurrences -= 1
      } else {
        occurrences += 1
      }

      if (occurrences == 0) {
        candidate = a(ind)
        occurrences = 1
      }
    }

    if (count(a, candidate) <= a.length / 2) {
      return -1
    }

    findFirst(a, candidate)
  }
}
