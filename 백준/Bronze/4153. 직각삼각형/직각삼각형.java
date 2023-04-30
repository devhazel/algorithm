import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] legs = new int[3];
        while(true) {
            for(int i=0; i<3; i++) {
                legs[i] = scanner.nextInt();
            }
            if(legs[0]==0 && legs[1]==0 && legs[2]==0) {
                break;
            }
            Arrays.sort(legs);
            if(Math.pow(legs[2], 2) == Math.pow(legs[0], 2) + Math.pow(legs[1], 2)) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }
        }
    }
}