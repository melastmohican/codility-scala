package org.example.codility.lessons.binarysearchalgorithm

import org.specs2.mutable.Specification

class NailingPlanksSpec extends Specification {

  "NailingPlanks" >> {
    "solution([1,4,5,8],[4,5,9,10],[4,6,7,10,2])" >> {
      NailingPlanks.solution(Array(1,4,5,8),Array(4,5,9,10),Array(4,6,7,10,2)) must_== 4
    }

  }
}
