import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int repeat = Integer.parseInt(br.readLine());
        while(repeat --> 0) {
            StringTokenizer token = new StringTokenizer(br.readLine());
            int h = Integer.parseInt(token.nextToken());
            int w = Integer.parseInt(token.nextToken());
            int n = Integer.parseInt(token.nextToken());
            if(n%h == 0) {
                bw.write(String.format("%d%02d", h, n/h));
            } else {
                bw.write(String.format("%d%02d", n%h, n/h+1));
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();
        br.close();
    }
}