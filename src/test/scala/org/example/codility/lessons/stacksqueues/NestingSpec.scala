package org.example.codility.lessons.stacksqueues

import org.specs2.mutable.Specification

class NestingSpec extends Specification {

  "Nesting" >> {
    "solution ((()()))" >> {
      Nesting.solution("((()()))") must_== 1
    }
    "solution ()))" >> {
      Nesting.solution("())") must_== 0
    }

    "solution1 ((()()))" >> {
      Nesting.solution1("((()()))") must_== 1
    }
    "solution1 ()))" >> {
      Nesting.solution1("())") must_== 0
    }

    "solution2 ((()()))" >> {
      Nesting.solution2("((()()))") must_== 1
    }
    "solution2 ()))" >> {
      Nesting.solution2("())") must_== 0
    }
  }
}
