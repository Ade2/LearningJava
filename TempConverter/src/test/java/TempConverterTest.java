import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class TempConverterTest {
    @Test
    public void ConvertCelsiusToFahrenheit() {
        {
            assertEquals(4.44, TempConverter.convertingToCelsius(40), 0.00);
        }
    }

    @Test
    public void ConvertCelsiusToFahrenheit1() {
        {
            assertEquals(38.33, TempConverter.convertingToCelsius(101), 0.00);
        }
    }

    @Test
    public void ConvertCelsiusToFahrenheitUsingNegValue() {
        {
            assertEquals(-18.89, TempConverter.convertingToCelsius(-2), 0.00);
        }
    }

    @Test
    public void ConvertCelsiusToFahrenheitUsingOneDecimalPlace() {
        {
            assertEquals(10.28, TempConverter.convertingToCelsius(50.5), 0.00);
        }
    }

    @Test
    public void ConvertCelsiusToFahrenheitUsingZero() {
        {
            assertEquals(-17.78, TempConverter.convertingToCelsius(0), 0.00);
        }
    }


    @Test
    public void ConvertFahrenheitToCelsius() {
        {
            assertEquals(59, TempConverter.convertingToFahrenheit(15), 0.00);
        }
    }

    @Test
    public void ConvertFahrenheitToCelsius1() {
        {
            assertEquals(210.2, TempConverter.convertingToFahrenheit(99), 0.00);
        }
    }

    @Test
    public void ConvertFahrenheitToCelsiusUsingNegValue() {
        {
            assertEquals(28.4, TempConverter.convertingToFahrenheit(-2), 0.00);
        }
    }

    @Test
    public void ConvertFahrenheitToCelsiusUsingOneDecimalPlace() {
        {
            assertEquals(72.5, TempConverter.convertingToFahrenheit(22.5), 0.00);
        }
    }

    @Test
    public void ConvertFahrenheitToCelsiusUsingZero() {
        {
            assertEquals(32, TempConverter.convertingToFahrenheit(0), 0.00);
        }
    }

}



