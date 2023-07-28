package campuscodingquestions.constantPrint;

import java.util.Scanner;

public class PrintConstant
{
    public static int countConsonants(String[] str) {
        int ans = 0;
        for (String s : str) {
            char ch = s.charAt(0);
            if (!(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                    ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')) {
                ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = kb.next();
        }

        int result = countConsonants(str);
        System.out.println(result);
    }
}

//input : 6
//a v i k e l
//output:- 3
//explanation: [v,k,l]