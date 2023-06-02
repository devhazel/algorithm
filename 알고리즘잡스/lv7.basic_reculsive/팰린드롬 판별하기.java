import java.util.Scanner;

// 입력받은 문자열 str이 팰린드롬인지 판별하기
public class Main{
    public static void main(String[] args){
        // Please Enter Your Code Here
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        boolean result = isPalindrome(str, 0, str.length()-1);
        System.out.print(result ? "Yes" : "No");
    }

    // 함수 정의 : 팰린드롬 여부 판단하는 메서드
    private static boolean isPalindrome(String str, int start, int end) {
        if(start == end) {  // 기저 조건 : 문자열의 길이가 1인 경우
            return true;
        } else if(start+1 == end) {  // 기저 조건 : 문자열의 길이가 2인 경우
            if(str.charAt(start+1) == str.charAt(end)) {
                return true;
            } else {
                return false;
            }
        } else {    // 점화식
            if(str.charAt(start) == str.charAt(end)) {
                return isPalindrome(str, start+1, end-1);
            } else {
                return false;
            }
        }

    }
}