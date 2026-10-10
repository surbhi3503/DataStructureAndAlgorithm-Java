package sorting;
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(" n ");
        int n = s.nextInt();
        int[] arr = new int[n];

        System.out.print("element");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        insertionSort(arr,n);
        for(int k : arr){
            System.out.print(k + " ");
        }
        s.close();
    }
    public static void insertionSort(int[] arr, int n ) {

        for (int i = 0; i < n - 1; i++) {
            int j = i + 1;
            while (j > 0 && arr[j - 1] > arr[j]) {
                swap(arr,j - 1, j);
                j--;
            }
        }
    }
        public static void swap(int[] arr,int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
        }

    }

