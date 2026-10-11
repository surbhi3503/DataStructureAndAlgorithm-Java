package arrayProblems;

public class CheckArrrayIfSorted {

    public static void main(String[] args) {
//        int[] arr = {1,5,3,7,9};
        int[] arr = {7, 8, 9, 1};
        int n = arr.length;
        System.out.println(isSorted(arr,n));
    }
        public static boolean isSorted ( int[] arr, int n ){
            for (int i = 0; i < n; i++) {
                if (arr[i] > arr[i + 1]) {
                    return false;
                }
            }
            return true;
        }

}
