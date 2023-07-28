package campuscodingquestions.nonrepeatedcharacter;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NonRepeatChar
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        Map<Character, Integer> mp = new HashMap<>();

        for (char i : str.toCharArray())
        {
            mp.put(i, mp.getOrDefault(i, 0) + 1);
        }

        int cnt = 0;
        for (Map.Entry<Character, Integer> entry : mp.entrySet())
        {
            if (entry.getValue() == 1)
            {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
//Input;-alphaadida
//output:-4
// Non repeated character is-> l ,p , h ,i