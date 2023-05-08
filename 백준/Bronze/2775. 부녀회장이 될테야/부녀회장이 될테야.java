import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int[][] apt = new int[15][14];
        for(int i=0; i<15; i++) {
            for(int j=0; j<14; j++) {
                if(i==0) {
                    apt[i][j] = j+1;
                } else {
                    int sum = 0;
                    for(int k=0; k<=j; k++) {
                        sum+= apt[i-1][k];
                    }
                    apt[i][j] = sum;
                }
            }
        }
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int times = Integer.parseInt(br.readLine());
        while(times --> 0) {
            System.out.println(apt[Integer.parseInt(br.readLine())][Integer.parseInt(br.readLine())-1]);
        }
    }
}