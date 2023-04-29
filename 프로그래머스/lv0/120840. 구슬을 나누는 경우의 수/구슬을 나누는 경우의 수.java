import java.math.BigInteger;


class Solution {
    public int solution(int balls, int share) {
        return multiple(balls-share+1, balls).divide(multiple(1, share)).intValue();
    }

    public BigInteger multiple(int start, int end) {
        BigInteger result = BigInteger.ONE;
        for(int i=start; i<=end; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}