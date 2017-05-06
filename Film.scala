/**
  * Created by Tom on 30/04/2017.
  */
class Film (x: String, y: Int, z: Double, d: Director) {

  var name: String
  var yearOfRelease: Int
  var imdbRating: Double
  var director: Director
  def directorsAge: Int = {
    yearOfRelease - director.yearOfBirth
  }
  def copy: Film = {
    this
  }
  def copy(aName: String): Film = {
    this.name = aName
    this
  }


}
