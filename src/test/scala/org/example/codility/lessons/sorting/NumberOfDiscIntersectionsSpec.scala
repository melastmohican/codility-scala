package org.example.codility.lessons.sorting

import org.specs2.mutable.Specification

class NumberOfDiscIntersectionsSpec extends Specification {

  "NumberOfDiscIntersections" >> {
    "solution([1,5,2,1,4,0])" >> {
      NumberOfDiscIntersections.solution(Array(1,5,2,1,4,0)) must_== 11
    }
    "solution([])" >> {
      NumberOfDiscIntersections.solution(Array()) must_== 0
    }
    "solution1([1,5,2,1,4,0])" >> {
      NumberOfDiscIntersections.solution1(Array(1,5,2,1,4,0)) must_== 11
    }
    "solution1([])" >> {
      NumberOfDiscIntersections.solution1(Array()) must_== 0
    }
  }
}
