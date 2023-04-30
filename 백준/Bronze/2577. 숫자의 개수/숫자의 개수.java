import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int result = 1;
        for(int i=0; i<3; i++) {
            result *= scanner.nextInt();
        }
        int[] remainder = new int[10];
        while(result > 0) {
            remainder[result%10]++;
            result /= 10;
        }
        for(int r : remainder) {
            System.out.println(r);
        }
    }
}