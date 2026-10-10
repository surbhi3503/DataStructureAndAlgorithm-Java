package hashing;
import java.util.Scanner;

public class CharacterHashing {
    public static void main(String[] args) {
//      forSmallOrCapitalLetter();
        characterhashing();
    }

       public static void characterhashing(){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();

        // frequency array
           int[] hash = new int[256];
           for(int i = 0 ; i < s.length(); i++){
            hash[s.charAt(i)]++;
           }

           //quries
           int q = scanner.nextInt();
           while (q-- > 0 ){
               char c = scanner.next().charAt(0);
               //fetch
               System.out.println(hash[c]);
           }

       }
        public static void forSmallOrCapitalLetter() {
            Scanner scanner = new Scanner(System.in);
            String s = scanner.next();

            int[] hash = new int[26];
            for (int i = 0; i < s.length(); i++) {
                hash[s.charAt(i) - 'A']++;
            }
            //quries
            int q = scanner.nextInt();
            while (q-- > 0) {
                char c = scanner.next().charAt(0);
                //fetch
                System.out.println(hash[c - 'A']);
            }
            scanner.close();
        }
    }


