package exercise_1

import java.util.Date

fun main() {
        val title : String = "****** Application for Employment ******"
        var jobPosition : String = "CEO of KodeGo"
        var desireSalary : Double = 1_000_000.00
        var workDateAvailability = Date(2023, 1 ,20)
        val personalInformation : String = "*** Personal Information ******"
        var lastName : String = "Leones"
        var firstName : String = "Patricia Ivee"
        var middleName : String  = "Leones"
        var birthDate = Date(1999, 1, 22)
        var age : Int = 25
        var gender : String = "Female"
        var address: String = "#1 Guyabano St., X Village"
        var city : String = "Taguig"
        var state : String = "Metro Manila"
        var zipCode : Int = 1630
        var homePhone : Int = 87000
        var cellPhone: Int = 123456789
        var email : String = "patriciaiveeleones@gmail.com"
        var socialSecNo : Int = 12345
        var usCitizen : Boolean = false
        var convicted : Boolean = false
        var drugTest : Boolean = false
        val education : String = "*** Education ******"
        var schoolName : String = "Treston International College"
        var location : String = "Taguig City"
        var year : Int  = 4
        var degree : String = "BS Tourism Management "
        var major : String = "Major in Recess"
        var trainingCert : String = "Flight attendant training"

        println(title)
        println("Position you are applying for: $jobPosition")
        println("Desired Salary : $desireSalary")
        println("Date Available for Work : $workDateAvailability")
        println()
        println(personalInformation)
        println("Name : $lastName, $firstName $middleName")
        println("Birthdate: $birthDate Age : $age Gender : $gender")
        println("Address : $address, $city City, $state $zipCode")
        println("Home Phone : $homePhone Cellphone : $cellPhone Email Address : $email")
        println("Social Security Number: $socialSecNo")
        println("Are you a US Citizen? : $usCitizen")
        println("Have you ever been convicted of a felony? : $convicted")
        println("If selected for employment are you willing to submit to a pre-employment drug screening test? : $drugTest")
        println ()
        println(education)
        println("$schoolName  $location  $year  $degree $major")
        println("Other training, certifications, or licenses held : $trainingCert")
}