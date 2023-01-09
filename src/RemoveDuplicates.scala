

object RemoveDuplicates extends App{
  
  val a = Array(1,2,3,4,4)
  
  //convert to Set
  a.toSet.toArray
  
  //second approach
  a.distinct
  
  val b = List("a","a","b","c","c")

  b.distinct
  b.toSet.toList
}