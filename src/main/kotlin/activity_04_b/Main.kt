package activity_04_b


import java.util.Date

/**
 * Covered Topic(s) : Classes
 * Instructions :
 * 1. Use class to represent the Book rather string.
 * A book has a title, authors, year published, edition, ISBN, publisher.
 * A book may have a list of chapters.
 * A book has a number of pages.
 * 2. Add a class for magazines.
 * A magazine has an editor, a title, a month published, a year published
 * 3. Add a class for newspaper.
 * A newspaper has a name, day published, month published, year published and headline.
 * 4. Add a class Authors.
 * Authors have firstName, lastName, middleName, date of birth.
 * 5. Add a class Comics.
 * A comic has a title, month published, year published, illustrators, publisher.
 * Create a class illustrator.
 * Illustrator have firstName, lastName, middleName, date of birth.
 * 6. Add a class Article.
 * An article has a title, content, author
 * A Newspaper, and magazine have articles.
 * 7. Create a search function to search for the title of a magazine, newspaper, comics.
 * 8. Create a function that will list the name of the magazine, newspaper, comics or book, author has written in.
 * 9. Create a class for Audio / Video recording
 * The class should show whether the recording has a video or audio or both.
 * It has a length, date recorded, title, publisher.
 * 10. Create a Publisher class.
 * A publisher a name, address and date established.
 */

class Book {
    var title:String = ""
    var authors: ArrayList<Authors> = ArrayList()
    var yearPublished = Date()
    var edition:String = ""
    var ISBN: String = ""
    var publisher: String = ""
    var chapters:ArrayList<String> = ArrayList()
    var pages: Int = 0

}

class Authors{
    var lastName: String = ""
    var firstName: String = ""
    var middleName: String = ""
    var birthDate = Date()
}

class Magazine {
    var editor: String = ""
    var title: String = ""
    var monthPublished =""
    var yearPublished:Int = 0
    var articles: ArrayList<Article> = ArrayList()
}

class Newspaper {
    var name: String = ""
    var dayPublished: Int = 0
    var monthPublished:String = ""
    var yearPublished: Int = 0
    var headline: String = ""
    var articles: ArrayList<Article> = ArrayList()

}

class Comics {
    var comicTitle: String = ""
    var monthPublished = ""
    var yearPublished:Int = 0
    var illustrators:ArrayList<Illustrators> = ArrayList()
    var publisher: ArrayList<Publishers> = ArrayList()

    class Illustrators {
        var lastName: String = ""
        var firstName: String = ""
        var middleName: String = ""
        var birthDate = Date()
    }
}

class Article {
    var articleTitle: String = ""
    var content: String = ""
    var author: ArrayList<Authors> = ArrayList()
}

class Publishers {
    var name: String = ""
    var address: String = ""
    var dateEstablished = Date()
}

class AudioVideoRecording {
    var containsVideoRecording: Boolean = false
    var containsAudioVideoRecording: Boolean = false
    var containsBothVideoAudioVideoRecording: Boolean = false
}

fun searchTitle(){}
fun listThis(){}