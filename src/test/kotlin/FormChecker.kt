import error_checking.MobileNumberException
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.api.Test
import testing.FormChecker


internal class SampleTest {
    val formChecker: FormChecker = FormChecker()

    @Test

    fun checkCellNumberLength() {
        assertThrows<MobileNumberException> {
            formChecker.checkCellNumber("091111111119")
        }
        assertThrows<MobileNumberException.InvalidLength> {
            formChecker.checkCellNumber("091111111119")
        }
        assertThrows<MobileNumberException.InvalidLength.MobileNumberTooLong> {
            formChecker.checkCellNumber("091111111119")
        }
        assertThrows<MobileNumberException.InvalidLength.MobileNumberTooShort> {
            formChecker.checkCellNumber("091119")
        }

    }
}