package org.example.codility.lessons.sorting

import org.specs2.mutable.Specification

class DistinctSpec extends Specification {

  "Distinct" >> {
    "solution([2, 1, 1, 2, 3, 1])" >> {
      Distinct.solution(Array(2, 1, 1, 2, 3, 1)) must_== 3
    }
    "solution1([2, 1, 1, 2, 3, 1])" >> {
      Distinct.solution1(Array(2, 1, 1, 2, 3, 1)) must_== 3
    }
    "solution2([2, 1, 1, 2, 3, 1])" >> {
      Distinct.solution2(Array(2, 1, 1, 2, 3, 1)) must_== 3
    }

    "solution([1, 2, 3])" >> {
      Distinct.solution(Array(1, 2, 3)) must_== 3
    }
    "solution1([1, 2, 3])" >> {
      Distinct.solution1(Array(1, 2, 3)) must_== 3
    }
    "solution2([1, 2, 3])" >> {
      Distinct.solution2(Array(1, 2, 3)) must_== 3
    }

    "solution([1, 2, 3, 3, 4, 5, 6, 6])" >> {
      Distinct.solution(Array(1, 2, 3, 3, 4, 5, 6, 6)) must_== 6
    }
    "solution1([1, 2, 3, 3, 4, 5, 6, 6])" >> {
      Distinct.solution1(Array(1, 2, 3, 3, 4, 5, 6, 6)) must_== 6
    }
    "solution2([1, 2, 3, 3, 4, 5, 6, 6])" >> {
      Distinct.solution2(Array(1, 2, 3, 3, 4, 5, 6, 6)) must_== 6
    }
  }
}
