import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int bytes = scanner.nextInt()/4;
        while(bytes --> 0) {
            bw.append("long ");
        }
        bw.append("int");
        bw.flush();
    }
}