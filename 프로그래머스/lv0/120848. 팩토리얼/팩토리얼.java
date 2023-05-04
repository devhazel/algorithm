class Solution {
    public int solution(int n) {
        int num = 1;
        int i=1;
        for(; num*i<=n; i++) {
            num *= i;
        }
        return i-1;
    }
}