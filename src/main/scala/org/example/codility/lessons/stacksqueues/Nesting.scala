package org.example.codility.lessons.stacksqueues

import scala.collection.mutable.Stack

/**
  * A string S consisting of N characters is called properly nested if:

S is empty;
S has the form "(U)" where U is a properly nested string;
S has the form "VW" where V and W are properly nested strings.
For example, string "(()(())())" is properly nested but string "())" isn't.

Write a function:

object Solution { def solution(s: String): Int }
that, given a string S consisting of N characters, returns 1 if string S is properly nested and 0 otherwise.

For example, given S = "(()(())())", the function should return 1 and given S = "())", the function should return 0, as explained above.

Assume that:

N is an integer within the range [0..1,000,000];
string S consists only of the characters "(" and/or ")".
Complexity:

expected worst-case time complexity is O(N);
expected worst-case space complexity is O(1) (not counting the storage required for input arguments).
  */
object Nesting {
  def solution(s: String): Int = {
    val chars: Stack[Character] = new Stack[Character]()
    for (c <- s) {
      if (c == '(') {
        chars.push(c)
      } else if (c == ')' && chars.size > 0) {
        chars.pop()
      } else return 0
    }
    if (chars.size == 0) 1 else 0
  }

  def solution1(s: String): Int = {
    var leftBracketNum: Int = 0
    for (c <- s) {
      if (c == '(') {
        leftBracketNum += 1
      } else {
        if (leftBracketNum == 0) {
          return 0
        }
        leftBracketNum -= 1
      }
    }
    if (leftBracketNum == 0) 1 else 0
  }

  def solution2(s: String): Int = {
    var nested = 0
    for (ch: Char <- s
         if nested >= 0) {
      nested += (ch match {
        case '(' => 1
        case ')' => -1
      })
    }
    if (nested == 0) 1 else 0
  }
}
