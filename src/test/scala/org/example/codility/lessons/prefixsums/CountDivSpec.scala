package org.example.codility.lessons.prefixsums

import org.specs2.mutable.Specification

class CountDivSpec extends Specification {

  "CountDiv" >> {
    "solution(6, 11, 2)" >> {
      CountDiv.solution(6, 11, 2) must_== 3
    }
    "solution(35, 37, 2)" >> {
      CountDiv.solution(35, 37, 2) must_== 1
    }
    "solution(12, 26, 3)" >> {
      CountDiv.solution(12, 26, 3) must_== 5
    }
    "solution(0, 11, 1)" >> {
      CountDiv.solution(0, 11, 1) must_== 12
    }
    "solution(3444, 2000000000, 1234586)" >> {
      CountDiv.solution(3444, 2000000000, 1234586) must_== 1619
    }
    "solution(0,2000000000, 1)" >> {
      CountDiv.solution(0, 2000000000, 1) must_== 2000000001
    }

    "solution(16, 11, 2)" >> {
      CountDiv.solution1(6, 11, 2) must_== 3
    }
    "solution(135, 37, 2)" >> {
      CountDiv.solution1(35, 37, 2) must_== 1
    }
    "solution1(12, 26, 3)" >> {
      CountDiv.solution1(12, 26, 3) must_== 5
    }
    "solution1(0, 11, 1)" >> {
      CountDiv.solution1(0, 11, 1) must_== 12
    }
    "solution1(3444, 2000000000, 1234586)" >> {
      CountDiv.solution1(3444, 2000000000, 1234586) must_== 1619
    }
    "solution1(0, 2000000000, 1)" >> {
      CountDiv.solution1(0, 2000000000, 1) must_== 2000000001
    }
  }
}
