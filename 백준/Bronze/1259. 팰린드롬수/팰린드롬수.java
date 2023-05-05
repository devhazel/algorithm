import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            String num = br.readLine();
            if("0".equals(num)) {
                break;
            }
            String isPalindrome = "yes";
            for(int i=0; i<num.length()/2; i++) {
                if(num.charAt(i) != num.charAt(num.length()-1-i)) {
                    isPalindrome = "no";
                    break;
                };
            }
            bw.write(isPalindrome);
            bw.newLine();
        }
        bw.flush();
    }
}