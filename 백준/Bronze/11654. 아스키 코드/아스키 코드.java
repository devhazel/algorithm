import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String character = scanner.next();
        System.out.println((int) character.charAt(0));
    }
}