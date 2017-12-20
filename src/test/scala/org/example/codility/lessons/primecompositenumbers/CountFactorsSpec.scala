package org.example.codility.lessons.primecompositenumbers

import org.specs2.mutable.Specification

class CountFactorsSpec extends Specification {

  "CountFactors" >> {
    "solution(24)" >> {
      CountFactors.solution(24) must_== 8
    }
    "solution(1000000000)" >> {
      CountFactors.solution(1000000000) must_== 100
    }
    "solution(Integer.MAX_VALUE)" >> {
      CountFactors.solution(Integer.MAX_VALUE) must_== 2
    }
    "solution(2147395600)" >> {
      CountFactors.solution(2147395600) must_== 135
    }
  }
}
