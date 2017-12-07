package org.example.codility.lessons.arrays

import org.specs2.mutable.Specification

class CyclicRotationSpec extends Specification {

  "CyclicRotation" >> {
    "[] >> 1" >> {
      CyclicRotation.solution(Array(), 1) must be_===(Array())
    }
    "[3, 8, 9, 7, 6] >> 1" >> {
      CyclicRotation.solution(Array(3, 8, 9, 7, 6), 1) must be_===(Array(6, 3, 8, 9, 7))
    }
    "[3, 8, 9, 7, 6] >> 3" >> {
      CyclicRotation.solution(Array(3, 8, 9, 7, 6), 3) must be_===(Array(9, 7, 6, 3, 8))
    }
    "[1, 2, 3, 4, 5, 6, 7] >> 3" >> {
      CyclicRotation.solution(Array(1, 2, 3, 4, 5, 6, 7), 3) must be_===(Array(5, 6, 7, 1, 2, 3, 4))
    }
    "[0, 0, 0] >> 1" >> {
      CyclicRotation.solution(Array(0, 0, 0), 1) must be_===(Array(0, 0, 0))
    }
    "[1, 2, 3, 4] >> 4" >> {
      CyclicRotation.solution(Array(1, 2, 3, 4), 4) must be_===(Array(1, 2, 3, 4))
    }
  }
}
