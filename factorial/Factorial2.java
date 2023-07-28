package campuscodingquestions.factorial;

import java.util.HashMap;
import java.util.Scanner;

//By using HASHMAP
public class Factorial2
{
    public  static int fact(int n)
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(1,1);
        if(map.containsKey(n))
        {
            return map.get(n);
        }
            int result = n * fact(n - 1);
            map.put(n, result);
            return result;
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
