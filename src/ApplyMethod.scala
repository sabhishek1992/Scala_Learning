

object ApplyMethod extends App{
  
  //companian object
  object Person{
    def apply(name: String, age: Int) ={
      s"$name is $age years old !"
    }
  }
  
  //construct Person object
  println(Person.apply("Abhishek",20))
  
  //construct Person object 
  println(Person("Abhishek",30)) // still apply method will be called.
  //Here we are calling Person object as function.
  
  println(Person)
  
  
  case class Person_New(name: String,age: Int)
  
  Person_New("Abhi",30) // internally apply method is called.
  
  Person_New.apply("Abhi", 30)
    
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}