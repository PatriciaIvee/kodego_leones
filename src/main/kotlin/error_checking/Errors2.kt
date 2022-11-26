package error_checking

fun main() {
    try {
//        10/0
        lateinit var emptyClass: EmptyClass
        emptyClass = EmptyClass("Something")
        emptyClass.doSomething()

        var mobileNumber: String?  = null
        println("${mobileNumber!!.length}")

    }catch (ae:ArithmeticException){
        println("You divided by zero")
    }catch (ue:UninitializedPropertyAccessException){
        println("Please instantiate the class you used")
    }catch (e:Exception){
        println("Something went wrong")
        e.printStackTrace()
    }finally {

    }
}