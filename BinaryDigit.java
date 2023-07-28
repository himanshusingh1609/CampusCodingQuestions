package campuscodingquestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BinaryDigit
{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            List<Integer> v = new ArrayList<>(8);
            for (int i = 0; i < 8; i++) {
                v.add(scanner.nextInt());
            }
            v.add(0, 0);
            v.add(0);
            int d = scanner.nextInt();
            for (int i = 1; i <= d; i++) {
                List<Integer> temp = new ArrayList<>(v);
                for (int j = 1; j < v.size() - 1; j++) {
                    if (v.get(j - 1).equals(v.get(j + 1))) {
                        temp.set(j, 0);
                    } else {
                        temp.set(j, 1);
                    }
                }
                v = temp;
            }
            for (int i = 1; i < v.size() - 1; i++) {
                System.out.print(v.get(i) + " ");
            }
        }
}


//8
//1 1 1 0 1 1 1 1
//1
//1 0 1 0 1 0 0 1

//8
//1 1 1 0 1 1 1 1
//2
//0 0 0 0 0 1 1 0

//8
//1 1 1 0 1 1 1 1
//3
//0 0 0 0 1 1 1 1