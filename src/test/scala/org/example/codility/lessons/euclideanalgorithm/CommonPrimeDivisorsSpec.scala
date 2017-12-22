package org.example.codility.lessons.euclideanalgorithm

import org.specs2.mutable.Specification

class CommonPrimeDivisorsSpec extends Specification {

  "CommonPrimeDivisors" >> {
    "solution([15, 10, 3],[75, 30, 5])" >> {
      CommonPrimeDivisors.solution(Array(15, 10, 3), Array(75, 30, 5)) must_== 1
    }

  }
}
