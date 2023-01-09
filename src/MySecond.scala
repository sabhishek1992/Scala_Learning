

object MySecond extends App{
  
  //prints something so return type is Unit
  def tryIt(thing: Null): Unit = {
    println("that worked")
  }
  
  tryIt(null) // only thing which can be pass as function arg
  //tryIt("sumit") // won't work
  
  //we should restrict the use of null as its not preferred.
  //Can lead to nullpointerexception.
  
  
  val c = Nil
  println(c)
  
  def func = {
    //return type will Unit here
  }
  
  def fun = {
    throw new Exception
    //return type is Nothing as there occurred an Exception
  }
  
  
  //When return type is Option either we return Some or None
  def getAStringMayBe(num: Int):Option[String] = {
    if(num >= 0) Some("A positive number !")
    else None
  }
  
  def printResult(num: Int) = {
    getAStringMayBe(num) match {
      case Some(string) => println(string)
      case None => println("No String !")
    }
  }
  
  printResult(10)
  
  
  
  
  
  
  
  
  
  
  
  
  
}