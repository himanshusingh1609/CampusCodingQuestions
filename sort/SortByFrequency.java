package campuscodingquestions.sort;


//Input:  arr[] = {2, 5, 2, 8, 5, 6, 8, 8}
//Output: arr[] = {8, 8, 8, 2, 2, 5, 5, 6}
//
//Input: arr[] = {2, 5, 2, 6, -1, 9999999, 5, 8, 8, 8}
//Output: arr[] = {8, 8, 8, 2, 2, 5, 5, 6, -1, 9999999}

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class ele {
    int count, index, val;

}
// Used for sorting by value
class mycomp implements Comparator<ele> {
    public int compare(ele a, ele b)
    {
        return (a.val - b.val);
    }
}

// Used for sorting by frequency. And if frequency is same,
// then by appearance
class mycomp2 implements Comparator<ele> {
    public int compare(ele a, ele b)
    {
        if (a.count != b.count)
            return (a.count - b.count);
        return (b.index - a.index);
    }
}
public class SortByFrequency
{
    static void sortByFrequency(int[] arr, int n)
    {
        ArrayList<ele> element = new ArrayList<ele>();
        // ele[] element = new ele[n];
        for (int i = 0; i < n; i++) {

            element.add(new ele());
            // Fill Indexes
            element.get(i).index = i;

            // Initialize counts as 0
            element.get(i).count = 0;

            // Fill values in structure
            // elements
            element.get(i).val = arr[i];
        }

    /* Sort the structure elements according to value,
           we used stable sort so relative order is
           maintained.
         */
        Collections.sort(element, new mycomp());

        /* initialize count of first element as 1 */
        element.get(0).count = 1;

        /* Count occurrences of remaining elements */
        for (int i = 1; i < n; i++) {

            if (element.get(i).val == element.get(i - 1).val) {
                element.get(i).count += element.get(i - 1).count + 1;

        /* Set count of previous element as -1, we
                   are doing this because we'll again sort
                   on the basis of counts (if counts are
                   equal than on the basis of index)*/
                element.get(i - 1).count = -1;

        /* Retain the first index (Remember first
                   index is always present in the first
                   duplicate we used stable sort. */
                element.get(i).index = element.get(i - 1).index;
            }

      /* Else If previous element is not equal to
              current so set the count to 1 */
            else
                element.get(i).count = 1;
        }

    /* Now we have counts and first index for each
           element so now sort on the basis of count and in
           case of tie use index to sort.*/
        Collections.sort(element, new mycomp2());
        for (int i = n - 1, index = 0; i >= 0; i--){
            if (element.get(i).count != -1)
            {
                for (int j = 0; j < element.get(i).count;j++)
                    arr[index++] = element.get(i).val;
            }
        }
    }


    public static void main(String[] args)
    {
        int[] arr = { 2, 5, 2, 6, -1, 9999999, 5, 8, 8, 8 };
        int n = arr.length;

        // Function call
        sortByFrequency(arr,     n);

        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}

