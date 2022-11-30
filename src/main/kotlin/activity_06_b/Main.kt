package activity_06_b

import java.util.*
import kotlin.collections.ArrayList
import kotlin.collections.HashMap

/**
 * Covered Topic(s) : OOP
 *
 * Create a function that will accept an item in the library and person who will borrow the item,
 * (Use classes in Activity 05 - B).
 *
 * Throw the following exceptions :
 *
 * if the user still has 5 or more items from the library -
 * Cannot borrow due to too many items still borrowed
 *
 * if the user has unpaid dues -
 * Cannot borrow Exception due to unpaid dues
 *
 * if the item being borrowed has been reserved -
 * Cannot borrow due to reserved
 *
 * it the item is for internal use -
 * Cannot borrow due to item only used in library
 *
 * if the item is for fixing -
 * Cannot borrow due to item needs to be fixed
 *
 * You will need to add the remaining classes and
 * add the remaining methods and attributes
 * in order to implement the functionalities.
 */

fun main() {
    val libraryHashMap:HashMap<Person,Publication> = HashMap()

    var person = Person("Pat","Leones")
    var publication = Publication("Harry Potter and the Sorcerer's Stone")

    acceptItem(person,publication,libraryHashMap)

    person = Person("Jojo","Consuelo")
    publication = Publication("Somewhere Over The Rainbow")
    acceptItem(person,publication,libraryHashMap)


    person = Person("Jojo","Consuelo")
    publication = Publication("HomoSapiens")

    acceptItem(person,publication,libraryHashMap)

    person = Person("Jojo","Consuelo")
    publication = Publication("In Another Life")

    acceptItem(person,publication,libraryHashMap)

    person = Person("Jojo","Consuelo")
    publication = Publication("Life of Pi")

    acceptItem(person,publication,libraryHashMap)

    person = Person("Jojo","Consuelo")
    publication = Publication("1984")

    acceptItem(person,publication,libraryHashMap)

    person = Person("Jojo","Consuelo")
    publication = Publication("Day After Tomorrow")

    acceptItem(person,publication,libraryHashMap)

    libraryHashMap.forEach { (Person, Publication) -> println("Borrower: ${Person.firstName}, ${Person.lastName} ${Person.status}")
    println("Publication:${Publication.title}, ${Publication.status}")
    }


}

//ABOUT THE BORROWER
open class Person(var firstName: String, var lastName: String) {
    var middleName:String = ""
    var birthDate:Date = Date()
    var idNumber:String = ""
    var status:BookBorrowerStatus = BookBorrowerStatus.UNPAID

    fun fullName() = "$lastName, $firstName $middleName"

    enum class BookBorrowerStatus{
        PAID,
        UNPAID,
        PAST_DUE
    }
    fun changeStatus(status: BookBorrowerStatus){
        this.status = status
    }

}

//ABOUT THE PUBLICATION

open class Publication{
    var title: String = ""
    var datePublished: Date = Date()
    var edition:String = ""
    var ISBN: String = ""
    var status: PublicationStatus = PublicationStatus.PENDING

    fun changeStatus(status: PublicationStatus){
        this.status = status
    }
    constructor(title: String){
        this.title = title
    }

}

class Book(title: String):Publication(title){

    var authors: ArrayList<Author> = ArrayList()
    var illustrators:ArrayList<Illustrator> = ArrayList()
    var chapters:ArrayList<String> = ArrayList()
    var pages: Int = 0
    var publisher: ArrayList<Publisher> = ArrayList()

}
class Author(firstName: String, lastName: String): Person(firstName, lastName)
class Illustrator(firstName: String, lastName: String):Person(firstName,lastName)

class Publisher(var publisherName: String,
                var publisherAddress: String,
                var DateEstablished: Date)
class Article (var title: String)

class Magazine(title: String):Publication(title) {
    var articles: ArrayList<Article> = ArrayList()
    var authors:ArrayList<Author> = ArrayList()
    var illustrators: ArrayList<Illustrator> = ArrayList()
    var editors: ArrayList<Editor> = ArrayList()

    class Editor(firstName: String,lastName: String):Person(firstName,lastName)
}
class Newspaper(headline: String):Publication(headline){
    var articles: ArrayList<Article> = ArrayList()
    var authors:ArrayList<Author> = ArrayList()
    var illustrators: ArrayList<Illustrator> = ArrayList()

}
class Comics(title: String):Publication(title){
    var illustrators: ArrayList<Illustrator> = ArrayList()
    var publisher: ArrayList<Publisher> = ArrayList()

}
class AudioVideoMaterial(title: String):Publication(title){
    var category = AudioVideoMaterialCategory.UNSPECIFIED
}
enum class AudioVideoMaterialCategory{
    RECORDING,
    MOVIE,
    PRESENTATION,
    DOCUMENTARY,
    EQUIPMENT,
    UNSPECIFIED
}


enum class PublicationStatus{
    RESERVED,
    FOR_INTERNAL_USE_ONLY,
    FIXING,
    AVAILABLE,
    PENDING
}


//FUNCTION TO ADD ITEMS
fun acceptItem(person: Person,publication: Publication,hashMap: HashMap<Person,Publication>){
    hashMap.put(person,publication)

//    BORROWER EXCEPTION PAST DUE

    if (person.status == Person.BookBorrowerStatus.PAST_DUE){
        throw BorrowingPublicationException.BorrowerRestriction.UnpaidDues()
    }

//    BORROWER REACHED LIMIT
// new hashmap to contain person names value (count)
    var countPerson:HashMap<Person,Int> = HashMap()
    if (person in hashMap){
        var count = hashMap.count()
        countPerson.put(person,count)

    }
    if (countPerson.containsKey(person)){
        var compare = countPerson.getValue(person)
        if (compare >= 6){
            throw BorrowingPublicationException.BorrowerRestriction.BorrowLimitReached()
        }
    }
//    until here
// PUBLICATION RESERVED
    if (publication.status == PublicationStatus.RESERVED){
        throw BorrowingPublicationException.LibraryRestrictionException.BookIsReserved()
    }
// PUBLICATION IS BEING FIXED
    if (publication.status == PublicationStatus.FIXING){
        throw  BorrowingPublicationException.LibraryRestrictionException.BookIsBeingFixed()
    }
//    PUBLICATION IS FOR INTERNAL USE ONLY
    if (publication.status == PublicationStatus.FOR_INTERNAL_USE_ONLY){
        throw BorrowingPublicationException.LibraryRestrictionException.BookIsForInternalUseOnly()
    }
}

//FUNCTION TO CHECK ACCEPTED ITEMS
fun checkItems(acceptedItems: HashMap<Person,Publication>){

}

//FUNCTION TO REMOVE ITEMS FOR BORROWING
fun removeItem(person: Person,publication: Publication,hashMap: HashMap<Person,Publication>){
    hashMap.remove(person,publication)
}


sealed class BorrowingPublicationException(message:String):Exception(message){

    sealed class BorrowerRestriction(message: String):BorrowingPublicationException(message){
        class BorrowLimitReached(message: String = "Borrower reached book borrowing Limit") :
            BorrowerRestriction(message)

        class UnpaidDues(message: String = "Borrower has unpaid dues") : BorrowerRestriction(message)
    }

    sealed class LibraryRestrictionException(message: String) : BorrowingPublicationException(message) {
        class BookIsForInternalUseOnly(message: String = "Book is Exclusively used inside Library") :
            LibraryRestrictionException(message)

        class BookIsBeingFixed(message: String = "Book is damage and is under fixing") :
            LibraryRestrictionException(message)

        class BookIsReserved(message: String = "Book is already borrowed or is reserved") :
            LibraryRestrictionException(message)
    }
}