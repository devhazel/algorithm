import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int times = Integer.parseInt(br.readLine());
        String str = br.readLine();
        BigInteger sum = new BigInteger("0");
        for(int i=0; i<times; i++) {
            BigInteger power = new BigInteger("1");
            for(int j=0; j<i; j++) {
                power = power.multiply(BigInteger.valueOf(31));
            }
            sum = sum.add(BigInteger.valueOf((str.charAt(i) - 96)).multiply(power));
        }
        System.out.println(sum.mod(BigInteger.valueOf(1234567891)));
    }
}