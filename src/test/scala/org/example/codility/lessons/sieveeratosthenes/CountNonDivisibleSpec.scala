package org.example.codility.lessons.sieveeratosthenes

import org.specs2.mutable.Specification

class CountNonDivisibleSpec extends Specification {

  "CountNonDivisible" >> {
    "[3, 1, 2, 3, 6]" >> {
      CountNonDivisible.solution(Array(3, 1, 2, 3, 6)) must_== Array(2, 4, 3, 2, 0)
    }
    "[2, 3]" >> {
      CountNonDivisible.solution(Array(2, 3)) must_== Array(1, 1)
    }
    "[2, 2]" >> {
      CountNonDivisible.solution(Array(2, 2)) must_== Array(0, 0)
    }
    "[2, 4]" >> {
      CountNonDivisible.solution(Array(2, 4)) must_== Array(1, 0)
    }
  }
}
