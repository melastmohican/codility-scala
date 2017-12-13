package org.example.codility.lessons.sorting

import org.specs2.mutable.Specification

class MaxProductOfThreeSpec extends Specification {

  "MaxProductOfThree" >> {
    "solution([-3, 1, 2, -2, 5, 6])" >> {
      MaxProductOfThree.solution(Array(-3, 1, 2, -2, 5, 6)) must_== 60
    }

    "solution([0, 0, 0])" >> {
      MaxProductOfThree.solution(Array(0, 0, 0)) must_== 0
    }

    "solution([3, 5, 7, 9, 10, -12, -25])" >> {
      MaxProductOfThree.solution(Array(3, 5, 7, 9, 10, -12, -25)) must_== 3000
    }

    "solution([-3, -20, -1, -6, -90, -12, -12])" >> {
      MaxProductOfThree.solution(Array(-3, -20, -1, -6, -90, -12, -12)) must_== -18
    }
  }
}
