package ch01.knowledge

def abs(x: Int): Int = 
  if (x > 0) x // 하나의 절(clause) = 하나의 술어와 그에 대한 최종 결과
  else if (x == 0) 0
  else -x
