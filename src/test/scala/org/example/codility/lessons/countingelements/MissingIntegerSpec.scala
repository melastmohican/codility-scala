package org.example.codility.lessons.countingelements

import org.specs2.mutable.Specification

class MissingIntegerSpec extends Specification {

  "MissingInteger" >> {
    "[1,3,6,4,1,2]" >> {
      MissingInteger.solution(Array(1, 3, 6, 4, 1, 2)) must_== 5
    }
    "[1]" >> {
      MissingInteger.solution(Array(1)) must_== 2
    }
    "[3]" >> {
      MissingInteger.solution(Array(3)) must_== 1
    }
    "[0]" >> {
      MissingInteger.solution(Array(0)) must_== 1
    }
    "[1,2,3]" >> {
      MissingInteger.solution(Array(1, 2, 3)) must_== 4
    }
    "[−1,−3]" >> {
      MissingInteger.solution(Array(-1, -3)) must_== 1
    }
    "[-2]" >> {
      MissingInteger.solution(Array(-2)) must_== 1
    }
    "[-5,0,-2,1]" >> {
      MissingInteger.solution(Array(-5, 0, -2, 1)) must_== 2
    }
    "[-2147483648, 2147483647]" >> {
      MissingInteger.solution(Array(-2147483648, 2147483647)) must_== 1
    }
  }
}
