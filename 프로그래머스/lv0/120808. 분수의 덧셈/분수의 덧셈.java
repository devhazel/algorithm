class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int numer = numer1*denom2 + numer2*denom1;
        int denom = denom1*denom2;
        int divisor = 2;
        while(divisor <= Math.min(denom1, denom2)) {
            if(numer%divisor == 0 && denom%divisor == 0) {
                numer/=divisor;
                denom/=divisor;
            } else {
                divisor++;
            }
        }
        int[] answer = {numer, denom};
        return answer;
    }
}