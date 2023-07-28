package campuscodingquestions.staircount;

import java.util.Scanner;

public class StairCase
{
    class stairs
    {
        // A simple recursive program to find
        // n'th fibonacci number
        static int fib(int n)
        {
            if (n <= 1)
                return n;
            return fib(n - 1) + fib(n - 2);
        }

        // Returns number of ways to reach s'th stair
        static int countWays(int s)
        {
            return fib(s + 1);
        }

        /* Driver program to test above function */
        public static void main(String args[])
        {
            Scanner kb=new Scanner(System.in);
            int x=kb.nextInt();
            System.out.println("Number of ways = " + countWays(x));
        }
    }

}
