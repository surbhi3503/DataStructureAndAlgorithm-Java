package arrayProblems;

public class RrverseLogic {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        rotateByThree(arr,3);
        for (int i : arr){
            System.out.println(i + " ");
        }
    }

    public static void rotateByThree(int[] arr, int k){

        if(arr == null || arr.length ==0){
            return;
        }
        k =k % arr.length;
        reverse(arr,0, arr.length-1);
        reverse(arr,0, k-1);
        reverse(arr,k, arr.length-1);
    }

    public static void reverse(int[] arr , int start  ,int end){

        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
//        for(int i : arr){
//            System.out.println(i + " ");
        //}
    }
}
