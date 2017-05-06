/**
  * Created by Tom on 30/04/2017.
  */
class Counter(x: Int) {

def inc(y: Int): Counter =  {
new Counter(x+y)
  }
  def dec(z: Int): Counter = {
    new Counter (x-z)
  }
  def inc: Counter =  {
    new Counter(x+1)
  }
  def dec: Counter = {
    new Counter (x-1)
  }
  def adjust(add: Adder): Counter = {
    inc(add.##)
  }
}


