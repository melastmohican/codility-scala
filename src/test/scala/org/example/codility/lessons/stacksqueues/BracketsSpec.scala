package org.example.codility.lessons.stacksqueues

import org.specs2.mutable.Specification

class BracketsSpec extends Specification {

  "BracketsSpec" >> {
    "solution({[()()]})" >> {
      Brackets.solution("{[()()]}") must_== 1
    }
    "solution()" >> {
      Brackets.solution("") must_== 1
    }
    "solution((U))" >> {
      Brackets.solution("(U)") must_== 1
    }
    "solution([U])" >> {
      Brackets.solution("[U]") must_== 1
    }
    "solution({U})" >> {
      Brackets.solution("{U}") must_== 1
    }
    "solution(([)()])" >> {
      Brackets.solution("([)()]") must_== 0
    }

  }
}
