package org.example.codility.lessons.timecomplexity

import org.specs2.mutable.Specification

class TapeEquilibriumSpec extends Specification {

  "TapeEquilibrium" >> {
    "[]" >> {
      TapeEquilibrium.solution(Array()) must_== Integer.MAX_VALUE
    }
    "[1]" >> {
      TapeEquilibrium.solution(Array(1)) must_== Integer.MAX_VALUE
    }
    "[3,1,2,4,3]" >> {
      TapeEquilibrium.solution(Array(3,1,2,4,3)) must_== 1
    }
    "[1,1,1,1]" >> {
      TapeEquilibrium.solution(Array(1, 1, 1, 1)) must_== 0
    }
    "[1,1,1,2]" >> {
      TapeEquilibrium.solution(Array(1, 1, 1, 2)) must_== 1
    }
  }
}
