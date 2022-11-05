package notes

class Area(val locationX: Double,
           val locationY:Double){
    //attributes of Area/ primary constructor

    var name = ""
        get() = field
        private set
    init {} //do this before the constructor

    companion object {
        private var objectCount = 0
        fun increaseCount(): Int {
            objectCount += 1
            return objectCount
        }
    }

    constructor() : this(0.0,0.0)
    constructor(locationX: Double,
                locationY: Double,
                name: String) : this(locationX,locationY){
                    this.name = name
                }
    private constructor(name: String) : this(0.0,0.0){
        this.name = name
    }

    fun useCompanionObject(){
        increaseCount()
//        counter ++
        println("Object Count[$name] = $objectCount")
//        println("Object Count[$name] = $counter")
    }


}

fun main() {
    var a = Area()
//    a.name = "Area A"
    a.useCompanionObject()

    var b = Area()
//    b.name = "Area B"
    b.useCompanionObject()

    var c = Area()
//    c.name = "Area C"
    c.useCompanionObject()
}

