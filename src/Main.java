import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int sum = 0;
        if (a % 3 == 0) {
            for (int i = a; i <= b; i += 3) {
                sum = sum + i;
            }
            System.out.println(sum);
        }   else  {
                for (int i = a+1; i <= b; i +=3) {
                    sum = sum + i;
                }
                System.out.println(sum);
            }
        }
    }

