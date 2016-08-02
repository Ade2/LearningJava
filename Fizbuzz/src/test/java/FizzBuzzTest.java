import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    @Test
    public void number1() {
        assertEquals("1", FizzBuzz.input(1));
    }

    @Test
    public void number2() {
        assertEquals("2", FizzBuzz.input(2));
    }

    @Test
    public void number3() {
        assertEquals("Fizz", FizzBuzz.input(3));
    }

    @Test
    public void number4() {
        assertEquals("4", FizzBuzz.input(4));
    }

    @Test
    public void number5() {
        assertEquals("Buzz", FizzBuzz.input(5));
    }


    @Test
    public void number6() {
        assertEquals("Fizz", FizzBuzz.input(6));
    }

    @Test
    public void number7() {
        assertEquals("7", FizzBuzz.input(7));
    }

    @Test
    public void number10() {
        assertEquals("Buzz", FizzBuzz.input(10));
    }

    @Test
    public void number15() {
        assertEquals("Fizzbuzz", FizzBuzz.input(15));
    }

    @Test
    public void number14() {
        assertEquals("14", FizzBuzz.input(14));
    }




}
