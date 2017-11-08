import java.util.Scanner;
public class Main6 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        int a = scn.nextInt();

        for(int i = 0; i < str.length() ; i++) {
            char word = str.charAt(i);
            int meow = word+a;
            System.out.print((char)meow);
        }
}
}