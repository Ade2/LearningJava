import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanNumeralsTest {

    @Test
    public void number1() { assertEquals("I",RomanNumerals.inputFromTest(1)); }

    @Test
    public void number2() { assertEquals("II",RomanNumerals.inputFromTest(2)); }

    @Test
    public void number3() { assertEquals("III",RomanNumerals.inputFromTest(3));}

    @Test
    public void number4() {
        assertEquals("IV",RomanNumerals.inputFromTest(4));
    }

    @Test
    public void number5() {
        assertEquals("V",RomanNumerals.inputFromTest(5));
    }

    @Test
    public void number6() {
        assertEquals("VI",RomanNumerals.inputFromTest(6));
    }

    @Test
    public void number7() { assertEquals("VII",RomanNumerals.inputFromTest(7));}

    @Test
    public void number8() {
        assertEquals("VIII",RomanNumerals.inputFromTest(8));
    }

    @Test
    public void number9() {
        assertEquals("IX",RomanNumerals.inputFromTest(9));
    }

    @Test
    public void number10() {
        assertEquals("X",RomanNumerals.inputFromTest(10));
    }

    @Test
    public void number12() {
        assertEquals("XII",RomanNumerals.inputFromTest(12));
    }

    @Test
    public void number13() {
        assertEquals("XIII",RomanNumerals.inputFromTest(13));
    }

    @Test
    public void number14() {
        assertEquals("XIV",RomanNumerals.inputFromTest(14));
    }

    @Test
    public void number15() {
        assertEquals("XV",RomanNumerals.inputFromTest(15));
    }

    @Test
    public void number19() {
        assertEquals("XIX",RomanNumerals.inputFromTest(19));
    }

    @Test
    public void number20() { assertEquals("XX",RomanNumerals.inputFromTest(20)); }

    @Test
    public void number24() { assertEquals("XXIV",RomanNumerals.inputFromTest(24)); }

    @Test
    public void number38() { assertEquals("XXXVIII",RomanNumerals.inputFromTest(38)); }

    @Test
    public void number68() { assertEquals("LXVIII",RomanNumerals.inputFromTest(68)); }

    @Test
    public void number789() { assertEquals("DCCLXXXIX",RomanNumerals.inputFromTest(789)); }

    @Test
    public void number2000() { assertEquals("MM",RomanNumerals.inputFromTest(2000)); }

    @Test
    public void number90() { assertEquals("XC",RomanNumerals.inputFromTest(90)); }

}
