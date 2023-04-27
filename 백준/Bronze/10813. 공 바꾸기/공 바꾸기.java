import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] basket = new int[scanner.nextInt()];
        for(int i=0; i<basket.length; i++) {
            basket[i] = i+1;
        }
        int loop = scanner.nextInt();
        for(int i=0; i<loop; i++) {
            int a = scanner.nextInt()-1;
            int b = scanner.nextInt()-1;
            // basket[a], basket[b]의 값 교환
            int tmp = basket[a];
            basket[a] = basket[b];
            basket[b] = tmp;
        }
        for(int i : basket) {
            System.out.printf("%d ", i);
        }
    }
}