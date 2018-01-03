package org.example.codility.lessons.caterpillarmethod

import org.specs2.mutable.Specification

class MinAbsSumOfTwoSpec extends Specification {

  "MinAbsSumOfTwo" >> {
    "solution([1, 4, -3])" >> {
      MinAbsSumOfTwo.solution(Array(1, 4, -3)) must_== 1
    }
    "solution([-8, 4, 5, -10, 3])" >> {
      MinAbsSumOfTwo.solution(Array(-8, 4, 5, -10, 3)) must_== 3
    }
    "solution1([1, 4, -3])" >> {
      MinAbsSumOfTwo.solution1(Array(1, 4, -3)) must_== 1
    }
    "solution1([-8, 4, 5, -10, 3])" >> {
      MinAbsSumOfTwo.solution1(Array(-8, 4, 5, -10, 3)) must_== 3
    }
    "solution2([1, 4, -3])" >> {
      MinAbsSumOfTwo.solution2(Array(1, 4, -3)) must_== 1
    }
    "solution2([-8, 4, 5, -10, 3])" >> {
      MinAbsSumOfTwo.solution2(Array(-8, 4, 5, -10, 3)) must_== 3
    }
  }

}


