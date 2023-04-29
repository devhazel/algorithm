import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int caseCnt = scanner.nextInt();
        for(int i=0; i<caseCnt; i++) {
            int repeat = scanner.nextInt();
            String[] str = scanner.next().split("");
            for(int j=0; j<str.length; j++) {
                System.out.print(str[j].repeat(repeat));
            }
            System.out.println();
        }
    }
}