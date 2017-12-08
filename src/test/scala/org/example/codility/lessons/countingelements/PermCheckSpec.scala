package org.example.codility.lessons.countingelements

import org.specs2.mutable.Specification

class PermCheckSpec extends Specification {

  "PermCheckSpec" >> {
    "solution(4,1,3,2)" >> {
      PermCheck.solution(Array(4,1,3,2)) must_== 1
    }
    "solution(4,1,3)" >> {
      PermCheck.solution(Array(4,1,3)) must_== 0
    }

    "solution1(4,1,3,2)" >> {
      PermCheck.solution1(Array(4,1,3,2)) must_== 1
    }
    "solution1(4,1,3)" >> {
      PermCheck.solution1(Array(4,1,3)) must_== 0
    }

    "solution2(4,1,3,2)" >> {
      PermCheck.solution2(Array(4,1,3,2)) must_== 1
    }
    "solution2(4,1,3)" >> {
      PermCheck.solution2(Array(4,1,3)) must_== 0
    }
  }
}
