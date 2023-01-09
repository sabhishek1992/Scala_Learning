

object DiamondProblem extends App{
  
  class A{
    def func1 = {println("Calling class A's func1")}
  }
  
  class B extends A{
     override def func1 = {println("Calling class B's func1")}
  }
  
  /*class C extends A,B{ // not possible
  }*/
  
//  println(new C().func1)
  
  //Multiple-Inheritance
  
  trait traitD{
    def name = println("This is grandparent trait : D")
  }
  
  trait traitA{
    def name = println("This is grandparent trait : A")
  }
  
  trait traitB extends traitA {
    override def name = {
      println("B is a child of A.")
      super.name
    }
  }
  
  trait traitC extends traitA{
    override def name = {
      println("C is a child of A.")
      super.name
    }
  }
  
  //extends from 2 traits
  object grandChild extends traitC with traitB
  
  //1st preference : traitB, 2nd preference : traitC
  //it starts from right to left : priority order is decided
  //
  grandChild.name
  
  //Linearization rule comes into play to decide the call hierarchy.
  //grandChild -> traitB -> traitC -> traitA
  
  
  
  
  
  
  
  
  
}