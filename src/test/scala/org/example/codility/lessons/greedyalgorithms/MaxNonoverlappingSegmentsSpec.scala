package org.example.codility.lessons.greedyalgorithms

import org.specs2.mutable.Specification

class MaxNonoverlappingSegmentsSpec extends Specification {

  "MaxNonoverlappingSegments" >> {
    "[1, 3, 7, 9, 9],[5, 6, 8, 9, 10]" >> {
      MaxNonoverlappingSegments.solution(Array(1, 3, 7, 9, 9),Array(5, 6, 8, 9, 10)) must_== 3
    }

  }
}
