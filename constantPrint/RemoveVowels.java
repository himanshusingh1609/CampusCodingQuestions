package campuscodingquestions.constantPrint;

import java.util.Scanner;

public class RemoveVowels
{
    public static String removeVol(String str)
    {
        return str.replaceAll("[aeiouAEIOU]","");
    }
    public static void main(String[] args) {
        Scanner kb=new Scanner (System.in);
        String str=kb.next();
        System.out.println(removeVol(str));
    }
}


//        Scanner kb=new Scanner (System.in);
//        String str=kb.next();
//        String ans="";
//        ans=str.replaceAll("[aeiouAEIOU]","");
//        System.out.println(ans);