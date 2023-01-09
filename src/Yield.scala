

object Yield extends App{
  
  val b = for(i <- 1 to 10){
    i*i
  }
  println(b) // Unit , ()
  
  //if we want List out of for-loop, use yield
  val c = for(i <- 1 to 10) yield{
    i*i
  }
  
  println(c)//c is of Vector Type
  
  //Vector is mix of Array & List.
  //Array provides indexed support.
  //List gives immutability.
  //Vector provides indexed based searching & immutability.
  
  
  //get list of even nos. only
  val a = for(i <- 1 to 10) yield {
    if(i%2 == 0) i*i
  }
  
  println(a) //Vector((), 4, (), 16, (), 36, (), 64, (), 100)
  
  //Solution is if-guard, filtering in for loop  
  val z = for(i <- 1 to 10; if i%2 == 0) yield {
    i*i
  }
  
  println(z)
  
  
  val y = for{
	  i <- 1 to 10
	  if i%2 == 0
  } yield i*i
  
  println(y)
  
  //Pattern guard - using if inside case statement
  //case statements can be combined with if expressions to 
  //provide extra logic during pattern matching
  
  def checkSign(x: Int):String = {
    x match {
      case a if a < 0 => s"$a is a negative number"
      case b if b > 0 => s"$b is a positive number"
      case c => s"$c is neither positive/nor negative"
    }
  }
  
//  println(checkSign(10))
  
  def f(x: Option[Int]) = {
    x match {
      case Some(i) if i%2 == 0 => println(i)
      case None => println("<no value>")
    }
  }
  
//  println(f(Some(5))) // Error raised : No default value
  
  def f1(x: Option[Int]) = {
    x match {
      case Some(i) if i%2 == 0 => println(i)
      case None => println("<no value>")
      case _ => println("something else")
    }
  }
  
  //for comprehension
  
  for(i<- 1 to 10) println(i)
  //conversion happens to below code
  (1 to 10).foreach(i => println(i*i)) 
  // this comprehension way, given better performance 
  
  for(i<- 1 to 10) yield i*i
  //conversion happens to below code, for better performance
  (1 to 10).map(i => i*i)
  
  
  //nested for-loop
  val list = for(i <- 1 to 10; j<- 'a' to 'c') yield {
    i*2 + " "+ j
  }
  //This nested for loop will also be converted to map,flatmap etc
  //for better performance
  
  println(list)
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}