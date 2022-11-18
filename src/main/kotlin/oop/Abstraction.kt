package oop


interface PersonDAD{
    fun addPerson(person: Person)
    fun getPersons(): ArrayList<Person>
    fun searchPerson(firstName:String = "", middleName:String = "", lastName:String = "")


}

class PersonStub(): PersonDAD{
    var personRecords: ArrayList<Person> = ArrayList()

    override fun addPerson(person: Person) {
        personRecords.add(person)
    }

    override fun getPersons(): ArrayList<Person> = personRecords

    override fun searchPerson(firstName: String, middleName: String, lastName: String) {
        println("Searching Stub")
    }
}

class PersonMySQL: PersonDAD{
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
    var personDAD: PersonDAD = PersonStub()

    when (personDAD){
        is PersonStub->{

        }
        is PersonStub ->{

        }
    }

//example of how interfaces are used
//    personDAD.addPerson(Person())
    personDAD.getPersons()
    personDAD.searchPerson()

}


abstract class ModelView{

    var person:Person = Person()

    abstract fun Person(): Person

    fun showPerson(){}
//maganda if you're trying to display your app on multiple devices
    abstract fun showPersonDetails(string:String)
}