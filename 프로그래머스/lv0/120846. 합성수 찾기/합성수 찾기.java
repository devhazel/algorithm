class Solution {
    public int solution(int n) {
        int cnt = 0;
        for(int i=1; i<=n; i++) {
            if(isComposite(i)) {
               cnt++;
            }
        }
        return cnt;
    }
    
    public boolean isComposite(int num) {
        for(int i=2; i<num; i++) {
            if(num%i==0) {
                return true;
            }
        }
        return false;
    }
}