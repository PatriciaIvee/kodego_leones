package activity_06_b

import java.util.*

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
    open var title: String = ""
    open var datePublished: Date = Date()
    open var edition:String = ""
    var ISBN: String = ""

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


enum class BookStatus{
    RESERVED,
    FOR_INTERNAL_USE_ONLY,
    FIXING,
    AVAILABLE
}

//FUNCTION TO ADD THE ITEMS FOR BORROWING
fun acceptItem(publication: Publication, person: Person){

}

//FUNCTION TO REMOVE ITEMS FOR BORROWING
fun removeItem(publication: Publication,person: Person){

}


sealed class BorrowingPublicationException(message:String):Exception(message){

    sealed class BorrowerRestriction(message: String):BorrowingPublicationException(message){
        class BorrowLimitReached(message: String = "Borrower reached book borrowing Limit") :
            BorrowerRestriction(message)

        class UnpaidDues(message: String = "Borrower has unpaid dues") : BorrowerRestriction(message)
    }

    sealed class LibraryRestrictionException(message: String):BorrowingPublicationException(message) {
        class BookIsForInternalUseOnly(message: String = "Book is Exclusively used inside Library") :
            LibraryRestrictionException(message)

        class BookIsBeingFixed(message: String = "Book is damage and is under fixing") :
            LibraryRestrictionException(message)

        class BookIsReserved(message: String = "Book is already borrowed or is reserved") :
            LibraryRestrictionException(message)
    }
}