package org.example.codility.lessons.countingelements

import org.specs2.mutable.Specification

class MaxCountersSpec extends Specification {

  "MaxCounters" >> {
    "solution(1,[1,2,3])" >> {
      MaxCounters.solution(1,Array(1,2,3)) must_=== Array(1)
    }
    "solution(1,[1])" >> {
      MaxCounters.solution(1, Array(1)) must_=== Array(1)
    }
    "solution(1,[5])" >> {
      MaxCounters.solution(1,Array(5)) must_=== Array(0)
    }
    "solution(1, [1,1,1,2,3])" >> {
      MaxCounters.solution(1, Array(1,1,1,2,3)) must_=== Array(3)
    }
    "solution(2, [1,1,1,2,3,1])" >> {
      MaxCounters.solution(2, Array(1,1,1,2,3,1)) must_=== Array(4,3)
    }
    "solution(5,[3, 4, 4, 6, 1, 4, 4])" >> {
      MaxCounters.solution(5,Array(3, 4, 4, 6, 1, 4, 4)) must_=== Array(3, 2, 2, 4, 2)
    }
    "solution(5, [3, 4, 4, 5, 1, 4, 4])" >> {
      MaxCounters.solution(5, Array(3, 4, 4, 5, 1, 4, 4)) must_=== Array(1, 0, 1, 4, 1)
    }
  }
}
