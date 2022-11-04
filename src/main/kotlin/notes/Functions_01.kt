package notes

fun main() {

    doSomething()
    var result = add(1,2)
    // print("Result: $result")
    //print ("Result: ${add(3,4)}")
    //    returnFunction()
    println(add(2.0F, 20.0F))
}

fun doSomething() {
    print("function")

}

fun add(value1:Int, value2:Int) :Int{
    return value1 + value2
}

fun add() = 0

fun add(value1: Int) = value1
fun add(value1: Float) = value1
fun add(value1:Double, value2: Double,) = value1 + value2
fun add(value1:Long, value2: Long,) = value1 + value2
fun add(value1:Float, value2:Float = 0.0F,) = value1 + value2

//when you have multiple values under one function
//Kotlin automatically adjusts when you put a value in
// the main function

fun emptyFunction():Unit{

}
fun returnFunction():Unit{
    var result = add(30,4)
    println("Start Function")

    if (result>10)
        return
    else
        println("Result:$result")

}