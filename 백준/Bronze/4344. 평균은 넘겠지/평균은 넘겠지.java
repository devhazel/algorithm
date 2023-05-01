import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int loop  = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for(int i=0; i<loop; i++) {
            String line = br.readLine();
            st = new StringTokenizer(line);
            int num = Integer.parseInt(st.nextToken());
            int[] scores = new int[num];
            for(int j=0; j<num; j++) {
                scores[j] = Integer.parseInt(st.nextToken());
            }
            // 평균 구하기
            double avg = getAvg(scores);
            // 평균 이상 비율 구하기
            double pct = getPct(scores, avg);
            System.out.printf("%.3f%%\n", pct);
        }
    }
    
    private static double getPct(int[] scores, double avg) {
        int cnt = 0;
        for(int score : scores) {
            if((double)score > avg) cnt++;
        }
        return (cnt*100.0) / scores.length;
    }
    
    private static double getAvg(int[] scores) {
        int sum = 0;
        for(int score : scores) {
            sum += score;
        }
        return (double)sum / scores.length;
    }
}