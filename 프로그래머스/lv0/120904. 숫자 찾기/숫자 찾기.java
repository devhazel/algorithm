class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        int loopCnt = 0;
        while(num > 0) {
            loopCnt++;
            if(num%10 == k) {
                answer = loopCnt;
            }
            num /= 10;
        }
        if(answer != 0) {
            return loopCnt-answer+1;
        } else {
            return -1;
        }
    }
}