package campuscodingquestions.frequency;

import java.util.*;

public class MaxFrequency 
{
        public static void main(String[] args) 
        {
            Scanner kb = new Scanner(System.in);
            int n = kb.nextInt();

            List<Integer> v = new ArrayList<>();
            for (int i = 0; i < n; i++)
            {
                int num = kb.nextInt();
                v.add(num);
            }

            Map<Integer, Integer> mp = new HashMap<>();
            for (int num : v)
            {
                mp.put(num, mp.getOrDefault(num, 0) + 1);
            }

            int ans = -1;
            int x = -1;
            for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
                int key = entry.getKey();
                int value = entry.getValue();

                if (value >= x)
                {
                    ans = key;

                    if (value == x)
                    {
                        ans = Math.max(ans, key);
                    }

                    x = value;
                }
            }

            System.out.println(ans);

            kb.close();
        }
}

//input:-10
// 1,2,3,5,2,7,2,1,2,5
//output:-2