

object FactoryDesignPattern extends App {
  
  //with un-implemented methods
  trait Computer {
    def ram:String
    def hdd:String
    def cpu:String
  }
  
  case class PC(ram:String,hdd:String,cpu:String) extends Computer{
    
  }
  
  case class Laptop(ram:String,hdd:String,cpu:String) extends Computer{
    
  }
  
  //hide instance creation logic inside below object
  object ComputerFactory{
    
    def apply(compType:String,ram:String,hdd:String,
        cpu:String) = compType match {
            
      case "PC" => PC(ram,hdd,cpu) //auto-apply method is called. Case classes
      case "Laptop" => Laptop(ram,hdd,cpu)
    }
  }
  
  //To create any type of Computer, ComputerFactory needs to be called
  //It hide instantiation logic inside.
  
  
  val pc1 = ComputerFactory("PC","16gb","1tb","2.3gz")
  
  println(pc1)
  
  
  
  
  
}