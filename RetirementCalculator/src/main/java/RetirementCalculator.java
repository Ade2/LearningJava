import java.util.Calendar;
import java.util.Scanner;

public class RetirementCalculator {

    public static void main(String[] args) {

        String ageInput;
        String retirementageInput;
        int yearsToRetirement;
        int yearOfRetiremet;
        int year = Calendar.getInstance().get(Calendar.YEAR);

        Scanner read = new Scanner(System.in);

        System.out.println("What is your age? (if you don't mind me asking of course :)");
        while(!read.hasNextInt()) {
            System.out.println("Please enter a whole number (ie 2 not 2.0 or two)");
        }
        ageInput = read.next();
        int age = Integer.parseInt(ageInput);



        System.out.println("At what age would you like to retire? (if you will ever be allowed to!)");
        while(!read.hasNextInt()) {
            System.out.println("Please enter a whole number (ie 2 not 2.0 or two)");
        }
        retirementageInput = read.next();
        int retirementage = Integer.parseInt(retirementageInput);

        yearsToRetirement = yearsToRetirement(age, retirementage);

        yearOfRetiremet = yearOfRetiremet(age, retirementage);

        if(yearsToRetirement <= 0){
            System.out.println("You could have already retired!");
        }

        System.out.println("You have " + yearsToRetirement + " years left until you can retire.");
        System.out.println("It's " + year + ", so you can retire in" +yearOfRetiremet);


    }

    public static int yearsToRetirement(int age, int retirementage){

        int yearsToRetirement;

        yearsToRetirement = (retirementage - age);

        return yearsToRetirement;
    }

    public static int yearOfRetiremet(int age, int retirementage){

        int year = Calendar.getInstance().get(Calendar.YEAR);

        int yearOfRetirement = (retirementage - age) + year;

        return yearOfRetirement;


    }


}
