package error_checking

import java.lang.Exception

fun main() {
    try {
        var result = 10/0
    } catch (e:Exception){
        e.printStackTrace()
//        checks where the error is (information)
        println("Catch was executed")

    } finally {
        println("Finally was executed")
    }
// you can only put try catch to things that you're watching for
    try{
        lateinit var emptyClass: EmptyClass

        emptyClass = EmptyClass("Something")
        emptyClass.doSomething()
    }catch (_:Exception){
        println("Something went wrong")
    }


//    var mobileNumber: String? =""
//    println("${mobileNumber!!.length}")

    println("Completed Execution")

}

class EmptyClass(var className: String) {
    fun doSomething(){}
}
