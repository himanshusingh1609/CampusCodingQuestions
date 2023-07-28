package campuscodingquestions.palindrome;

import java.util.Scanner;

public class StringPalindrome
{
    public static boolean isPalindrome(String str)
    {
        String reverse="";
        for(int i=str.length()-1;i>=0;i--)
        {
            reverse+=str.charAt(i);
        }
        return str.equalsIgnoreCase(reverse);
    }

    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int t=kb.nextInt();
        while(t-->0)
        {
            String str= kb.next();
//            String revstr="";
//            for(int i=str.length()-1;i>=0;i--)
//            {
//                revstr+=str.charAt(i);
//            }
            if(isPalindrome(str))
            {
                System.out.println("It is palindrome"+str);
            }
            else
            {
                System.out.println("It is not a palindrome");
            }
        }
    }
}
