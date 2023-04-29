import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(new StringBuilder(scanner.next()).reverse().toString()), 
        num2 = Integer.parseInt(new StringBuilder(scanner.next()).reverse().toString());
        System.out.print(Math.max(num1, num2));
    }
}