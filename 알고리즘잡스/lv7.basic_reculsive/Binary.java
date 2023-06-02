import java.util.Scanner;

// 숫자를 입력 받아 이진수로 출력하는 프로그램을 작성하시오.
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        printBinary(n);
    }

    // 함수 정의 : 십진수를 이진수로 변환한 값을 출력하는 메서드
    private static void printBinary(int n) {
        if(n/2==0) {    // 종료 조건
            System.out.print(n%2);
        } else {    // 점화식
            printBinary(n/2);
            System.out.print(n%2);
        }
    }
}