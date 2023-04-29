import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cnt = scanner.nextInt();
        String[] numArr = scanner.next().split("");
        int sum = 0;
        for(String num : numArr) {
            sum += Integer.parseInt(num);
        }
        System.out.print(sum);
    }
}