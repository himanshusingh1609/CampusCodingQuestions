package campuscodingquestions.factorial;

import java.util.Scanner;

public class Factorial4
{
    public  static int fact(int n)
    {
        if(n<=1)
            return 1;
        return n*fact(n-1);
    }
    public static void main(String[] args)
    {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter Test case:");
        int t=kb.nextInt();
        while(t-->0)
        {
            System.out.println("Enter value ");
            int x=kb.nextInt();
            System.out.println("factorial is "+fact(x));
        }
    }
}
