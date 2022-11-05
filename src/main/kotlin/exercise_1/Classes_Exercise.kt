package exercise_1

import java.util.*
import kotlin.collections.ArrayList

fun main() {
    val form = ApplicationForm()
//memory address is permanent in a way
//    no instantiation
    form.positionApplyingFor = "Janitor"
    form.positionApplyingFor = "Programmer"

    println("Position : ${form.positionApplyingFor}")
}

class ApplicationForm{
    var positionApplyingFor = ""
        get() = "$field"
        set(value) {
            field = "$value"
        }
//        get() = "Getting $field"
//        set(value) {
//            field = "Setting $value"
//            println("$field")
//        }
    var dateAvailableForWork = Date()
    var desiredSalary = 0.0

    lateinit var personalInfo : PersonalInfo
    var education:ArrayList<Education>  = ArrayList()
    var employment :ArrayList<Employment>  = ArrayList()
    var reference :ArrayList<References>  = ArrayList()

    fun addPersonalInfo(lastName : String?,
                        firstName : String?,
                        middleName : String?,
                        address: String?,
                        city : String?,
                        state : String,
                        zipCode : Int,

                        sss : String?,
                        usCitizen : Boolean?,
                        convicted : Boolean?,
                        drugScreenTest : Boolean?){
        personalInfo = PersonalInfo()

        with(personalInfo){
            this.lastName = lastName
            this.firstName = firstName
            this.middleName = middleName
            this.address = address
            this.city  = city
            this.state = state
            this.zipCode = zipCode

            this.sss = sss
            this.usCitizen = usCitizen
            this.convicted = convicted
            this.drugScreenTest = drugScreenTest

        }
//        use apply for best for assigning values
        personalInfo.apply {
            this.lastName = lastName
            this.firstName = firstName
            this.middleName = middleName
            this.address = address
            this.city  = city
            this.state = state
            this.zipCode = zipCode

            this.sss = sss
            this.usCitizen = usCitizen
            this.convicted = convicted
            this.drugScreenTest = drugScreenTest }

        personalInfo.run {
            this.lastName = lastName
            this.firstName = firstName
            this.middleName = middleName
            this.address = address
            this.city  = city
            this.state = state
            this.zipCode = zipCode

            this.sss = sss
            this.usCitizen = usCitizen
            this.convicted = convicted
            this.drugScreenTest = drugScreenTest }

        personalInfo.let {
            it.lastName = lastName
            it.firstName = firstName
            it.middleName = middleName
            it.address = address
            it.city  = city
            it.state = state
            it.zipCode = zipCode

            it.sss = sss
            it.usCitizen = usCitizen
            it.convicted = convicted
            it.drugScreenTest = drugScreenTest  }

        personalInfo.also {
            it.lastName = lastName
            it.firstName = firstName
            it.middleName = middleName
            it.address = address
            it.city  = city
            it.state = state
            it.zipCode = zipCode

            it.sss = sss
            it.usCitizen = usCitizen
            it.convicted = convicted
            it.drugScreenTest = drugScreenTest }
    }
    fun addPersonalInfoContact(type:String,
                               details: String){

    }

}
//late init should not be nullable only for var

//objects can be nullable
class PersonalInfo {
    var lastName : String? = ""
    var firstName : String? = ""
    var middleName : String? = ""
    var address: String? = ""
//    var suffix : Any? = ""
//    var birthDate = Date()
//    var age :Int? = 0
//    var gender : String = ""

    var city : String? = ""
    var state : String? = ""
    var zipCode : Int = 0

    var sss : String? = ""
    var usCitizen : Boolean? = false
    var convicted : Boolean? = false
    var drugScreenTest : Boolean? = false

    var contacts: ArrayList<Contacts> = ArrayList()
}

class Contacts(var type: String, var details: String){
    constructor()
    : this("","")
}

class Education {
    var schoolName : String? = ""
    var location : String? = ""
    var yearsAttended : Int? = 0
    var degreeReceived : String? = ""
    var major : String? = ""
    var trainingCertificate : String? = ""
}

class Employment {
    var employer :String = ""
    var employmentStartDate:Date = Date()
    var employmentEndDate:Date = Date()
    var workPhone:String? = ""
    var payRateMinimum:Double= 0.0
    var payRateMaximum:Double= 0.0
    var address:String? = ""
    var state:String? = ""
    var city: String = ""
    var zip:Int? = 0

    var position:String? = ""

    var dutiesPerformed:ArrayList<String> = ArrayList()

    var supervisors: ArrayList<Supervisor> = ArrayList()

    var reasonForLeaving:String? = ""
    var contactSupervisorAvailable:Boolean = false

    class Supervisor(var firstName:String = "",
                     var middleName:String = "",
                     var lastName: String = "",
                     var supervisorTitle:String? = ""){
        constructor()
        : this("","","","")
    }
}

class References(var firstName:String = "",
                 var middleName:String = "",
                 var lastName: String = "",
                 var title:String = "",
                 var company: String,
                 var contacts: Contacts?){
//    optional things when inside class {}
   constructor(): this("","","","","",null)
}
//optional attributes are usually last

