package org.example.codility.lessons.prefixsums

import org.specs2.mutable.Specification

class PassingCarsSpec extends Specification {
  "PassingCars" >> {
    "solution([0,1,0,1,1])" >> {
      PassingCars.solution(Array(0, 1, 0, 1, 1)) must_== 5
    }
    "solution([0,0,0,0,0])" >> {
      PassingCars.solution(Array(0,0,0,0,0)) must_== 0
    }
    "solution([0,0,1,1,1,1])" >> {
      PassingCars.solution(Array(0,0,1,1,1,1)) must_== 8
    }
    "solution([0,0,1,1,1,1,0])" >> {
      PassingCars.solution(Array(0,0,1,1,1,1,0)) must_== 8
    }
    "solution([1,0])" >> {
      PassingCars.solution(Array(1,0)) must_== 0
    }
    "solution([0,1,1,1,1,1,1,0])" >> {
      PassingCars.solution(Array(0,1,1,1,1,1,1,0)) must_== 6
    }
    "solution([1,1,1,1,0,1,0])" >> {
      PassingCars.solution(Array(1,1,1,1,0,1,0)) must_== 1
    }
    "solution([1,1,1,1,0,1,1,0,1])" >> {
      PassingCars.solution(Array(1,1,1,1,0,1,1,0,1)) must_== 4
    }

    "solution1([0,1,0,1,1])" >> {
      PassingCars.solution1(Array(0, 1, 0, 1, 1)) must_== 5
    }
    "solution1([0,0,0,0,0])" >> {
      PassingCars.solution1(Array(0,0,0,0,0)) must_== 0
    }
    "solution1([0,0,1,1,1,1])" >> {
      PassingCars.solution1(Array(0,0,1,1,1,1)) must_== 8
    }
    "solution1([0,0,1,1,1,1,0])" >> {
      PassingCars.solution1(Array(0,0,1,1,1,1,0)) must_== 8
    }
    "solution1([1,0])" >> {
      PassingCars.solution1(Array(1,0)) must_== 0
    }
    "solution(1[0,1,1,1,1,1,1,0])" >> {
      PassingCars.solution1(Array(0,1,1,1,1,1,1,0)) must_== 6
    }
    "solution1([1,1,1,1,0,1,0])" >> {
      PassingCars.solution1(Array(1,1,1,1,0,1,0)) must_== 1
    }
    "solution1([1,1,1,1,0,1,1,0,1])" >> {
      PassingCars.solution1(Array(1,1,1,1,0,1,1,0,1)) must_== 4
    }
  }
}
