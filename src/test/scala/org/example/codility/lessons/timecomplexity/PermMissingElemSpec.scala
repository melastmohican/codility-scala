package org.example.codility.lessons.timecomplexity

import org.specs2.mutable.Specification

class PermMissingElemSpec extends Specification {

  "PermMissingElem" >> {
    "[2,3,1,5]" >> {
      PermMissingElem.solution(Array(2,3,1,5)) must_== 4
    }
    "[]" >> {
      PermMissingElem.solution(Array()) must_== 1
    }
    "[1]" >> {
      PermMissingElem.solution(Array(1)) must_== 2
    }
    "[4,5,3,1]" >> {
      PermMissingElem.solution(Array(4, 5, 3, 1)) must_== 2
    }
    "[2 .. 1000000]" >> {
      PermMissingElem.solution((2 to 1000000).toArray) must_== 1
    }
  }
}
