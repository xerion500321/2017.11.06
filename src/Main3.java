import java.util.Scanner;
public class Main3 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int sum = 1;
        for(int i=a ; i>0 ;i--){
            sum = sum*i;
        }System.out.println(sum);
    }
}