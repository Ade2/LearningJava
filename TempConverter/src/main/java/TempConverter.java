import java.text.DecimalFormat;
import java.util.Scanner;

public class TempConverter {

    public static double main(String[] args) {

        Scanner read = new Scanner(System.in);
        String stringEntered;

        System.out.println("Please enter Celsius or C if you would like to convert Fahrenheit to Celsius or enter Fahrenheit or F if you would like to convert Celsius to Fahrenheit");
        stringEntered = read.nextLine();
        stringEntered = stringEntered.toLowerCase();

        if (stringEntered.equals("c") || stringEntered.equals("celsius")) {

            InputTheTempCelsius();

            double convertedCels;
            convertedCels = InputTheTempCelsius();

            System.out.println(convertedCels);
            return convertedCels;


        } else if (stringEntered.equals("f") || stringEntered.equals("fahrenheit")) {

            InputTheTempFahrenheit();

            double convertedFahren;
            convertedFahren = InputTheTempFahrenheit();

            System.out.println(convertedFahren);
            return convertedFahren;

        } else {

            System.out.println("Error: Unfortunately the option you select wasn't recognised");
            return 0;
        }

    }


    public static double InputTheTempCelsius() {

        Scanner read = new Scanner(System.in);

        System.out.println("Please enter the temperature you would like to convert: ");

        while (!read.hasNextDouble()) {

            System.out.printf("Please enter a valid temperature: ");
            read.nextDouble();
        }

        double numb = read.nextDouble();


        double celsius = convertingToCelsius(numb);
        return celsius;

    }


    public static double InputTheTempFahrenheit() {

        Scanner read = new Scanner(System.in);

        System.out.println("Please enter the temperature you would like to convert: ");

        while (!read.hasNextDouble()) {

            System.out.printf("Please enter a valid temperature: ");
            read.nextDouble();
        }

        double numb = read.nextDouble();


        double fahrenheit = convertingToFahrenheit(numb);
        return fahrenheit;

    }


    public static double convertingToCelsius(double num) {

        double c;
        String cd;

        c = ((num - 32) * 5 / 9);

        DecimalFormat df = new DecimalFormat("#.00");
        cd = df.format(c);

        c = Double.parseDouble(cd);
        return c;
    }


    public static double convertingToFahrenheit(double num) {

        double f;
        String fd;

        f = ((num * 9 / 5) + 32);

        DecimalFormat df = new DecimalFormat("#.00");
        fd = df.format(f);

        f = Double.parseDouble(fd);

        return f;
    }


}
