package org.example.codility.lessons.stacksqueues

import org.specs2.mutable.Specification

class StoneWallSpec extends Specification {

  "StoneWall" >> {
    "[8, 8, 5, 7, 9, 8, 7, 4, 8]" >> {
      StoneWall.solution(Array(8, 8, 5, 7, 9, 8, 7, 4, 8)) must_== 7
    }

  }
}
