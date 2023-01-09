

object Val extends App{
  
  //strict val[default way] vs lazy val
  
  val r = 10
  val area = {
    println("Calculating area of circle")
    3.14*r*r
  }//called immediately. strict way.
  
  println(area)
  
  val r1 = 10
  lazy val area1 = {
    println("Calculating area of circle")
    3.14*r1*r1
  }//won't be called immediately. lazy way.
  //executed when we call area
  
  println(area1)
  
}