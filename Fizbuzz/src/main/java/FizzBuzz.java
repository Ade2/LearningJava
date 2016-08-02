public class FizzBuzz {

            public static String input (int number){

                String test;
                int fizz;
                int buzz;
                int count = 0;

                fizz = number % 3;
                buzz = number % 5;


//                while (count <= number ) {
                    if (fizz == 0 && buzz == 0) {
                        System.out.println("Fizzbuzz");
                        return "Fizzbuzz";
                    } else if (fizz == 0) {
                        System.out.println("Fizz");
                        return "Fizz";
                    } else if (buzz == 0) {
                        System.out.println("Buzz");
                        return "Buzz";
                    } else {
                        test = Integer.toString(number);
                        System.out.println(number);
                        return test;
                    }

//                }

//                test = Integer.toString(number);
//                return test;

            }
}
