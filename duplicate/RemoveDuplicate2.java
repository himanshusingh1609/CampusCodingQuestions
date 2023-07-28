package campuscodingquestions.duplicate;

import java.util.*;

public class RemoveDuplicate2
{
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter size:");
        int n = kb.nextInt();
        Set<Integer> mp = new HashSet<>();
        System.out.println("Enter element");
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int x = kb.nextInt();
            if (!mp.contains(x)) {
                ans.add(x);
            }
            mp.add(x);
        }

        for (int i : ans) {
            System.out.print(i + " ");
        }
    }
}
//8
//1 1 3 2 1 4 5 4
//1 3 2 4 5
