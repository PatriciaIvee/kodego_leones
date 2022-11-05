package exercise_1

import java.util.*


class personalInformation {
    var lastName : String = ""
    var firstName : String = ""
    var middleName : String = ""
    var suffix : Any? = ""
    var birthDate = Date()
    var age :Int? = 0
    var gender : String = ""
    var address: String = ""
    var city : String = ""
    var state : String = ""
    var zipCode : Int = 0
    var homePhone : Int? = 0
    var cellPhone: Long? = 0
    var email : String? = ""
    var socialSecNo : String? = ""
    var usCitizen : Boolean = false
    var convicted : Boolean = false
    var drugTest : Boolean = false
}

class education {
    var schoolName1 : String? = ""
    var schoolName2 : String? = ""
    var schoolName3 : String? = ""
    var location1 : String? = ""
    var location2 : String? = ""
    var location3 : String? = ""
    var year1 : Int? = 0
    var year2 : Int? = 0
    var year3 : Int? = 0
    var degree1 : String? = ""
    var degree2 : String? = ""
    var degree3 : String? = ""
    var major1 : String? = ""
    var major2 : String? = ""
    var major3 : String? = ""
    var trainingCertificate : String? = ""
}

class employment {
    var employer :String? = ""
    var datesEmployed:Date = Date()
    var workPhone:String? = ""
    var payRate:IntRange = 0 .. 1000_000_000
    var address:String? = ""
    var state:String? = ""
    var zip:Int? = 0
    var position:String? = ""
    var dutiesPerformed:String? = ""
    var supervisorName:String? = ""
    var supervisorTitle:String? = ""
    var reasonForLeaving:String? = ""
    var contactSupervisorAvailable:Boolean = false
}

class references {
    var name1:String? = ""
    var name2:String? = ""
    var name3:String? = ""
    var title1:String? = ""
    var title2:String? = ""
    var title3:String? = ""
    var company1:String? = ""
    var company2: String? = ""
    var company3: String? = ""
    var phone1: Long? = 0
    var phone2: Long? = 0
    var phone3: Long? = 0
}