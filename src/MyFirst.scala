

object MyFirst extends App{
 
  def add(num: Int,incrementBy: Int) = {
    num + incrementBy
  }
  
  println(add(5,1))
  
  //better way - pass default arg value
  def add1(num: Int = 8,incrementBy: Int = 1) = {
    num + incrementBy
  }

  println(add1(5))
  println(add1(5,6))
  println(add1(incrementBy = 2)) // named args
  
  
  //variable length args
  def printFunc(name: String*) = {
    for(i <- name){
      println(i)
    }    
  }
  
  printFunc("Abhishek","Hariom","Vikas","Nilesh")
  printFunc()
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}