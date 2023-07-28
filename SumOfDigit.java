package campuscodingquestions;

import java.util.ArrayList;
import java.util.Scanner;

class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        ArrayList<Integer> v = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            v.add(scanner.nextInt());
        }

        for (int i = 0; i < n; i++) {
            int x = v.get(i);
            int ans = 0;
            while (x > 0) {
                ans += (x % 10);
                x /= 10;
            }
            System.out.print(ans + " ");
        }
    }
}


//5
//123 456 789 12 34
//Explanation:
//
//The value of 'n' is 5, so we have 5 elements in the list.
//The list will be [123, 456, 789, 12, 34].
//Now, for each element in the list:
//
//For the first element, 123:
//The sum of its digits is 1 + 2 + 3 = 6.
//For the second element, 456:
//The sum of its digits is 4 + 5 + 6 = 15.
//For the third element, 789:
//The sum of its digits is 7 + 8 + 9 = 24.
//For the fourth element, 12:
//The sum of its digits is 1 + 2 = 3.
//For the fifth element, 34:
//The sum of its digits is 3 + 4 = 7.
//So, the output will be:
//
//Copy code
//6 15 24 3 7
//In summary, the code computes the sum of digits for each number in the list and prints the resulting sums.