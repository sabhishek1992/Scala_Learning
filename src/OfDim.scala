

object OfDim extends App{
  
  //creates multi-dimensional array
  val myArray = Array.ofDim[Int](2,2) // 2 by 2 sized array
  
  myArray(0)(0) = 1
  myArray(0)(1) = 2
  
  myArray(1)(0) = 3
  myArray(1)(1) = 4
  
  
  for(i <- 0 to 1){
    for(j <- 0 until 2){
      print(myArray(i)(j)+" ")
    }
    println
  }
}