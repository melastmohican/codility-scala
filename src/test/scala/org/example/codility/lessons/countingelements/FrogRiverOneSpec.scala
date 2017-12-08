package org.example.codility.lessons.countingelements

import org.specs2.mutable.Specification

class FrogRiverOneSpec extends Specification {

  "FrogRiverOne" should {
    "solution(5,[1,3,1,3,2,3,5,4])" in {
      FrogRiverOne.solution(5, Array(1, 3, 1, 3, 2, 3, 5, 4)) must_== 7
    }
    "solution(5,[2,1,3,5,3,2])" in {
      FrogRiverOne.solution(5, Array(2,1,3,5,3,2)) must_== -1
    }
    "solution(3,[2,1,1,2,3])" in {
      FrogRiverOne.solution(3, Array(2,1,1,2,3)) must_== 4
    }
    "solution(5,[2,1,3,5,3,2,4])" in {
      FrogRiverOne.solution(5, Array(2,1,3,5,3,2,4)) must_== 6
    }
    "solution(1,[1])" in {
      FrogRiverOne.solution(1, Array(1)) must_== 0
    }
    "solution1(5,[1,3,1,3,2,3,5,4])" in {
      FrogRiverOne.solution1(5, Array(1, 3, 1, 3, 2, 3, 5, 4)) must_== 7
    }
    "solution1(5,[2,1,3,5,3,2])" in {
      FrogRiverOne.solution1(5, Array(2,1,3,5,3,2)) must_== -1
    }
    "solution1(3,[2,1,1,2,3])" in {
      FrogRiverOne.solution1(3, Array(2,1,1,2,3)) must_== 4
    }
    "solution1(5,[2,1,3,5,3,2,4])" in {
      FrogRiverOne.solution1(5, Array(2,1,3,5,3,2,4)) must_== 6
    }
    "solution1(1,[1])" in {
      FrogRiverOne.solution1(1, Array(1)) must_== 0
    }
  }
}
