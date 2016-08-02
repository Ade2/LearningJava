import java.util.Scanner;

public class RetirementCalculator {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        String ageInput;
        String retirementageInput;


        System.out.println("What is your age? (if you don't mind me asking of course :)");
        ageInput = read.next();
        int age = Integer.parseInt(ageInput);



        System.out.println("At what age would you like to retire? (if you will ever be allowed to!)");
        retirementageInput = read.next();
        int retirementage = Integer.parseInt(retirementageInput);

        




    }


}
