package arrayProblems;

public class LargestInArray {

    public static void main(String[] args){
        int[]  arr = {-5,-5,-75,-5};
        int largestElement = largest(arr);
        int secondLargestElement = secondLargest(arr);
        System.out.println(secondLargestElement);
        System.out.println(largestElement);
    }

    public static int largest(int[] arr){
        int largest = arr[0];

        for(int i =  1 ; i < arr.length ; i++){
            if(largest < arr[i]) {
                largest = arr[i];
            }
        }
        return largest;
    }

    public static int secondLargest(int[] arr){

        if(arr == null || arr.length < 2){
            return -1;
        }

        int largest = arr[0];
        int secondLargest = Integer.MIN_VALUE;
        boolean hasSecondLargest = false;


        for(int i = 1 ; i < arr.length;i++){

            if(largest < arr[i]){
                secondLargest = largest;
                largest = arr[i];
                hasSecondLargest = true;
            } else if (largest > arr[i] && (!hasSecondLargest || arr[i] > secondLargest)) {
                secondLargest = arr[i];
                hasSecondLargest = true;
            }
        }
        return hasSecondLargest ? secondLargest : -1;
    }


}
