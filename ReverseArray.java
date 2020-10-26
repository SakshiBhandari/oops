import java.util.*;
public class ReverseArray {
/*You are given an unsorted array with n integers. You need to implement the code to reverse the array and print the array.
Example:
array = [5, 8, 2, 15, 6, 25, 1, 11, 13]
Output:
array = [13, 11, 1, 25, 6, 15, 2, 8, 5]
array = [9, 3, 14, 22, 1, -6, 18, 15]
Output:
array = [15, 18, -6, 1, 22, 14, 3, 9]
Input: The input will be in the following format :
The first line should be the number of elements in the array.
The second line should be the elements of the array space separated.
Note: You just need to reverse the given array and need not to print anything. The stub code will print the elements of the array.*/

        public static void main(String args[]) {
            Scanner s = new Scanner(System.in);
            int n = s.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = s.nextInt();
            reverseArray(arr);
            for (int i = 0; i < arr.length; i++)
                System.out.print(arr[i] + " ");
        }

        // Method to reverse the array
        static void reverseArray(int[] arr) {
            // Write your code here
            for (int i = 0; i< arr.length/2; i++){
                int temp = arr[i];
                arr[i]= arr[arr.length -i  -1];
                arr[arr.length - i - 1] = temp;
            }

        }
    }



