import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int loop = scanner.nextInt();
        int[] arr = new int[loop];
        for(int i=0; i<loop; i++) {
            arr[i] = scanner.nextInt();
        }
        int num = scanner.nextInt();
        int cnt = 0;
        for(int i=0; i<arr.length; i++) {
            if(num==arr[i]) cnt++;
        }
        System.out.print(cnt);
    }
}