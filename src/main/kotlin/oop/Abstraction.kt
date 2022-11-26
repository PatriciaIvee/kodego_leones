package oop


interface PersonDAO{
//    var connectedToDatabase: Boolean
//        get() = false
//        set(value) {}
//    need to override this to implement

    fun addPerson(person: Person)
    fun getPersons(): ArrayList<Person>
    fun searchPerson(firstName:String = "", middleName:String = "", lastName:String = "")

/*
 * interface is data access object
 * it lists down all database access
 * we only define what we can do in the database, but it doesn't have implementation
 * we know how this works (interface) but we don't know how this works
 * we know input and output of each method. We simply just need to copy and paste it
 * in personStub and implement it
 */
}

class PersonStub(): PersonDAO{

    /*
     * Stub is assigned, act as a placeholder for the database
     * to replicate database operations defined in personDAO
     * stub mimics how database works so when the actual database is
     * now available we can easily change it to the actual database
     */
    var personRecords: ArrayList<Person> = ArrayList()

//    override var connectedToDatabase: Boolean = false
//        get() = super.connectedToDatabase
//        set(value) {
//            field = value
//        }
    override fun addPerson(person: Person) {
        personRecords.add(person)
    }

    override fun getPersons(): ArrayList<Person> = personRecords

    override fun searchPerson(firstName: String, middleName: String, lastName: String) {
        println("Searching Stub")
    }
}

class PersonMySQL: PersonDAO{
    override fun addPerson(person: Person) {
        println("Inserting to MySQL Database")
    }

    override fun getPersons(): ArrayList<Person> {
        println("Retrieving from MySQL Database")
        return ArrayList()
    }

    override fun searchPerson(firstName: String, middleName: String, lastName: String) {
        println("Searching in MySQL Database")
    }
}

fun main() {
    var personDAO: PersonDAO = PersonMySQL()

    when (personDAO){
        is PersonStub->{

        }
        is PersonDAO ->{

        }
    }

//example of how interfaces are used
//    personDAO.addPerson(Person())
    personDAO.getPersons()
    personDAO.searchPerson()

    val shape:Shape = Triangle()

//        you can implement this in java
//    factoring method......

    val area = shape.getArea()
}


//abstract class ModelView{
//
//    var person:Person = Person()
//
//    abstract fun Person(): Person
//
//    fun showPerson(){}
////maganda if you're trying to display your app on multiple devices
//    abstract fun showPersonDetails(string:String)
//}

abstract class Shape{

    protected var width = 0.0
    protected var height = 0.0
    protected var length = 0.0
    protected var sides = 0
    protected var dimensions = 0

/*
 * difference of abstract method and interface is:
 *
 * in interface, we just want it to contain all the required functions
 * methods in the database(example)
 *
 * in abstract there is logic already also we already have implementation
 *
 */

    abstract fun getArea() :Double
    abstract fun getPerimeter():Double
    abstract fun getVolume() : Double

    fun fillColor(color:String){

    }
    fun resize(){

    }
    fun changeOutlineColor(color:String){

    }
}
//we cannot instantiate an interface

class Rectangle: Shape(){
//  We  Extend this
    override fun getArea(): Double =length * width


    override fun getPerimeter(): Double = 2 *(length * width)


    override fun getVolume(): Double = length * width * height

}

class Triangle: Shape(){
    override fun getArea(): Double {
        TODO("Not yet implemented whatever the formula for Triangle is")
    }

    override fun getPerimeter(): Double {
        TODO("Not yet implemented whatever the formula for Triangle is")
    }

    override fun getVolume(): Double {
        TODO("Not yet implemented whatever the formula for Triangle is")
    }

}