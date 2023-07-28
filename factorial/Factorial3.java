package campuscodingquestions.factorial;

import java.util.Scanner;

public class Factorial3
{
    public  static int fact(int n,int k)
    {
        if(n <=1)
        {
            return k;
        }
        return fact(n-1,n*k);
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
            System.out.println("factorial is "+fact(x,1));
        }
    }
}
