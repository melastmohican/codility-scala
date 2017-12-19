package org.example.codility.lessons.primecompositenumbers

import org.specs2.mutable.Specification

class MinPerimeterRectangleSpec extends Specification {

  "MinPerimeterRectangle" >> {
    "solution(30)" >> {
      MinPerimeterRectangle.solution(30) must_== 22
    }
    "solution(100000000)" >> {
      MinPerimeterRectangle.solution(100000000) must_== 40000
    }
    "solution1(30)" >> {
      MinPerimeterRectangle.solution1(30) must_== 22
    }
    "solution1(100000000)" >> {
      MinPerimeterRectangle.solution1(100000000) must_== 40000
    }
  }
}
