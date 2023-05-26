class Solution {
    public int solution(int n) {
        // 6과 n의 최소공배수 구하기
        int slice = 6;
        for(int i=2; i<=Math.min(n, slice); ) {
            if(slice%i==0 && n%i==0) {
                slice/=i;
                n/=i;
            } else {
                i++;
            }
        }
        return n;
    }
}