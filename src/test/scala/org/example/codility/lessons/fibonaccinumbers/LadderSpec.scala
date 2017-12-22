package org.example.codility.lessons.fibonaccinumbers

import org.specs2.mutable.Specification

class LadderSpec extends Specification {

  "Ladder" >> {
    "solution([4,4,5,5,1],[3,2,4,3,1]" >> {
      Ladder.solution(Array(4,4,5,5,1),Array(3,2,4,3,1)) must_== Array(5, 1, 8, 0, 1)
    }
   }
}
