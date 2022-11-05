package exercise_1

import java.util.*
import kotlin.collections.ArrayList

class ApplicationForm{
    var positionApplyingFor = ""
    var dateAvailableForWork = Date()
    var desiredSalary = 0.0

    var personalInfo : PersonalInfo = PersonalInfo()
    var education:ArrayList<Education>  = ArrayList()
    var employment :ArrayList<Employment>  = ArrayList()
    var reference :ArrayList<References>  = ArrayList()
}



class PersonalInfo {
    var lastName : String = ""
    var firstName : String = ""
    var middleName : String = ""
    var address: String? = ""
//    var suffix : Any? = ""
//    var birthDate = Date()
//    var age :Int? = 0
//    var gender : String = ""

    var city : String? = ""
    var state : String? = ""
    var zipCode : Int = 0

    var sss : String? = ""
    var usCitizen : Boolean = false
    var convicted : Boolean = false
    var drugScreenTest : Boolean = false

    var contacts: ArrayList<Contacts> = ArrayList()
}

class Contacts(var type: String, var details: String)

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
}

class Supervisor(var firstName:String = "",
                 var middleName:String = "",
                 var lastName: String = "",
                 var supervisorTitle:String? = "")

class References(var firstName:String = "",
                 var middleName:String = "",
                 var lastName: String = "",
                 var title:String = "",
                 var company: String,
                 var contacts: Contacts)