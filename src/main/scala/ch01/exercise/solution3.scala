package ch01.exercise

def plusOne(num: Int): Int = num + 1

def minusOne(num: Int): Int = num - 1

def identity(num: Int): Int = num

def f(num: Int): Int => Int = 
  if (num > 0) plusOne
  else if (num < 0) minusOne
  else identity

def solution1_3(num: Int): Int = {
  val selectedFunction = f(num)
  selectedFunction(num)
}
