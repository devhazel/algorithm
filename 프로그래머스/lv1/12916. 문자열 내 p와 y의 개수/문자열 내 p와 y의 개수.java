class Solution {
    boolean solution(String s) {
        int pCnt = 0, yCnt = 0;
        for(char c : s.toLowerCase().toCharArray()) {
            if(c == 'p') pCnt++;
            else if(c == 'y') yCnt++;
        }
        return pCnt==yCnt;
    }
}