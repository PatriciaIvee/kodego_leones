package activity_05_b_oop

import activity_04_b.Article
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

    var authors: ArrayList<Authors> = ArrayList()
    var illustrators:ArrayList<Illustrator> = ArrayList()
    var chapters:ArrayList<String> = ArrayList()
    var pages: Int = 0

    class Authors(firstName: String,lastName: String): Person(firstName, lastName)
    class Illustrator(firstName: String, lastName: String):Person(firstName,lastName)
}
class Magazine: Publication(){
    var articles: ArrayList<Article> = ArrayList()

    class Illustrator(firstName: String, lastName: String):Person(firstName,lastName) {
    }
}
class Newspaper: Publication(){
    var headline: String = ""
    var articles: ArrayList<Article> = ArrayList()
    class Illustrator(firstName: String, lastName: String) :Person(firstName,lastName)


}

class Comics: Publication(){

}

enum class AudioVideoMaterial{

}