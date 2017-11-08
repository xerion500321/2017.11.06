import java.util.Scanner;
public class Main2 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
         int howmany = scn.nextInt();
         int xu[] = new int[howmany];
         int sum = 0;
         for (int i = 0 ; i < howmany ; i++){
             xu[i] = scn.nextInt();
             sum = sum+xu[i];
         }
        System.out.println("總和:"+sum);
        System.out.println("平均:"+sum/howmany);
    }
}