package org.example.codility.lessons.maximumsliceproblem

import org.specs2.mutable.Specification

class MaxSliceSumSpec extends Specification {

  "MaxSliceSum" >> {
    "solution([Array(3, 2, -6, 4, 0)])" >> {
      MaxSliceSum.solution(Array(3, 2, -6, 4, 0)) must_== 5
    }
    "solution1([Array(3, 2, -6, 4, 0)])" >> {
      MaxSliceSum.solution1(Array(3, 2, -6, 4, 0)) must_== 5
    }
  }
}
