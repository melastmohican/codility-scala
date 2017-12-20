package org.example.codility.lessons.leader

import scala.collection.mutable

/**
  * A non-empty zero-indexed array A consisting of N integers is given.

The leader of this array is the value that occurs in more than half of the elements of A.

An equi leader is an index S such that 0 ≤ S < N − 1 and two sequences A[0], A[1], ..., A[S] and A[S + 1], A[S + 2], ..., A[N − 1] have leaders of the same value.

For example, given array A such that:

    A[0] = 4
    A[1] = 3
    A[2] = 4
    A[3] = 4
    A[4] = 4
    A[5] = 2
we can find two equi leaders:

0, because sequences: (4) and (3, 4, 4, 4, 2) have the same leader, whose value is 4.
2, because sequences: (4, 3, 4) and (4, 4, 2) have the same leader, whose value is 4.
The goal is to count the number of equi leaders.

Write a function:

object Solution { def solution(a: Array[Int]): Int }

that, given a non-empty zero-indexed array A consisting of N integers, returns the number of equi leaders.

For example, given:

    A[0] = 4
    A[1] = 3
    A[2] = 4
    A[3] = 4
    A[4] = 4
    A[5] = 2
the function should return 2, as explained above.

Assume that:

N is an integer within the range [1..100,000];
each element of array A is an integer within the range [−1,000,000,000..1,000,000,000].
Complexity:

expected worst-case time complexity is O(N);
expected worst-case space complexity is O(N), beyond
  */
object EquiLeader {
  def solution(a: Array[Int]): Int = {
    val stack = mutable.Stack[Integer]()
    for (i <- 0 until a.length) {
      if (stack.isEmpty) {
        stack.push(a(i))
      } else {
        if (stack.top == a(i)) stack.push(a(i)) else stack.pop
      }
    }
    if (stack.isEmpty) //there's no dominator
      return 0
    val dominator: Int = stack.top
    var domOccurances: Int = 0
    for (i <- 0 until a.length)
      if (a(i) == dominator) {
        domOccurances += 1
      }
    if (domOccurances <= a.length / 2) //not dominator
      return 0
    val nonDomOccurances: Int = a.length - domOccurances
    stack.clear
    var dom: Int = 0
    var nonDom: Int = 0
    var equiLeaders: Int = 0
    for (i <- 0 until a.length) {
      if (a(i) == dominator) {
        dom += 1
      } else {
        nonDom += 1
      }
      if (dom > nonDom &&
        (domOccurances - dom) > (nonDomOccurances - nonDom)) {
        equiLeaders += 1
      }
    }
    equiLeaders
  }
}