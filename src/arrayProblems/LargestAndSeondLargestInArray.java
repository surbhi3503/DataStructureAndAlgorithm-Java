package arrayProblems;

public class LargestAndSeondLargestInArray {

    public static void main(String[] args){
        int[]  arr = {5,35,75,95};
        System.out.println(largest(arr));
        System.out.println(secondLargest(arr));
    }

    // tc = o(n) sc = o(1) ans ifi do with bruteforce with sorting first then last element if array is sorted then tc will be O(n log n ) + O(n)
    public static int largest(int[]arr ){
        int largest = arr[0];
        for(int i = 0 ; i <= arr.length-1; i ++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
            return largest;

    }

    public static int secondLargest(int[] arr) {

        if(arr == null || arr.length < 2 ){
            return -1;
        }

        int largest = arr[0];
        int secondLargest = Integer.MIN_VALUE; //if array is not contain negative then it also can be -1;

        for( int i = 0 ; i <= arr.length-1; i++){
            if(arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            }else if(arr[i] < largest && arr[i] > secondLargest ){
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }


}
