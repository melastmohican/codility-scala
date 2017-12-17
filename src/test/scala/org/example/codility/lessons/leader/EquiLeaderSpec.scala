package org.example.codility.lessons.leader

import org.specs2.mutable.Specification

class EquiLeaderSpec extends Specification {

  "EquiLeader" >> {
    "[4, 3, 4, 4, 4, 2]" >> {
      EquiLeader.solution(Array(4, 3, 4, 4, 4, 2)) must_== 2
    }

  }
}
