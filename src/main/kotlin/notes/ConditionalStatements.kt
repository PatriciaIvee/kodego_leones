package notes

fun main() {
    var hasCough = false
    var temperature = 36.5
    var hasFever = false

    if (hasCough || hasFever || temperature > 37) {
        println("Congratulations! You have Covid!")
    }else {
        println("You're still healthy.")
    }
    var minorAgeRange = 0 .. 17
    var age = 90
    if (age in minorAgeRange) {
        println("You're old.")
    }
}