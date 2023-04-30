import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        String line = br.readLine();
        StringTokenizer st = new StringTokenizer(line);
        int primaryCnt = 0;
        while(st.hasMoreTokens()) {
            int num = Integer.parseInt(st.nextToken());
            if(num == 1) {
                continue;
            }
            boolean isPrimary = true;
            for(int i=2; i<num; i++) {
                if(num%i==0) {
                    isPrimary = false;
                    break;
                }
            }
            if(isPrimary) {
                primaryCnt++;
            }
        }
        System.out.print(primaryCnt);
    }
}