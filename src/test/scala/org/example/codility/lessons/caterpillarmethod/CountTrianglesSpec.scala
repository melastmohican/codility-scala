package org.example.codility.lessons.caterpillarmethod

import org.specs2.mutable.Specification

class CountTrianglesSpec extends Specification {

  "CountTriangles" >> {
    "solution([10, 2, 5, 1, 8, 12])" >> {
      CountTriangles.solution(Array(10, 2, 5, 1, 8, 12)) must_== 4
    }
    "solution1([10, 2, 5, 1, 8, 12])" >> {
      CountTriangles.solution1(Array(10, 2, 5, 1, 8, 12)) must_== 4
    }
  }
}
