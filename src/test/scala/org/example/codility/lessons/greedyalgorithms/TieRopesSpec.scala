package org.example.codility.lessons.greedyalgorithms

import org.specs2.mutable.Specification

class TieRopesSpec extends Specification {

  "TieRopes" >> {
    "solution(4,[1, 2, 3, 4, 1, 1, 3])" >> {
      TieRopes.solution(4,Array(1, 2, 3, 4, 1, 1, 3)) must_== 3
    }

  }
}
