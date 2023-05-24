class Solution {
    public int[] solution(long n) {
        char[] reversedNum = new StringBuilder(String.valueOf(n)).reverse().toString().toCharArray();
        int[] answer = new int[reversedNum.length];
        for(int i=0; i<reversedNum.length; i++) {
            answer[i] = reversedNum[i] - '0';
        }
        return answer;
    }
}
