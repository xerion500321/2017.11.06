import java.util.Scanner;
public class Main5 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        float xu[] = new float[10];
        for (int i = 0 ; i < 10 ; i++){
            xu[i] = scn.nextFloat();
        }
        for (int i = 0 ; i < 9 ; i++){
            if (xu[i] > xu[i+1]){
                float number = xu[i];
                xu[i] = xu[i+1];
                xu[i+1] = number;
            }
        }
        System.out.println("max = " + xu[9] + '\n' + "min = " + xu[0]);

    }
}