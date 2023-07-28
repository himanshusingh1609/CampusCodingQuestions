package campuscodingquestions.staircount;

import java.util.Scanner;

public class StairCount
{
    // Java program to count the number of ways to reach at top
// When a person climbing on stairs

    public class Solution {

        static int countWays(int n)
        {
            // declaring two variables to store the count
            int prev = 1;
            int prev2 = 1;
            // Running for loop to count all possible ways
            for (int i = 2; i <= n; i++) {
                int curr = prev + prev2;
                prev2 = prev;
                prev = curr;
            }
            return prev;
        }
        public static void main(String[] args)
        {
            Scanner kb=new Scanner(System.in);
            int x=kb.nextInt();
            System.out.println("Number of Ways : "
                    + countWays(x));
        }
    }


}
