package arrayProblems;

public class RotateByDPlace {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int n = arr.length;
        int d = 3;
//        rotateBYOne(arr,n);
//        rotateBYDPlace(arr, d, n);
//        for(int i = 0 ; i < n ; i++){
//            System.out.print(arr[i] + " ");
//        }
        lefrRotateOptimal(arr,d,n);
    }

    public static void rotateBYOne(int[] arr ,int n){
        int temp = arr[0];
        for (int i = 1 ; i < n ; i++){
            arr[i-1] = arr[i];
        }
        arr[n-1] = temp;
    }


    //thats brute force approach tc = O(d + N) and SC= O(d) extra space for temp to get rid of that O(d) space we will optmize these
    public static void rotateBYDPlace(int[] arr, int d, int n){
        d = d % n;

        int[] temp = new int[d];
        for(int i = 0 ; i < d ; i++){
            temp[i] = arr[i];
        }

        // shifting
        for(int i = d ; i < n ; i++){
            arr[i-d] = arr[i];
        }

        for(int i = n-d ; i < n ; i++){
            arr[i] = temp[i - (n-d)];
        }
    }

    //optimize  that o(d) space

    public static void lefrRotateOptimal(int[] arr , int d,int n ){
        reverse(arr,0,d -1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
        for(int a : arr){
            System.out.print(a + " ");
        }
    }
    public static void reverse(int[]arr, int left,int right){
        while (left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}