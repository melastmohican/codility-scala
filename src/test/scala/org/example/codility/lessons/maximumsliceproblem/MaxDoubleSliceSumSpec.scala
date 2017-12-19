package org.example.codility.lessons.maximumsliceproblem

import org.specs2.mutable.Specification

class MaxDoubleSliceSumSpec extends Specification {

  "MaxDoubleSliceSum" >> {
    "[3,2,6,-1,4,5,-1,2]" >> {
      MaxDoubleSliceSum.solution(Array(3,2,6,-1,4,5,-1,2)) must_== 17
    }

  }
}
