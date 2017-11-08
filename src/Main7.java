import java.util.Scanner;
public class Main7 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        int sum = 0;
        for(int i = 0; i < str.length() ; i++){
            char word = str.charAt(i);
            sum += Character.getNumericValue(word);
        }
        System.out.println(sum);

    }
}