package org.example.codility.lessons.prefixsums

import org.specs2.mutable.Specification

class MinAvgTwoSliceSpec extends Specification {

  "MinAvgTwoSlice" >> {
    "solution([4,2,2,5,1,5,8]" >> {
      MinAvgTwoSlice.solution(Array(4,2,2,5,1,5,8)) must_== 1
    }

  }
}
