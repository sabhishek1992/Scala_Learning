

object TryCatch extends App{
  
  try{
    val b = 5/0
  }catch{
    case e: Exception => println("please give denom other than 0")
  }
  finally{
    println("I will always execute") 
  }
}