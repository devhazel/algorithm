import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int cnt = 0;
        for(int i=1; i<=n; i++) {
            if(checkHansu(i)) cnt++;
        }
        System.out.println(cnt);
    }
    
    private static boolean checkHansu(int i) {
        if(i/1000 > 0) { // 네자릿수
            return i/1000 - (i%1000)/100 == (i%1000)/100 - (i%100)/10
                    && (i%1000)/100 - (i%100)/10 == (i%100)/10 - i%10;
        } else if(i/100 > 0) { // 세자릿수
            return i/100 - (i%100)/10 == (i%100)/10 - i%10;
        } else { // 두자릿수, 한자릿수
            return true;
        }
    }
}