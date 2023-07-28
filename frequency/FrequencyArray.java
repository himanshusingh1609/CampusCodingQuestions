package campuscodingquestions.frequency;

import java.util.Scanner;

public class FrequencyArray
{
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        int n=kb.nextInt();
        int [] arr=new int[n];//{1,2,4,1,5,6,8,2,4,5,7,6,8};
        int [] brr=new int[arr.length];
        int visited = -1;
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        for(int i=0;i< arr.length;i++)
        {
            int count =1;
            for(int j=i+1;j< arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                    brr[j]=visited;
                }
            }
            if(brr[i] != visited)
                brr[i]=count;
        }
        for(int i=0;i< brr.length;i++)
        {
            if(brr[i] != visited)
                System.out.println(arr[i]+" occurs "+brr[i]+" times");
        }

    }
}
