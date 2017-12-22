package org.example.codility.lessons.euclideanalgorithm

import org.specs2.mutable.Specification

class ChocolatesByNumbersSpec extends Specification {

  "ChocolatesByNumbers" >> {
    "solution" >> {
      ChocolatesByNumbers.solution(10,4) must_== 5
    }

  }
}
