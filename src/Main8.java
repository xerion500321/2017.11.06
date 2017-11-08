import java.util.Scanner;
public class Main8 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        boolean flag = false;

        for (int i = 2; i < a; i++) {
            if (a % i != 0) {
            flag = true;
            break;
                  }
        }
        if (flag){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}



