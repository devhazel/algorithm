class Solution {
    public int solution(int n) {
        int sum = 0;
        for(int i=1; i<=Math.sqrt(n); i++) {
            if(n%i==0) {
                int add = i*i==n ? i : i+n/i;
                sum+=add;
            }
        }
        return sum;
    }
}