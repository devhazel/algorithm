import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int repeat = Integer.parseInt(br.readLine());
        int[] num = new int[repeat];
        for(int i=0; i<repeat; i++) {
            num[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(num);
        for(int n : num) {
            bw.write(String.valueOf(n));;
            bw.newLine();
        }
        bw.flush();
    }
}