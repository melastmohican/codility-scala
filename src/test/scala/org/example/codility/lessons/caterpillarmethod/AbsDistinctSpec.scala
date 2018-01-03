package org.example.codility.lessons.caterpillarmethod

import org.specs2.mutable.Specification

class AbsDistinctSpec extends Specification {

  "AbsDistinct" >> {
    "solution([-5,-3,-1,0,3,6])" >> {
      AbsDistinct.solution(Array(-5,-3,-1,0,3,6)) must_== 5
    }
    "solution1([-5,-3,-1,0,3,6])" >> {
      AbsDistinct.solution1(Array(-5,-3,-1,0,3,6)) must_== 5
    }
    "solution2([-5,-3,-1,0,3,6])" >> {
      AbsDistinct.solution2(Array(-5,-3,-1,0,3,6)) must_== 5
    }
  }
}
