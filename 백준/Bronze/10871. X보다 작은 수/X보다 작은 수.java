import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int loop = scanner.nextInt();
        int num = scanner.nextInt();
        for(int i=0; i<loop; i++) {
            int a = scanner.nextInt();
            if(num > a) System.out.printf("%d ", a);
        }
    }
}