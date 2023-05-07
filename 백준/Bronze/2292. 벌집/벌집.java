import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int range = 1, i=1;
        for(; range<num; i++) {
            range += (6*i);
        }
        System.out.println(i);
    }
}