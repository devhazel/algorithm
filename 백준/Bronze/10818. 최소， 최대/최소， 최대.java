import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int loop = Integer.parseInt(br.readLine()); 
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken());
        int min = num, max = num;
        for(int i=1; i<loop; i++) {
            num = Integer.parseInt(st.nextToken());
            if(min > num) min = num;
            if(max < num) max = num;
        }
        System.out.printf("%d %d", min, max);
    }
}