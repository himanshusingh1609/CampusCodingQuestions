package campuscodingquestions;

import java.util.Scanner;

public class PrintLastCharacter
{
    static void printLastCharacters(String str) {
        String[] words = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String x : words) {
            if (!x.isEmpty())
            {
                char lastChar = x.charAt(x.length() - 1);
                sb.append(lastChar);
            }
        }
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String n = kb.nextLine();
        printLastCharacters(n);
        kb.close();
    }
}
