package activity_05_b_oop

import java.util.Date


/**
 * 1. A book, a magazine, a newspaper and comics inherits from a Publication class.
 * Identify the attributes and the methods for the publication.
 *
 * 2. There are several Audio / Video materials, Recordings, Documentary, Movies and powerpoint materials.
 * What will you use to present the different types of Audio / Video presentation, a class or an enum? Why?
 * Implement your answer in code.
 *
 * 3. Authors and Illustrators seem to have similar data?
 * What will you use to present the two a class or an enum or will you keep them as is? Why?
 * Implement your answer in code.
 */



open class Person(var firstName: String, var lastName: String) {
    var middleName:String = ""
    var birthDate:Date = Date()

    fun fullName() = "$lastName, $firstName $middleName"

}

open class Publication{
    var title: String = ""
    var datePublished: Date = Date()
    var edition:String = ""
    var ISBN: String = ""

}

class Book:Publication(){

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

class Magazine: Publication() {
    var articles: ArrayList<Article> = ArrayList()
    var authors:ArrayList<Author> = ArrayList()
    var illustrators: ArrayList<Illustrator> = ArrayList()
    var editors: ArrayList<Editor> = ArrayList()

    class Editor(firstName: String,lastName: String):Person(firstName,lastName)
}
class Newspaper: Publication(){
    var headline: String = ""
    var articles: ArrayList<Article> = ArrayList()
    var authors:ArrayList<Author> = ArrayList()
    var illustrators: ArrayList<Illustrator> = ArrayList()

}

class Comics: Publication(){
    var illustrators: ArrayList<Illustrator> = ArrayList()
    var publisher: ArrayList<Publisher> = ArrayList()

}

enum class AudioVideoMaterial{
    RECORDING,
    MOVIE,
    PRESENTATION,
    DOCUMENTARY,
    EQUIPMENT,
    UNSPECIFIED
}

fun search(){}
fun addMaterial(){}
fun remove(){}