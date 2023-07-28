package campuscodingquestions.sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


//input
//8
//11 7 5 10 46 23 16 8
//3

//output: 5 7 11 46 23 16 10 8
public class SpecialSort
{
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        Integer[] v = new Integer[n];
        for (int i = 0; i < n; i++) {
            v[i] = kb.nextInt();
        }

        int k = kb.nextInt();
        Arrays.sort(v, 0, k);
        Arrays.sort(v, k, n, Collections.reverseOrder());

        for (int i : v) {
            System.out.print(i + " ");
        }
    }
}
