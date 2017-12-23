package org.example.codility.lessons.binarysearchalgorithm

import org.specs2.mutable.Specification

class MinMaxDivisionSpec extends Specification {

  "MinMaxDivision" >> {
    "solution(3,5,[2, 1, 5, 1, 2, 2, 2])" >> {
      MinMaxDivision.solution(3,5,Array(2, 1, 5, 1, 2, 2, 2)) must_== 6
    }
    "solution1(3,5,[2, 1, 5, 1, 2, 2, 2])" >> {
      MinMaxDivision.solution1(3,5,Array(2, 1, 5, 1, 2, 2, 2)) must_== 6
    }
  }
}
