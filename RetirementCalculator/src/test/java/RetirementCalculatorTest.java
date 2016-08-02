import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class RetirementCalculatorTest {
    @Test
    public void number1() {
        assertEquals(25, RetirementCalculator.yearsToRetirement(40,65));
    }

    @Test
    public void YearOfRetirement() {
        assertEquals(2041, RetirementCalculator.yearOfRetiremet(40,65));
    }


    @Test
    public void YearOfRetirementforme() {
        assertEquals(2047, RetirementCalculator.yearOfRetiremet(34, 65));
    }

        @Test
        public void YearOfRetirementforme1() {
            assertEquals(31, RetirementCalculator.yearsToRetirement(34,65));
    }
}
