package error_checking

fun main() {
    try {
        lateinit var emptyClass: EmptyClass
        emptyClass = EmptyClass("Something")
        emptyClass.doSomething()

        var mobileNumber: String?  = null

    }catch (e:Exception){
        e.printStackTrace()
    }finally {

    }
}