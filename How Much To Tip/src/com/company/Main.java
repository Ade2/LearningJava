package com.company;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        DecimalFormat dftip = new DecimalFormat("#.00");
        dftip.setRoundingMode(RoundingMode.DOWN);


        double bill;

        System.out.print("Please enter the total bill. £ ");
        while (!reader.hasNextDouble())
        {
            System.out.printf("Please enter a valid price eg £22.22. £ ");
            reader.nextDouble();

        }
        bill = reader.nextDouble();


        while (bill <=0) {
            System.out.print("Please enter a valid bill greater than 0. £ ");
            bill = reader.nextDouble();
        }






        System.out.print("Please enter the percentage you would like to tip: ");
        while (!reader.hasNextInt())
        {
            System.out.print("Please enter a valid percentage: ");
            reader.next();
        }

        int tip = reader.nextInt();

        while (tip <= 0 || tip >=101) {
            System.out.print("Please enter a percentage with in the range of 1 to 100: ");

            tip = reader.nextInt();
        }


        double tipValue;
        double Total;

        tipValue = (bill / 100 * tip);
        Total = tipValue + bill;

        System.out.println("the value of the tip is: £" + dftip.format((tipValue)));
        System.out.println("The total bill including tip is: £" + df.format(Total));



    }
}
