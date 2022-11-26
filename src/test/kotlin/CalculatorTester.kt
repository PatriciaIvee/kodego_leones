import org.junit.jupiter.api.Test
import testing_02.Calculator
import kotlin.test.assertEquals
import kotlin.test.assertNull

internal class CalculatorTester {
    /*
    * 1 - amount > 0, headCount > 0 -- Ideal Input
    * 2 - amount = 0, headCount > 0 -- amount is Zero
    * 3 - amount > 0, headCount = 0 -- headCount is Zero
    * 4 - amount > 0, headCount < 0 -- headCount is less than Zero
    * 5 - amount < 0, headCount > 0 -- amount is less than Zero
    * 6 - amount = 0, headCount = 0 -- amount is Zero, headCount is Zero
    * 7 - amount < 0, headCount < 0 -- amount is less than Zero, headCount is less than Zero
    * 8 - amount = 0, headCount < 0 -- amount is Zero, headCount is less than Zero
    * 9 - amount < 0, headCount = 0 -- headCount is Zero, amount is less than Zero
    *
     */

//    always ask when its about money

    @Test
    fun amountIsZero(){
        var calculator:Calculator = Calculator()

        assertEquals(0.0, calculator.computeContribution(0.0,10))
        assertEquals(0.0, calculator.computeContribution(0.0,0))
        assertEquals(0.0, calculator.computeContribution(0.0,-10))

    }

    @Test
    fun headCountIsZero(){
        var calculator:Calculator = Calculator()

        assertEquals(0.0, calculator.computeContribution(10_000.0,0))
        assertEquals(0.0, calculator.computeContribution(0.0,0))
        assertEquals(0.0, calculator.computeContribution(-10.0,0))
    }

    @Test
    fun amountIsLessThanZero(){
        var calculator:Calculator = Calculator()

        assertNull(calculator.computeContribution(-10_000.0,10))
        assertNull( calculator.computeContribution(-10_000.0,-10))
        assertEquals(0.0, calculator.computeContribution(-10_000.0,0))
    }

    @Test
    fun headCountIsLessThanZero(){
        var calculator:Calculator = Calculator()

        assertNull(calculator.computeContribution(10_000.0,-10))
        assertNull(calculator.computeContribution(-10_000.0,-10))
        assertEquals(0.0, calculator.computeContribution(0.0,-10))
    }

    @Test
    fun successComputation(){
        var calculator:Calculator = Calculator()

        assertEquals(1_000.0, calculator.computeContribution(10_000.0,10))
        assertEquals(0.025, calculator.computeContribution(0.25,10))

        assertEquals(0.0, calculator.computeContribution(100_000.0,100))
        assertEquals(0.0, calculator.computeContribution(10_000_000.0,10))
    }
}