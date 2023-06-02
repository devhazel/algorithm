import java.util.Scanner;

// N!을 계산하는 프로그램을 작성하시오.
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.print(getFactorial(n));
    }

    // 함수 정의 : n!을 반환하는 메서드
    private static int getFactorial(int n) {
        if(n==0) {  // 종료 조건 = 기저 조건
            return 1;
        } else {    // 점화식
            return n * getFactorial(n-1);
        }
    }
}