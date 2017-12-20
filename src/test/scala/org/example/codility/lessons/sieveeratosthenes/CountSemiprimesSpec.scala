package org.example.codility.lessons.sieveeratosthenes

import org.specs2.mutable.Specification

class CountSemiprimesSpec extends Specification {

  "CountSemiprimes" >> {
    "solution(26,[1, 4, 16],[26, 10, 20]" >> {
      CountSemiprimes.solution(26, Array(1, 4, 16),Array(26, 10, 20)) must_== Array(10, 4, 0)
    }

  }
}
