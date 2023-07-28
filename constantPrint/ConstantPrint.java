package campuscodingquestions.constantPrint;

import java.util.Scanner;


//input : MynameisAnthony
//output: Mynmsnthny
public class ConstantPrint {
    public static void printConsonants(String str) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                    ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')) {
                System.out.print(ch);
            }
        }
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println();
        String str = kb.next();

        printConsonants(str);
    }
}


//public class ConsonantsPrint {
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String v = scanner.next();
//
//        for (int i = 0; i < v.length(); i++) {
//            char currentChar = v.charAt(i);
//            if (!(currentChar == 'a' || currentChar == 'e' || currentChar == 'i' || currentChar == 'o' || currentChar == 'u' ||
//                    currentChar == 'A' || currentChar == 'E' || currentChar == 'I' || currentChar == 'O' || currentChar == 'U')) {
//                System.out.print(currentChar);
//            }
//        }
//    }
//}

//input : MynameisAnthony
//output: Mynmsnthny