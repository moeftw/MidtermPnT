package math.problems;

public class Fibonacci {

    //Printing first 40 Fibonacci Numbers below
    public static void main(String[] args) {

        for (int i = 0; i < 40; i++) {
            System.out.print(fibo(i) + " ");
        }
    }

    public static int fibo(int n) {
        if (n <= 1) {
            return n;
        }
        return fibo(n-1) + fibo(n-2);

    }
}
