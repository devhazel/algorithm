import java.util.Scanner;

// n^m을 재귀함수를 이용하여 계산하시오.
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), m = scanner.nextInt();
        System.out.print(getPower(n, m));
    }

    // n^m을 반환하는 메서드
    private static int getPower(int n, int m) {
        if(m == 0) {
            // 종료 조건 = 기저 조건
            return 1;
        } else {
            // 점화식 : n^m = n * n^(m-1)
            return n * getPower(n, m-1);
        }
    }
}