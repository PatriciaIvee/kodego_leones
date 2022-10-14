package notes

fun main() {
    var grade: Float = 70.0F
    var gradeInCard: Float = 0.0F

    if (grade in (94.0F).rangeTo(100.0F)) {
        gradeInCard = 1.0F
    } else if (grade in (89.0F).rangeTo(93.0F)) {
        gradeInCard = 1.5F
    } else if (grade in (83.0F).rangeTo(88.9F)) {
        gradeInCard = 2.0F
    } else if (grade in (78.0F).rangeTo(82.9F)) {
        gradeInCard = 2.5F
    } else if (grade in (72.0F).rangeTo(77.9F)) {
        gradeInCard = 3.0F
    } else if (grade in (66.0F).rangeTo(71.9F)) {
        gradeInCard = 3.5F
    } else if (grade in (60.0F).rangeTo(65.9F)) {
        gradeInCard = 4.0F
    }else {
        gradeInCard = 5.0F
    }

//    version 2: better
    when {
         grade >(94.0F) -> {
            gradeInCard = 1.0F
        }
        grade in (89.0F).rangeTo(93.0F) -> {
            gradeInCard = 1.5F
        }
        grade in (83.0F).rangeTo(88.9F) ->{
            gradeInCard = 2.0F
        }
        grade in (78.0F).rangeTo(82.9F) -> {
            gradeInCard = 2.5F
        }
        grade in (72.0F).rangeTo(77.9F) -> {
            gradeInCard = 3.0F
        }
        grade in (66.0F).rangeTo(71.9F) -> {
            gradeInCard = 3.5F
        }
        grade in (60.0F).rangeTo(65.9F) -> {
            gradeInCard = 4.0F
        }else -> {
            gradeInCard = 5.0F
        }
    }

//    version 3 : shortest
/*    the shorter the line the easier it is to read the code
and the easier to read the better you'll understand it
 */

    when(grade) {
        in (94.0F).rangeTo(Float.MAX_VALUE) -> {
            gradeInCard = 1.0F
        }
        in (89.0F).rangeTo(93.0F) -> {
            gradeInCard = 1.5F
        }
        in (83.0F).rangeTo(88.9F) ->{
            gradeInCard = 2.0F
        }
        in (78.0F).rangeTo(82.9F) -> {
            gradeInCard = 2.5F
        }
        in (72.0F).rangeTo(77.9F) -> {
            gradeInCard = 3.0F
        }
        in (66.0F).rangeTo(71.9F) -> {
            gradeInCard = 3.5F
        }
        in (60.0F).rangeTo(65.9F) -> {
            gradeInCard = 4.0F
        }else -> {
        gradeInCard = 5.0F
    }
    }
}