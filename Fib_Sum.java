
/**
 Nicholas Cecala
 2017
 Program computes the sum of "N" fibonacci numbers
 */

import java.util.Scanner;
public class Fib_Sum
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        boolean isInt = true;
        System.out.println("Welcome to the Fibonacci Sum program!");
        System.out.println("");
        while (isInt == true){
            int sum = 0;
            int first = -1;
            int second = 1;
            int next = 0;
            int input = 0;
            System.out.print("Please enter a value for N between 0 and 45 >> ");
            if (in.hasNextInt()){
                isInt = true;
                input = in.nextInt();
                if (input < 0|| input > 45){
                    isInt = false;
                }
            }
            else {
                isInt = false;
            }
            if (isInt == false){
                System.out.println();
                System.out.println("Thank you for using the Fibonacci sum program!");
                System.exit(0);
            }
            for (int i = 1; i <= input; i++)
            {
                next = first + second;
                sum = sum + next;
                first = second;
                second = next;
            }
            System.out.println("The sum of the first " + input + " Fibonacci number(s) is " + sum);
            System.out.println("");
        }
    }
}
