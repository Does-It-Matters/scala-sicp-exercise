package ch01.exercise

import scala.io.StdIn

def solution1_2(): Int = {
  val firstNum = StdIn.readInt()
  val secondNum = StdIn.readInt()
  val thirdNum = StdIn.readInt()

  val (remaining1, remaining2) = exceptMin(firstNum, secondNum, thirdNum)
  square(remaining1) + square(remaining2)
}

def square(num: Int): Int = num * num

def exceptMin(firstNum: Int, secondNum: Int, thirdNum: Int): (Int, Int) = 
  if (firstNum <= secondNum && firstNum <= thirdNum) (secondNum, thirdNum)
  else if (secondNum <= firstNum && secondNum <= thirdNum) (firstNum, thirdNum)
  else (firstNum, secondNum)
