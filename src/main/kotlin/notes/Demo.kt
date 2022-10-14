package notes

fun main(args: Array<String>) {

    var someValue = (0).plus(4)

    print("Enter your name: ")
    var userInput = readLine().toString()
//    we now use readln() instead of readLine(). readLine is for older version

    var number = Integer.parseInt(userInput as String)
//    parseInt is used to convert a number or integer into a string
}