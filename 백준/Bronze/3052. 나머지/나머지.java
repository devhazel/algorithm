import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[42];
        while(scanner.hasNextInt()) {
            arr[scanner.nextInt()%42]++;
        }
        int cnt = 0;
        for(int a : arr) {
            if(a != 0) cnt++;
        }
        System.out.print(cnt);
    }
}