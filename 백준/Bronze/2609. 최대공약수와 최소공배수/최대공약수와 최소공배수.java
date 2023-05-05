import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(), b = scanner.nextInt();;
        int max = 1;
        for(int i=2; i<=Math.min(a, b); ) {
            if(a%i==0 && b%i==0) {
                max *= i;
                a /= i;
                b /= i;
            } else {
                i++;
            }
        }
        System.out.printf("%d%n%d", max, max*a*b);
    }
}