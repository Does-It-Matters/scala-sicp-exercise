
@main
def main(): Unit = {
  println(abs(-10) + abs(10))
}

def abs(x: Int): Int = {
    if (x >= 0) x
    else if (x == 0) 0
    else - x
}
