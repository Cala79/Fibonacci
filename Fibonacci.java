
/**
 * This program detects Fibonacci numbers.
 * It will prompt the user to input a positive integer.
 * Upon input, the program will determine if the number is either a Fibonacci number or not. 
 * If a Fibonacci number, then the order of the number in the sequence will be displayed.
 * If not a Fibonacci number, then the Fibonacci numbers above and below it (including their order in the sequence) will be displayed.
 * Once it finishes, the program will prompt the user for a new number.
 * The program will exit if the user enters a non-integer number or string instead of an integer.  
 * Nicholas Cecala
 * 02/07/2017
 */
import java.util.Scanner;
public class Fibonacci
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner (System.in);
        System.out.println("Welcome to the Fibonacci Sequence Detector");
        int j = 0;
        boolean more = true;
        boolean isInt = true;
        while (j <=2){
            System.out.println();
            j++;
        }
        while (isInt == true){
            int i = 0;
            int first = 0;
            int second = 1;
            int third = 0;
            int input = 0;
            System.out.print("Please input a number for analysis >> ");
            if (in.hasNextInt()){
                isInt = true;
                input = in.nextInt();
                if (input < 0) {
                    isInt = false;
                }
            }

            else {
                isInt = false;
            }
            if (isInt == false){
                System.out.println();
                System.out.println("Thank you for using the Fibonacci Sequence Dector");
                System.exit(0);
            }

            if (input == 0) {
                System.out.println("0 is a Fibonacci number whose order in the sequence is 1");
                System.out.println();
            }
            if (input == 1){
                System.out.println("1 is a Fibonacci number whose order in the sequence is both 2 and 3");
                System.out.println();
            }
            if (input != 0 && input != 1){
                while (third <= input){
                    first = second;
                    second = third;
                    third = first + second;
                    i++;
                }

            }
            if (second == input && input != 0 && input != 1){
                System.out.println(input + " is a Fibonacci number whose order in the sequence is " + i);
                System.out.println();
            }
            else if (second != input && input != 0 && input != 1) {
                int order = i + 1;
                System.out.println(input + " is not a Fibonacci number");
                System.out.println("However, it lies between Fibonacci numbers " + second + " (order: " + i + ") " + "and " + third +" (order: " + order + ")");
                System.out.println();
            }
        } 

    }
}
