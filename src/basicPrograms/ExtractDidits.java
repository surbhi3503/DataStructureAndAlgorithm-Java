package basicPrograms;

public class ExtractDidits {
    public static void digitExtrator(int n) {
        while (n > 0) {
            int digit = n % 10;
            System.out.print(digit);
            n = n / 10;
        }
    }
    public static int countOfDidit(int n ) {
        int count = 0;
        while (n > 0) {
            int digit = n % 10;
            count++;
            n = n / 10;
        }
        return count;
        //        int count = int(log10)

    }
    public static void main(String[] args) {
        int n  = 7789;
//        digitExtrator(n);
        System.out.println(countOfDidit(n));
    }
}