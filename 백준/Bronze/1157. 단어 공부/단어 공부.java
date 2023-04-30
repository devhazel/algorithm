import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        int[] ascii = new int[26];
        for(int i=0; i<word.length(); i++) {
            if(word.charAt(i) >= 65 && word.charAt(i) <=90) {   // 대문자
                ascii[word.charAt(i)-65]++;
            } else {    // 소문자
                ascii[word.charAt(i)-97]++;
            }
        }
        int maxIdx = 0;
        boolean isDuplication = false;
        for(int i=1; i<ascii.length; i++) {
            if(ascii[i] > ascii[maxIdx]) {
                maxIdx = i;
                isDuplication = false;
            } else if (ascii[i] == ascii[maxIdx]) {
                isDuplication = true;
            }
        }
        if(isDuplication) {
            System.out.print("?");
        } else {
            System.out.printf("%c", maxIdx+65);
        }
    }
}