package campuscodingquestions.duplicate;

import java.util.*;

public class RemoveDuplicate
{
    public static List<Integer> removeDuplicates(List<Integer> list) {
        Set<Integer> uniqueElements = new LinkedHashSet<>();

        for (Integer num : list) {
            uniqueElements.add(num);
        }

        return new ArrayList<>(uniqueElements);
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the list: ");
        int n = scanner.nextInt();

        System.out.println("Enter " + n + " elements (separated by spaces):");
        List<Integer> inputList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            inputList.add(scanner.nextInt());
        }

        List<Integer> resultList = removeDuplicates(inputList);

        System.out.println("Original List: " + inputList);
        System.out.println("List with Duplicates Removed: " + resultList);
       }
}
