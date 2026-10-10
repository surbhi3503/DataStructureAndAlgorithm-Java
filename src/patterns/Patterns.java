package patterns;

public class Patterns {
    public static void pattern1(){
        for(int i = 0; i < 4 ; i++){
            for(int j =0 ; j < 4; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void payramid(int n ){
        for (int i =1 ; i <= n; i++){
           for( int j = 1; j <= n-i ; j++){
               System.out.print(" ");
            }
           for(int j = 1; j <= 2*i-1; j++ ){
               System.out.print("*" );
           }
            System.out.println();
        }
    }
    public static void reversefpayramid(int n ){
        for (int i = n ; i >= 1; i--){
            for( int j = 1; j <= n-i ; j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= 2*i-1; j++ ){
                System.out.print("*" );
            }
            System.out.println();
        }
    }
    public static void hollowSquare(int n ){
        for (int i =1 ; i <= n; i++){
            for( int j = 1; j <= n ; j++){
                if(i==1 || i==n || j==1 ||j==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void hollowRightTriangle(int n ){
        for (int i =n ; i >= 1; i--){
            for( int j = n; j >= 1 ; j--) {
                if (i == 1 || j == i || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }  public static void invertedHollowRightTriangle(int n ){
        for (int i =1 ; i <= n; i++){
            for( int j = 1; j <= n ; j++) {
                if (i == 1 || j == i || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void diamond(int n ){
        for (int i =1 ; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
            for (int i = n-1 ; i >= 1; i--){
                for( int j = 1; j <= n-i ; j++){
                    System.out.print(" ");
                }
                for(int j = 1; j <= 2*i-1; j++ ){
                    System.out.print("*" );
                }
                System.out.println();
            }
        }
    public static void numberPayramid(int n ) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(i);
            }
            System.out.println();
        }

    }
    public  static void floydsTriangle(int n){
        int num= 1;
        for(int i = 1 ; i <= n ; i++){
            for (int j = 1 ; j <= i; j++){
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }

    }
    public static void palindromPayramid(int n ) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
        public static void butterfly(int n ){
            for (int i = 1 ; i <= n; i++){
                for(int j = 1 ; j <= i; j++){
                    System.out.print("*");
                }
                for(int j = 1 ; j <= 2 * (n - i); j++){
                    System.out.print(" " );
                }
                for(int j  = 1 ; j <= i ; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
            for(int i =  n-1; i >= 1 ; i--){
                for(int  j = 1 ; j <= i ; j++){
                    System.out.print("*");
                }
                for(int j = 2 * (n-i) ; j >= 1; j--){
                    System.out.print(" ");
                }
                for(int j = 1; j <= i ; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
    }

    public static void main(String[] args) {
        int n = 6;
//        payramid(n);
//        reversefpayramid(n);
//        hollowSquare(n);
//        hollowRightTriangle(n);
//        invertedHollowRightTriangle(n);
//        diamond(n);
//            numberPayramid(n);
//          floydsTriangle(n);
//        numberPayramid(n);
            butterfly(n);
    }
}
