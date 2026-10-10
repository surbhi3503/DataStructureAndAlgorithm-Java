package sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {12, 2, 43, 6, 78, 3};
        int n = 6;
        bubbleSort(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }
        public static void bubbleSort ( int arr[], int n ){
            for (int i = n - 1; i >= 1; i--) {
                for (int j = 0; j <= i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                }
            }
        }



}
