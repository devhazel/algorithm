import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = -1, maxRow = 0, maxCol = 0;
        for(int i=1; i<=9; i++) {
            String row = br.readLine();
            StringTokenizer st = new StringTokenizer(row);
            for(int j=1; j<=9; j++) {
                int num = Integer.parseInt(st.nextToken());
                if(num > max) {
                    max = num;
                    maxRow = i;
                    maxCol = j;
                }
            }
        }
        System.out.printf("%d%n%d %d", max, maxRow, maxCol);
    }
}