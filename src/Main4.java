import java.util.Scanner;
public class Main4 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int sum = 1;
        int sam = 1;
        int sbm = 1;
        for(int i=a; i>0; i--){
          sum = sum*i;
        }
        for(int i=b; i>0; i--){
            sam = sam*i;
        }
        for(int i=a-b; i>0; i-- ){
            sbm = sbm*i;
        }
        System.out.println(sum/(sam*sbm));
    }
}
