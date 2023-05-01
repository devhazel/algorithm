import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,8};
        Scanner scanner = new Scanner(System.in);
        for(int i=0; i<arr.length; i++) {
            System.out.printf("%d ", arr[i] - scanner.nextInt());
        }
    }
}