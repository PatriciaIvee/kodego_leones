fun main() {
    var userName : String? = null
    var needAnyHelp : String?  = null

    print("Enter your name: ")
    userName = readLine().toString()
    println("Hi! $userName")
    println ("Do you need any help? (Y/N)")
    needAnyHelp = readLine().toString()

/*   if (needAnyHelp == "Y" || needAnyHelp == "y") {
        println("How may I help you?")
        println("Understandable. Thank You very much.")
    }
*/
    if (needAnyHelp.uppercase() == "Y") {
//        or needAnyHelp.lowercase() == "y"
        println("How may I help you?")
    } else if (needAnyHelp.uppercase() == "N") {
//        or needAnyHelp.lowercase() == "n"
        println("Don't forget I am here...")
    }else {
        println("Oh okay...")
    }
    println("Thank you very much!")
}