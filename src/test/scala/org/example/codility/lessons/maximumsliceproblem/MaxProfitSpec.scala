package org.example.codility.lessons.maximumsliceproblem

import org.specs2.mutable.Specification

class MaxProfitSpec extends Specification {

  "MaxProfit" >> {
    "solution([23171, 21011, 21123, 21366, 21013, 21367])" >> {
      MaxProfit.solution(Array(23171, 21011, 21123, 21366, 21013, 21367)) must_== 356
    }
    "solution1([23171, 21011, 21123, 21366, 21013, 21367])" >> {
      MaxProfit.solution1(Array(23171, 21011, 21123, 21366, 21013, 21367)) must_== 356
    }
  }
}
