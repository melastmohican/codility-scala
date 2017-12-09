package org.example.codility.lessons.prefixsums

import org.specs2.mutable.Specification

class GenomicRangeQuerySpec extends Specification {

  "GenomicRangeQuery" >> {
    "solution(CAGCCTA,[2,5,0],[4,5,6]" >> {
      GenomicRangeQuery.solution("CAGCCTA",Array(2,5,0), Array(4,5,6)) must_== Array(2, 4, 1)
    }

  }
}
