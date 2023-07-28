package campuscodingquestions.staircount;

//Count ways to reach the n’th stair
//There are n stairs, a person standing at the bottom wants to reach the top.
// The person can climb either 1 stair or 2 stairs at a time.
// Count the number of ways, the person can reach the top.
//Examples:
//
//Input: n = 1
//Output: 1
//There is only one way to climb 1 stair
//
//Input: n = 2
//Output: 2
//There are two ways: (1, 1) and (2)
//
//Input: n = 4
//Output: 5
//(1, 1, 1, 1), (1, 1, 2), (2, 1, 1), (1, 2, 1), (2, 2)


import java.util.HashMap;
import java.util.Scanner;

public class StairCaseCount
{
    public int climbStairs(int n)
    {
        HashMap<Integer,Integer> map= new HashMap<>();
        map.put(0, 0);
        map.put(1,1);
        map.put(2,2);
        map.put(3,3);
        return climbStairsHelper(n,map);
    }

    public int climbStairsHelper(int n,HashMap<Integer,Integer> map)
    {
        int key=n;
        if(map.containsKey(key))
            return map.get(key);
        int n1=climbStairsHelper(n-1,map);
        int n2=climbStairsHelper(n-2,map);
        map.put(key,n1+n2);
        return n1+n2;
    }

    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int x=kb.nextInt();
        System.out.println((new StairCaseCount().climbStairs(x)));
    }
}
