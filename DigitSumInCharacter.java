package campuscodingquestions;

import java.util.Scanner;

//Given an alphanumeric string made up of digits and lower case Latin characters only, find the sum of all the digit characters in the string.
//
//Input
//The first line of the input contains an integer T denoting the number of test cases. Then T test cases follow.
//Each test case is described with a single line containing a string S, the alphanumeric string.
//Output
//For each test case, output a single line containing the sum of all the digit characters in that string.
//Constraints
//1 ≤ T ≤ 1000
//1 ≤ |S| ≤ 1000, where |S| is the length of the string S.
//Sample 1:
//Input
//Output
//1
//ab1231da
//7
//Explanation:
//The digits in this string are 1, 2, 3 and 1. Hence, the sum of all of them is 7.
public class DigitSumInCharacter
{
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter TestCase:");
        int t=kb.nextInt();
        while(t-->0)
        {
            System.out.println("Enter StringWithDigit:");
            String str=kb.next();
            int ans=0;
            for(char c: str.toCharArray())
            {
                if(c>= '1' && c<='9')
                {
                    ans=ans+(int)Character.getNumericValue(c);
                }
            }
            System.out.println(ans);
        }
    }
}
