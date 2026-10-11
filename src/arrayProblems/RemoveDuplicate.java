package arrayProblems;

import java.util.HashSet;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 4, 5, 5, 6, 6, 7, 9, 9};
 //       removeDuplicate(arr); //brute force
//        removeDuplicateWithSet(arr) better approach
//        optimize solution
        int result = removeWithTwoPointer(arr);
        for (int i = 0 ; i < result; i++){
            System.out.print(arr[i] + " ");

        }
    }

    // if Array is sorted

    public static void removeDuplicate(int[] arr) {  // tc = o(n) sc = o(n)
        int[] temp = new int[arr.length];
        int j = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j] = arr[i];
                j++;
            }
        }
        temp[j] = arr.length - 1;
        j++;
        for (int i = 0; i < j; i++) {
            System.out.print(temp[i] + " ");

        }
    }

    // set is better then loop but it also take tc = O(N) and SC = O(N)
    public static void removeDuplicateWithSet(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        for (int a : set) {
            System.out.print(a + " ");
        }
    }

    public static int removeWithTwoPointer(int[] arr) {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr[j]) {
                j++;
                arr[j] = arr[i];
            }
        }
        return j + 1;
    }
}