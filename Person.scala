/**
  * Created by Tom on 30/04/2017.
  */
class Person {
  object compPerson {
    def apply(name: String): (String, String) = {
      val fullName = name
      val splitName= fullName.split(" ")
      (splitName(0), splitName(1))
    }
  }
}
