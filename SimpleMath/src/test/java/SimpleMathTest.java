import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SimpleMathTest {


//    @Test
//    public void number1() {
//        ArrayList<Integer> expected = SimpleMath.convertNumbers("-2", "-2");
//        assertTrue(expected.contains(null));
//    }

//    @Test
//    public void Letters() {
//        ArrayList<Integer> expected = SimpleMath.convertNumbers("test", "1");
//        assertTrue(expected.contains(null));
//    }
//
//    @Test
//    public void Letters1() {
//        ArrayList<Integer> expected = SimpleMath.convertNumbers("2", "test");
//        assertTrue(expected.contains(null));
//    }


    @Test
    public void number2() {
        ArrayList<Integer> expected = SimpleMath.convertNumbers("2", "2");
        assertTrue(expected.contains(2));
    }

    @Test
    public void number3() {
        ArrayList<Integer> expected = SimpleMath.convertNumbers("999", "1");
        assertTrue(expected.contains(999));
        assertTrue(expected.contains(1));
    }
    @Test

    public void number4() {
        ArrayList<Integer> expected = SimpleMath.convertNumbers("1", "12000");
        assertTrue(expected.contains(12000));
        assertTrue(expected.contains(1));
    }

    @Test
    public void number5() {assertEquals(4, SimpleMath.numbersaddedtogeather(2, 2)); }

    @Test
    public void number6() {assertEquals(-4, SimpleMath.vnOneMinusvnTwo(4, 8)); }

    @Test
    public void number7() {assertEquals(16, SimpleMath.vnOnemultipliedbyvnTwo(2, 8)); }

    @Test
    public void number8() {assertEquals(4, SimpleMath.vnOnedevidedbyvnTwo(8, 2), 0.00); }

}
