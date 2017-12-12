package org.example.codility.lessons.sorting

import org.specs2.mutable.Specification

class TriangleSpec extends Specification {

  "Triangle" >> {
    "[10,2,5,1,8,20]" >> {
      Triangle.solution(Array(10, 2, 5, 1, 8, 20)) must_== 1
    }
    "[10,50,5,1]" >> {
      Triangle.solution(Array(10, 50, 5, 1)) must_== 0
    }
    "[5,3,3]" >> {
      Triangle.solution(Array(5, 3, 3)) must_== 1
    }
    "[1,1,1]" >> {
      Triangle.solution(Array(1, 1, 1)) must_== 1
    }
    "[2,3]" >> {
      Triangle.solution(Array(2, 3)) must_== 0
    }
    "[]" >> {
      Triangle.solution(Array.empty[Int]) must_== 0
    }
    "[Int.MaxValue, Int.MaxValue, Int.MaxValue]" >> {
      Triangle.solution(Array(Int.MaxValue, Int.MaxValue, Int.MaxValue)) must_== 1
    }
  }
}
