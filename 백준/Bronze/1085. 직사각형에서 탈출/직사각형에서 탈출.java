import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] distance = new int[4];
        distance[0] = Integer.parseInt(st.nextToken());
        distance[1] = Integer.parseInt(st.nextToken());
        distance[2] = Math.abs(Integer.parseInt(st.nextToken())-distance[0]);
        distance[3] = Math.abs(Integer.parseInt(st.nextToken())-distance[1]);
        Arrays.sort(distance);
        System.out.print(distance[0]);        
    }
}