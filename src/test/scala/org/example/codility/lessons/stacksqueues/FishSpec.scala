package org.example.codility.lessons.stacksqueues

import org.specs2.mutable.Specification

class FishSpec extends Specification {

  "Fish" >> {
    "solution([4, 3, 2, 1, 5],[0, 1, 0, 0, 0])" >> {
      Fish.solution(Array(4, 3, 2, 1, 5),Array(0, 1, 0, 0, 0)) must_== 2
    }
    "solution([2,3],[1,0])" >> {
      Fish.solution(Array(2,3),Array(1,0)) must_== 1
    }

  }
}
