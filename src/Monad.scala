

object Monad extends App{
  
  val list1 = List(1,2,3,4)
  val list2 = List(5,6,7,8)
  
  //flatmap : returns multiple values for 1 value
  //map : returns 1 o/p for 1 i/p
  val list3 = list1.flatMap{
    x => list2.map(y => x+y)
  }
  
  //List(L)
  
  //List(6, 7, 8, 9, 7, 8, 9, 10, 8, 9, 10, 11, 9, 10, 11, 12)
  println(list3) 
}