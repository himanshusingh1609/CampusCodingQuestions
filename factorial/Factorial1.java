package campuscodingquestions.factorial;

import java.util.Scanner;

public class Factorial1
{
    public static void main(String[] args)
    {
        Scanner kb=new Scanner (System.in);
        System.out.println("Enter Test case:");
        int t=kb.nextInt();
        while(t-->0)
        {
            int n,fact;
            System.out.println("Enter Integer value to find Factorial");
            n=kb.nextInt();
            for(fact=1;n>1;n--)
            {
                fact=fact*n;
            }
            System.out.println("Factorial  is "+fact);
        }
    }
}
