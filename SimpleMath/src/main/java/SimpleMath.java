import java.util.ArrayList;
import java.util.Scanner;

public class SimpleMath {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        String inputOne;
        String inputTwo;
        int addTotal;
        int minusTotal;
        int multiplicationTotal;
        double divisionTotal;

        System.out.println("Please enter your first number: ");
        inputOne = read.next();

        System.out.println("Please enter your second number: ");
        inputTwo = read.next();

        ArrayList<Integer> validatednumber; //= new ArrayList<Integer>();
        validatednumber = convertNumbers(inputOne, inputTwo);

        int vnOne = validatednumber.get(0);
        int vnTwo = validatednumber.get(1);

        addTotal = numbersaddedtogeather(vnOne, vnTwo);
        minusTotal = vnOneMinusvnTwo(vnOne, vnTwo);
        multiplicationTotal =  vnOnemultipliedbyvnTwo (vnOne, vnTwo);
        divisionTotal = vnOnedevidedbyvnTwo (vnOne, vnTwo);

        System.out.println(vnOne + " plus " + vnTwo + "= " + addTotal);
        System.out.println(vnOne + " minus " + vnTwo + "= " + minusTotal);
        System.out.println(vnOne + " multiplied by " + vnTwo + "= " + multiplicationTotal);
        System.out.println(vnOne + " divided by " + vnTwo + "= " + divisionTotal);
    }


    public static ArrayList<Integer> convertNumbers(String number1, String number2) {

        Scanner read = new Scanner(System.in);

        int numb1 = Integer.parseInt(number1);
        int numb2 = Integer.parseInt(number2);
        String stringToCheck;

        ArrayList<Integer> enteredNumbers = new ArrayList<Integer>();

        while (numb1 < 0) {
            System.out.println("Please enter a number grater than 0");
            stringToCheck = read.nextLine();
            numb1 = Integer.parseInt(stringToCheck);
        }

        enteredNumbers.add(numb1);

        while (numb2 < 0) {
            System.out.println("Please enter a second number grater than 0");
            stringToCheck = read.nextLine();
            numb2 = Integer.parseInt(stringToCheck);

        }
        enteredNumbers.add(numb2);

        return enteredNumbers;
    }

    public static int numbersaddedtogeather(int vnOne, int vnTwo) {

        int sumOfAdd;
        sumOfAdd = (vnOne + vnTwo);
        return sumOfAdd;
    }

    public static int vnOneMinusvnTwo(int vnOne, int vnTwo) {

        int summinus;
        summinus = (vnOne - vnTwo);
        return summinus;
    }

    public static int vnOnemultipliedbyvnTwo(int vnOne, int vnTwo) {

        int sumofmultiplied;
        sumofmultiplied = (vnOne * vnTwo);
        return sumofmultiplied;
    }

    public static double vnOnedevidedbyvnTwo(double vnOne, double vnTwo) {

        double sumofdevision;
        sumofdevision = (vnOne / vnTwo);
        return sumofdevision;
    }

}
