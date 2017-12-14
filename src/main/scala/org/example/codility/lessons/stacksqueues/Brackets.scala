package org.example.codility.lessons.stacksqueues

import scala.collection.mutable.Stack

/**
  * A string S consisting of N characters is considered to be properly nested if any of the following conditions is true:

S is empty;
S has the form "(U)" or "[U]" or "{U}" where U is a properly nested string;
S has the form "VW" where V and W are properly nested strings.
For example, the string "{[()()]}" is properly nested but "([)()]" is not.

Write a function:

object Solution { def solution(s: String): Int }

that, given a string S consisting of N characters, returns 1 if S is properly nested and 0 otherwise.

For example, given S = "{[()()]}", the function should return 1 and given S = "([)()]", the function should return 0, as explained above.

Assume that:

N is an integer within the range [0..200,000];
string S consists only of the following characters: "(", "{", "[", "]", "}" and/or ")".
Complexity:

expected worst-case time complexity is O(N);
expected worst-case space complexity is O(N) (not counting the storage required for input arguments).
  */
object Brackets {
  def solution(s: String): Int = {
    val brackets = Map[Char, Char]('(' -> ')', '{' -> '}', '[' -> ']')

    var stack = Stack[Char]()
    var result = 0
    for (c <- s) {
      if (brackets.keys.exists(_ == c)) {
        stack.push(c)
      } else if (brackets.values.exists(_ == c)) {
        if (!stack.isEmpty && (brackets(stack.top) == c)) {
          stack.pop
        } else {
          return 0
        }
      }

    }
    if (stack.isEmpty) 1 else 0
  }
}