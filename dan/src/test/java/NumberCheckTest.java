import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberCheckTest {
    @Test
    public void number1() {
        assertEquals(1, NumberCheck.number(1), 0);
    }

    @Test
    public void number2() {
        assertEquals(4, NumberCheck.number(2), 0);
    }

    @Test
    public void number50() {
        assertEquals(2500, NumberCheck.number(50), 0);
    }


    @Test
    public void numberneg2() {
        assertEquals(4, NumberCheck.number(-2), 0);
    }

    @Test
    public void number() {
        assertEquals(5.1529, NumberCheck.number(2.27), 0);
    }

}
