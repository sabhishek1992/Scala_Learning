

object DealWithnulls extends App{
  
  case class Address(city: String,state: String, zip: String)
  
  
  // assigning _ is same as null
  // we tend to assign with null's initially
 /* class User(email:String, password: String){
    //email, password --> are mandatory fields
    //these 3 are optional fields 
    var firstName: String = _
    var lastName: String = null
    var address: Address = null
  }
  
  val user = new User("s.abhishek1992@gmail.com","abhi1992")
  println(user.firstName.length()) //will raise nullpointerexception
  */
  
  class User(email:String, password: String){
    //Instead of assigning null's, assign None's
    var firstName: Option[String] = None
    var lastName: Option[String] = None
    var address: Option[Address] = None
  }
  val user = new User("s.abhishek1992@gmail.com","abhi1992")
  //If value is None, it will show us <not assigned>
  println(user.firstName.getOrElse("<not assigned>"))
  
  
  user.firstName = Some("Abhishek")
  user.lastName = Some("Sharma")
  user.address = Some(Address("Indore","MP","453555"))
    
  println(user.firstName.getOrElse("<not assigned>"))
  
  
  
  
  
  
  
  
  
  
}