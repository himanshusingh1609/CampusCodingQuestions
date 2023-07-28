package campuscodingquestions;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//input: str=bbadbbababb
//         x=t
//output:ttadttatatt
public class MostFrequentCharacter
{
    public static String FrequentCharacterReplaced(String str ,char ch)
    {
        Map<Character,Integer> charCount=new HashMap<>();
        for(char c:str.toCharArray())
        {
            charCount.put(c,charCount.getOrDefault(c,0)+1);
        }
        //Find most frequent Character
        char maxFreqCH='\0';
        int maxCount=0;
        for(Map.Entry<Character,Integer> entry:charCount.entrySet())
        {
            char chh= entry.getKey();
            int count=entry.getValue();
            if(count>maxCount)
            {
                maxFreqCH=chh;
                maxCount=count;
            }
        }
        // Replace all occurrences of the most frequent character with 'ch'
        StringBuilder result=new StringBuilder();
        for(char chh:str.toCharArray())
        {
            if(chh==maxFreqCH)
            {
                result.append(ch);
            }
            else
            {
                result.append(chh);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.print("Enter the input string: ");
        String istr=kb.nextLine();
        System.out.print("Enter the character to replace with: ");
        char chr=kb.next().charAt(0);
        System.out.println("Modified string:"+FrequentCharacterReplaced(istr,chr));
    }

}
