package org.example.codility.lessons.arrays

import org.specs2.mutable.Specification

class OddOccurrencesInArraySpec extends Specification {

  "OddOccurrencesInArray" >> {
    "2, 1, 2, 4, 1" >> {
      OddOccurrencesInArray.solution(Array(2, 1, 2, 4, 1)) must_== 4
    }
    "1, 2, 2, 2, 2, 2, 2" >> {
      OddOccurrencesInArray.solution(Array(1, 2, 2, 2, 2, 2, 2)) must_== 1
    }
    "1, 2, 2, 2, 2, 2, 3" >> {
      OddOccurrencesInArray.solution(Array(2, 2, 2, 2, 2, 2, 3)) must_== 3
    }
    "9, 3, 9, 3, 9, 7, 9" >> {
      OddOccurrencesInArray.solution(Array(9, 3, 9, 3, 9, 7, 9)) must_== 7
    }
  }
}
