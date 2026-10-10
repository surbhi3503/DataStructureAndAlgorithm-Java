package sorting;
import java.util.ArrayList;

public class MergeSort {
    public static void main(String[] args) {

    int[] arr = {8,3,2,5,9,1,7,4};
     mergeSort(arr,0,arr.length-1);

     for (int a : arr){
         System.out.print(a + " ");
     }
    }

    public static void mergeSort(int[]arr , int low ,int high){
        // base case
        if(low >= high){
            return ;
        }
        int mid = low + (high - low) /2;

        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1, high );

        // merge
        merge(arr,low,mid,high);
    }
    public static void merge(int[] arr ,int low, int mid , int high ){
        ArrayList<Integer> temp = new ArrayList<>();

       int left =low ;
       int right = mid+1;

       while(left <= mid && right <= high){

           if(arr[left] <= arr[right]){
               temp.add(arr[left]);
               left++;
           }else{
               temp.add(arr[right]);
               right++;
           }

           // remainning elements
           while(left <= mid){
               temp.add(arr[left]);
               left++;
           }
           while(right <= high){
               temp.add(arr[right]);
               right++;
           }

           for(int i = low ; i <= high ; i++){
               arr[i] = temp.get(i - low);
           }

       }
    }
}
