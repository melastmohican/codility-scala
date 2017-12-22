package org.example.codility.lessons.ibonaccinumbers

import org.specs2.mutable.Specification

class FibFrogSpec extends Specification {

  "FibFrog" >> {
    "[0,0,0,1,1,0,1,0,0,0,0]" >> {
      FibFrog.solution(Array(0,0,0,1,1,0,1,0,0,0,0)) must_== 3
    }
    "[]" >> {
      FibFrog.solution(Array()) must_== 1
    }
    "[0,0,0,0,0,0]" >> {
      FibFrog.solution(Array(0,0,0,0,0,0)) must_== -1
    }
    "[1,1,1,1,1,1]" >> {
      FibFrog.solution(Array(1,1,1,1,1,1)) must_== 2
    }

  }
}
