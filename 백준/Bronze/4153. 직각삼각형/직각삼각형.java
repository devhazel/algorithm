import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String[] line = br.readLine().split(" ");
        while(!"0".equals(line[0])) {
            int[] legs = {Integer.parseInt(line[0]), Integer.parseInt(line[1]), Integer.parseInt(line[2])};
            Arrays.sort(legs);
            if (Math.pow(legs[0], 2) + Math.pow(legs[1], 2) == Math.pow(legs[2], 2)) {
                bw.write("right");
            } else {
                bw.write("wrong");
            }
            bw.newLine();
            line = br.readLine().split(" ");
        }
        bw.flush();
        br.close();
    }
}