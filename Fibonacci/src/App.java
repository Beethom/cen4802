  /**
* Create a  recursive static method that returns the nth term in the Fibonacci sequence. 
*   The method should accept n as a parameter.
*  main method that calls the first method.
* @param  integer the number  to display.  If the number  is an intger
* @param n Number to be Sequenced Recursively by Fibonacci Method
 * @return Returns the result of number sequenced by Fibonacci Method
* @author   Beethovrn Marhone         
*/

public class App {
  
// main method that calls the fib method and passing the designated number.
    public static void main(String[] args) {

        int nth = 10;
        int fib = fibRe(nth);

        System.out.println("The " + nth + " term of the Fibonacci sequence is " + fib);

    }
//  recursive method that will take any number , and return the fib term.
    private static int fibRe(int n) {
        if (n == 0)
            return 0;
        if (n <= 2)
            return 1;

        int fibRec = fibRe(n - 1) + fibRe(n - 2);
        return fibRec;
    }
}
