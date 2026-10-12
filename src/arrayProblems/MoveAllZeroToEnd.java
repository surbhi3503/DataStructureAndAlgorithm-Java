package arrayProblems;

import java.util.ArrayList;

public class MoveAllZeroToEnd {
    public static void main(String[] args) {
        int[] arr = {1,0,2,0,4,5,1};
        int n = arr.length;
//        moveZeroToEnd(arr,n);
        moveAllZeroToEnd(arr,n);
        for (int i =  0 ; i <n ; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void moveAllZeroToEnd(int[]arr,int n){
        int j = -1;
        for (int i = 0 ; i < n ; i++) {
            if (arr[i] == 0){
                j = i;
                break;
            }
        }
        for(int i = j ; i < n ; i ++){
            if(arr[i] != 0 ){
                swap(arr,i,j);
                j++;
            }
        }
    }
    public static void swap(int[]arr,int start , int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
    //Brute Force
    public static void moveZeroToEnd(int[] arr,int n){
       ArrayList<Integer> temp = new ArrayList<>();

        for(int i = 0 ; i < n ; i++) {
            if (arr[i] != 0) {
                temp.add(arr[i]);
            }
        }
        int j =0;
        for(int i = 0;  i < temp.size() ; i ++ ){
            arr[j] = temp.get(i);
            j++;

        }
       for(int i = temp.size(); i < n ; i++ ){
                 arr[i] = 0;
    }

    }
}
