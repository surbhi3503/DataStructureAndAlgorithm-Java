package sorting;
import java.util.ArrayList;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {3,2,4,1,5};
        int low = 0 ;
        int high = arr.length;
        int mid = low + high / 2;
         if(low > high){
          return ;
         }
         mergeSort(arr ,low,high);
        mergeSort(arr ,mid+1,high);
        mergeSort(arr ,low,high);


    }
    public static void mergeSort(int[] arr , int  low , int high ){
        ArrayList<Integer> temp = new ArrayList<>();
        int mid = low + high /2 ;
        int left = low;
        int right  = mid+ + 1 ;
        while (left < mid && right < high ){
            if(arr[left] <= arr[right]){
                temp.add(arr[left] );
                left++;
            }else{
                temp.add(arr[right]);
                right++;
            }
            while(left < mid){
                temp.add(arr[left]);
                left++;
            }
            while(right < high){
                temp.add(arr[right]);
                right++;
            }
        }
    }
}
