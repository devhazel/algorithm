import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = -1;
        int maxRow = 0;
        int maxCol = 0;
        for(int i=1; i<=9; i++) {
            for(int j=1; j<=9; j++) {
                int num = scanner.nextInt();
                if(max < num) {
                    max = num;
                    maxRow = i;
                    maxCol = j;
                }
            }
        }
        System.out.printf("%d%n%d %d", max, maxRow, maxCol);
    }
}