package basicPrograms;

public class Palindrom {
    public static void main(String[] args) {
        int n  = 121;
        int n1 = 654;
        System.out.println(palindrom(n));
        System.out.println(palindrom(n1));
    }

    public static boolean palindrom(int n) { ;
         int original = n;

        int revere = 0;
        while (n > 0) {
            int digit = n % 10;
            revere = (revere * 10) + digit;
            n = n/10;
        }
        return revere == original ;

}}
