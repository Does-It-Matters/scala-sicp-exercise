package ch01.exercise

def solution1_11(n: Int): Int = f(n)
  
def f(n: Int): Int =
  if (n < 3) n
  else f(n-1) + 2*f(n-2) + 3*f(n-3)
