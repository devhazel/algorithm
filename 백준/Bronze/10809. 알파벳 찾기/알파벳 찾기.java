import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        int[] location = new int[26];
        Arrays.fill(location, -1);
        for(int i=word.length()-1; i>=0; i--) {
            location[word.charAt(i)-'a'] = i;
        }
        for(int i : location) {
            System.out.printf("%d ", i);
        }
    }
}