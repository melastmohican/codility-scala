package org.example.codility.lessons.primecompositenumbers

import org.specs2.mutable.Specification

class PeaksSpec extends Specification {

  "PeaksSpec" >> {
    "[1, 2, 3, 4, 3, 4, 1, 2, 3, 4, 6, 2]" >> {
      Peaks.solution(Array(1, 2, 3, 4, 3, 4, 1, 2, 3, 4, 6, 2)) must_== 3
    }

  }
}
