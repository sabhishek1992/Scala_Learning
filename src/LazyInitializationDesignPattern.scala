

object LazyInitializationDesignPattern extends App{
  
  //Not Lazy
  val x = {
    println{"computing x"}
    42
  }
  
  lazy val y = {
    println("computing y")
    34
  }
  //Lazy. executed/computed when y is called first time.
  //Any no. of times it is called next value is return.
  //Not computed again. But this logic holds for both x & y
}