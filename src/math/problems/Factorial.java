package math.problems;
import java.util.Scanner;
public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to get its factorial");
        int x = scanner.nextInt();

        //Recursion
        int resultRecursion = factRecursion(x);
        System.out.println("Factorial using Recursion: " + resultRecursion);

        //Iteration
        int resultIteration = factIteration(x);
        System.out.println("Factorial using Iteration: " + resultIteration);

        scanner.close();
    }


    // Recursive method to calculate factorial
    public static int factRecursion(int x) {
        if (x == 0)
            return 1;
        else
            return x * factRecursion(x - 1);
    }

    // This method calculates the factorial using iteration.
    public static int factIteration(int x) {
        int result = 1;
        for (int i = 1; i <= x; i++) {
            result *= i;
        }
        return result;
    }


}



