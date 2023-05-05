import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = 0;
        for(int i=1; i<=n; i++) {
            int x = i, sum = x;
            while (x > 0) {
                sum += (x%10);
                x /= 10;
            }
            if (sum == n) {
                result = i;
                break;
            }
        }
        System.out.print(result);
    }
}