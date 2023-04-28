import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[][] matrix = new String[5][15];
        for(int i=0; i<matrix.length; i++) {
            String line = br.readLine();
            for(int j=0; j<line.length(); j++) {
                matrix[i][j] = String.valueOf(line.charAt(j));
            }
        }
        for(int j=0; j<matrix[0].length; j++) {
            for(int i=0; i<matrix.length; i++) {
                if(matrix[i][j] != null) {
                    System.out.print(matrix[i][j]);
                }
            }
        }
        System.out.println();
    }
}