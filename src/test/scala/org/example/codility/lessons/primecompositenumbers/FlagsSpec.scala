package org.example.codility.lessons.primecompositenumbers

import org.specs2.mutable.Specification

class FlagsSpec extends Specification {

  "Flags" >> {
    "solution([1,5,3,4,3,4,1,2,3,4,6,2])" >> {
      Flags.solution(Array(1,5,3,4,3,4,1,2,3,4,6,2)) must_== 3
    }
  }
}
