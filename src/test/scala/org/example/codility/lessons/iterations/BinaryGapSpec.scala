package org.example.codility.lessons.iterations

import org.specs2.mutable.Specification

class BinaryGapSpec extends Specification {

  "BinaryGap" >> {
    "N=15 ==> 1111" >> {
      BinaryGap.solution(15) must_== 0
    }
    "N=9 ==> 1001" >> {
      BinaryGap.solution(9) must_== 2
    }
    "N=529 ==> 1000010001" >> {
      BinaryGap.solution(529) must_== 4
    }
    "N=6 ==> 110" >> {
      BinaryGap.solution(6) must_== 0
    }
    "N=328 ==> 101001000" >> {
      BinaryGap.solution(328) must_== 2
    }
    "N=1024 ==> 10000000000" >> {
      BinaryGap.solution(1024) must_== 0
    }
    "N=51712 ==> 110010100000000" >> {
      BinaryGap.solution(51712) must_== 2
    }
  }
}
