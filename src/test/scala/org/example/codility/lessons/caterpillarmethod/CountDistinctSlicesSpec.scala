package org.example.codility.lessons.caterpillarmethod

import org.specs2.mutable.Specification

class CountDistinctSlicesSpec extends Specification {

  "CountDistinctSlices" >> {
    "solution(6,[3, 4, 5, 5, 2])" >> {
      CountDistinctSlices.solution(6, Array(3, 4, 5, 5, 2)) must_== 9
    }
    "solution1(6,[3, 4, 5, 5, 2])" >> {
      CountDistinctSlices.solution1(6, Array(3, 4, 5, 5, 2)) must_== 9
    }
  }
}
