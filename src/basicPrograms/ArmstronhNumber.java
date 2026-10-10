package basicPrograms;

public class ArmstronhNumber {
    public static void main(String[] args) {
        int n = 372 ;
        System.out.println(armstrong(n));
    }
    public static boolean armstrong(int  n){
        int original = n;
        int sum = 0;
        while(n > 0 ){
            int lastDigit = n % 10;
            sum = sum+(lastDigit * lastDigit * lastDigit);
            n = n / 10;
        }
        return sum == original;
    }
}
