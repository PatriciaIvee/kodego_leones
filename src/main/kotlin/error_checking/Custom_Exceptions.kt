package error_checking

class CellNumberException(message:String): Exception(message)


//sealed class is similar to enum, but it is highly restricted and has hierarchy
//used if there is strict hierarchy
//can never instantiate this

sealed class MobileNumberException(message:String): Exception(message) {
//Specific things used
    sealed class InvalidLength(message:String): MobileNumberException(message){
        class MobileNumberTooShort(message: String = "Length is Short") : InvalidLength(message)
        class MobileNumberTooLong(message: String = "Length is Long") : InvalidLength(message)
    }

    sealed class ContainsCharacters(message: String) : MobileNumberException(message)

    sealed class UnknownProvider(message: String) : MobileNumberException(message) {
        sealed class NotGlobeProvider(message: String) : UnknownProvider(message)
        sealed class NotSmartProvider(message: String) : UnknownProvider(message)
        sealed class NotTouchMobileProvider(message: String) : UnknownProvider(message)
        sealed class NotGomoProvider(message: String) : UnknownProvider(message)
        sealed class NotTalkNTextProvider(message: String) : UnknownProvider(message)
    }
}

fun main() {
    var cellNumber = "1111 111 111"

    try {
        checkCellNumber(cellNumber)

    }catch (e:Exception){
        e.printStackTrace()
    }

}

fun checkCellNumber(cellNumber:String){
    if(cellNumber.length > 11) {
//        throw CellNumberException("Invalid Length")
        throw MobileNumberException.InvalidLength.MobileNumberTooLong()
    }
    if(cellNumber.length < 11) {
        throw CellNumberException("Invalid Length")
        throw MobileNumberException.InvalidLength.MobileNumberTooShort()
    }
    if(!isNumeric(cellNumber)) {
//        contains a to z
        throw CellNumberException("Contains Alphabets")
    }
}

fun isNumeric(toCheck:String): Boolean{
    return toCheck.all{char -> char.isDigit()}
}

fun checkMobileNumberv2(cellNumber: String) =
    try {
        true

        try{
        throw CellNumberException("Invalid Length")
        } catch(e:Exception){

        }
    }catch(e:Exception){
        false
    }

//you can put another try within the try