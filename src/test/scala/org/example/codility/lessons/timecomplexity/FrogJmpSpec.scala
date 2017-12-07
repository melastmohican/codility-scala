package org.example.codility.lessons.timecomplexity

import org.specs2.mutable.Specification

class FrogJmpSpec extends Specification {

  "FrogJmp" >> {
    "x=10,y=10,d=10" >> {
      FrogJmp.solution(10,10,10) must_== 0
    }
    "x=10,y=85,d=30" >> {
      FrogJmp.solution(10,85,30) must_== 3
    }
    "x=10,y=50,d=10" >> {
      FrogJmp.solution(10, 50, 10) must_== 4
    }
    "x=0,y=50,d=10" >> {
      FrogJmp.solution(0, 50, 10) must_== 5
    }
  }
}
