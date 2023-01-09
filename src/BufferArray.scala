import scala.collection.mutable.ArrayBuffer


object BufferArray extends App{
  
  val a = ArrayBuffer(1,2,3,4)
 
  a += 5
  a += 6
  a.append(4,5,6,3)
  
  println(a)
  
  val b = Array(1,2,3,4)
  //no append method to add more elements
}