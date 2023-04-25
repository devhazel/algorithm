import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = scanner.nextInt();
        int idx = 0;
        for(int i=1; i<9; i++) {
            int a = scanner.nextInt();
            if(a > max) {
                max = a;
                idx = i;
            }
        }
        System.out.printf("%d\n%d", max, idx+1);
    }
}