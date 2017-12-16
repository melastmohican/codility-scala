package org.example.codility.lessons.leader

import org.specs2.mutable.Specification

class DominatorSpec extends Specification {

  "Dominator" >> {
    "solution([3, 4, 3, 2, 3, -1, 3, 3])" >> {
      Dominator.solution(Array(3, 4, 3, 2, 3, -1, 3, 3)) must beOneOf (0, 2, 4, 6, 7)
    }
    "solution1([3, 4, 3, 2, 3, -1, 3, 3])" >> {
      Dominator.solution1(Array(3, 4, 3, 2, 3, -1, 3, 3)) must beOneOf (0, 2, 4, 6, 7)
    }
  }
}
