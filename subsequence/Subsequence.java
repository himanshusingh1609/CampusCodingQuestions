package campuscodingquestions.subsequence;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Subsequence
{
    static List<String> list=new ArrayList<>();
    public static void findSubsequence(String str,String ans)
    {
        if(str.length()==0)
        {
            list.add(ans);
            return;
        }
        findSubsequence(str.substring(1),ans+str.charAt(0));
        findSubsequence(str.substring(1),ans);
    }

    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        String str;
        System.out.println("Enter any String:");
        str=kb.next();
        findSubsequence(str,"");
        System.out.println(list);
    }
}
