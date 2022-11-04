package notes

fun main() {
    print("Result : ${subtract(1,100L)}")
//    you can interchange value orders
    print("Result : ${subtract(value2 = 300L, value1 = 2)}")
}
fun subtract():Int? = 0

fun subtract(value1:Int, value2:Long? = 0) = (value2?:value2 ?: 0) - value2!!
//ibabalik niya long type automatic upgrade value

fun subtract(value1:Int, value2:Int? = 0): Int? = (value2?:value2 ?: 0) - value2!!
//pag hindi null yung value 2 ieenter niya yung value 2  pag null 0 ibabalik niya

