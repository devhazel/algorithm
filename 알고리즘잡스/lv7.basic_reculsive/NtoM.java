import java.util.Scanner;

// N부터 M까지의 합을 구하시오. (N <= M)
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(), m = scanner.nextInt();
        System.out.println(getSum(n, m));
    }

    // N부터 M까지의 합을 구하는 메서드
    private static int getSum(int n, int m) {
        if(n == m) {    // 종료조건 = 기저조건
            return n;
        } else {    // 점화식
            return m + getSum(n, m-1);
        }
    }
}