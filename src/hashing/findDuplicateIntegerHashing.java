package hashing;

import java.util.Scanner;

public class findDuplicateIntegerHashing {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("enter array size");
        int arraySize = s.nextInt();
        int[] arr = new int[arraySize];

        // array input
        System.out.println("enter array element");
        for (int i = 0 ; i < arraySize ; i++){
            arr[i] = s.nextInt();
        }

        // ferqreuncy array

        int[] hash = new int[13];
        for (int i = 0 ; i < arraySize; i++){
            hash[arr[i]]++;
        }

        // queies
        System.out.println("enter  quries");
        int q = s.nextInt();
        while (q -- > 0){
         int number = s.nextInt();
         // fetch
            System.out.println( hash[number] );
        }

    }
}