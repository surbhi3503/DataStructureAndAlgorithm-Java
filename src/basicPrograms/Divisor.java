package basicPrograms;

public class Divisor {
    public static void main(String[] args) {
        int n = 36;
        divosorPrint(n);
        System.out.println();
        divisorOptimizeSolution(n);
    }
    public static void divosorPrint(int n ){
        for (int i = 1 ; i <= n ; i++){
            if(n % i == 0){
                System.out.print(" " + i + " ");

            }
        }
    }
    public static void divisorOptimizeSolution(int n){
        for(int i = 1 ; i * i <= n ; i++){
        if(n % i == 0){
            System.out.print(" " + i + " ");

        if((n / i) != i) {
            System.out.print(" " + n / i + " ");
        } }
        }
    }
}
