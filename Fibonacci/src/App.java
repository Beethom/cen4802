
public class App {
    public static void main(String[] args) {

        int nth = 10;
        int fib = fibRe(nth);

        System.out.println("The " + nth + " term of the Fibonacci sequence is " + fib);

    }

    private static int fibRe(int n) {
        if (n == 0)
            return 0;
        if (n <= 2)
            return 1;

        int fibRec = fibRe(n - 1) + fibRe(n - 2);
        return fibRec;
    }
}
