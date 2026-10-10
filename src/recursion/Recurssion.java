package recursion;

import static java.util.Collections.swap;

public class Recurssion {
    public static void main(String[] args) {
        //print(0);
        int n = 5;
//        printNTimes(1,n);
//        printLinealy1to5(1,n);
//        printLinearlyNto1(n,n);
//        printLinealrtBackward(n,n);
//        printNto1BYBackward(1,n);
//        sumofDigitParameter(n,0);
//        System.out.println(fact(n));
        String s = "madamj";
        char[] a = s.toCharArray();
        System.out.println( palindrome(a,0));
    }

    public static void print(int count) {

        if (count == 5) {
            return;
        }
        System.out.println(count);
        print(count + 1);
    }

    public static void printNTimes(int i , int n ){
        if(i > n){
            return;
        }else {
            System.out.println("Surbhi");
            printNTimes(i + 1, n);
        }
    }

    public static void printLinealy1to5(int i , int n){
        if(i > n){
            return;
        }else{
            System.out.println(i);
            printLinealy1to5(i+1,n);
        }
    }

    public static void printLinearlyNto1(int i , int n ){
        if(i < 1) {
            return;
        }
        else{
            System.out.println(i);
            printLinearlyNto1(i-1,n);
        }
    }

    public static void printLinealrtBackward(int i ,int n ){
        if(i < 1){
            return;
        }else{
            printLinealrtBackward(i-1,n);
            System.out.println(i);
        }
    }

    public static void printNto1BYBackward(int i, int  n){
        if(i > n){
            return;
        }else{
            printNto1BYBackward(i+1,n);
            System.out.println(i);
        }
    }

    public static void sumofDigitParameter(int i , int sum) {
        if (i < 1) {
            System.out.println(sum);
            return;
        } else {
            sumofDigitParameter(i - 1, sum + i);
        }
    }

    public static int sumOfDigitByFunction(int n){
        if(n==0){
            return 0;
        }
         return   n + sumOfDigitByFunction(n-1);
        }

        public static int fact(int n ){
        if(n==0){
            return 1;
        }
        return n * fact(n-1);
    }

    public static boolean palindrome(char[] a ,int i){
        int n;

        if(i <= a.length / 2){
            return true;
        }
        if(a[i] != a[a.length - i -1]){
            return false;
        }
        return palindrome(a,i+1);
    }


}




//public static void swap(int start, int end,int[] a){
//        if(start >= end){
//            return ;
//        }else{
//             swap(a[start] , a[end]);
//        }
//    }
//
//    public static void reverse(int i ,int n){
//        int[] a = {1,2,3,4,5};
//        if(i >= n/2){
//            return;
//        }else{
//            swap(i,a[n-i-1]);
//        }
