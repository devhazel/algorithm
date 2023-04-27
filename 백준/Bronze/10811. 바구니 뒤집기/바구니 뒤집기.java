import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int basketCnt = scanner.nextInt(), loop = scanner.nextInt();
        int[] basket = new int[basketCnt];
        for(int i=0; i<basketCnt; i++) {
            basket[i] = i+1;
        }
        for(int i=0; i<loop; i++) {
            int start = scanner.nextInt()-1, end = scanner.nextInt()-1;
            for(int j=0; j<(end-start+1)/2; j++) {
                int tmp = basket[start+j];
                basket[start+j] = basket[end-j];
                basket[end-j] = tmp;
            }
        }
        for(int i : basket) {
            System.out.printf("%d ", i);
        }
    }
}