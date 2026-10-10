package hashing;
import java.util.Scanner;
import java.util.HashMap;

public class IntergerHashinfWIthMap {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int n = scanner.nextInt();
      int[] arr = new int[n];

      HashMap<Integer , Integer> map = new HashMap<>();
      for(int i = 0 ; i < n; i++){
          arr[i] = scanner.nextInt();
          map.put(arr[i] , map.getOrDefault(arr[i], 0)+1);
      }
       // quries
        int q = scanner.nextInt();
      while (q-- > 0 ){
          int number = scanner.nextInt();
          //fetch
          System.out.println(map.getOrDefault(number, 0));
      }
        scanner.close();
    }

}
