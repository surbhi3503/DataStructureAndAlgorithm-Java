package InterviewPrep;

public class StringBasic {
    public static void main(String[] args) {
        String s = "java is easy";
        //reverseString(s);
        reverseWorld(s);

    }
    public static void reverseString(String s ){
        String reverse = "";
        for(int i =  s.length()  -1; i >= 0 ; i--){
            reverse = reverse + s.charAt(i);
        }
        System.out.print(reverse);

    }
    public static void reverseWorld(String s ){
        String space =" ";
        String reverse = "";
        for(int i = 0 ; i <= s.length() ; i++){
            if(space.equals(s.charAt(i))){
               reverse = reverse + s.charAt(i);
                System.out.println(reverse);
            }
        }
    }
}