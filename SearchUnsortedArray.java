/* You are given an unsorted array with n integers. You need to check if an integer k is present in that array.
If  k is present in the given array, print “true” else print “false”.
Example:
array = [5, 8, 2, 15, 6, 25, 1, 11, 13]
k = 11
Output: true
array = [9, 3, 14, 22, 1, -6, 18, 15]
k = 13
Output: false
Input: The input will be in the following format :
The first line should be the number of elements in the array.
The second line should be the elements of the array space separated.
The third line should be the value of k.
Output: The output should be of the following format
Print “true” if k is present in the array, else print “false”.
 */
import java.util.*;

public class SearchUnsortedArray {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = s.nextInt();
        int k = s.nextInt();
        search(arr, k);
    }

    // Method to search for k in an unsorted array
    static void search(int[] arr, int k) {
        // Write your code
         boolean found = false;
         for (int n : arr) {
            if (n == k) {
                found = true;
                break;
            }
         }

        if(found)
            System.out.println("true");
        else
            System.out.println("false");
    }
}

//
//    boolean flag = false;
//// Traverse the array and check if the current element is equal to k
//        for (int i = 0; i < arr.length; i++) {
//        if (arr[i] == k) {
//        flag = true;
//        break;
//        }
//        }
//        System.out.println(flag);
//        }
//        }
