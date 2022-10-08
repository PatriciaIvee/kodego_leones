package exercise_1

import java.time.format.DateTimeFormatter
import java.util.Date

fun main() {
        //val are labels at least here
        val dateFormat =  DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm")

        //First Section
        val titleLabel : String
        var jobPosition : String?
        var desiredSalary : Double?
        var workDateAvailability = Date()

        //Personal Information Section

        val personalInformationLabel : String
        var lastName : String
        var firstName : String
        var middleName : String
        var suffix : Any?
        var birthDate = Date()
        var age = 0 .. 17
        var gender : String
        var address: String
        var city : String
        var state : String
        var zipCode : Int
        var homePhone : Int?
        var cellPhone: Long?
        var email : String?
        var socialSecNo : String?
        var usCitizen : Boolean
        var convicted : Boolean
        var drugTest : Boolean


        //Education Section

        val educationLabel : String
        var schoolName1 : String?
        var schoolName2 : String?
        var schoolName3 : String?
        var location1 : String?
        var location2 : String?
        var location3 : String?
        var year1 : Int?
        var year2 : Int?
        var year3 : Int?
        var degree1 : String?
        var degree2 : String?
        var degree3 : String?
        var major1 : String?
        var major2 : String?
        var major3 : String?
        var trainingCertificate : String?

}