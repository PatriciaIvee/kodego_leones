package testing

import error_checking.CellNumberException
import error_checking.MobileNumberException
import error_checking.isNumeric


class FormChecker {
    fun checkCellNumber(cellNumber: String) {
        if (cellNumber.length > 11) {
//        throw CellNumberException("Invalid Length")
            throw MobileNumberException.InvalidLength.MobileNumberTooLong()
        }
        if (cellNumber.length < 11) {
//            throw CellNumberException("Invalid Length")
            throw MobileNumberException.InvalidLength.MobileNumberTooShort()
        }
        if (!isNumeric(cellNumber)) {
//        contains a to z
            throw CellNumberException("Contains Alphabets")
        }
    }
}

fun getTax(values:ArrayList<Int>) : Double{
    var sum = 0
    if (values.size == 0)
        return 0.0
    for (value in values){
        sum += value
    }
    return sum * .12
}
