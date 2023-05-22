class Solution {
    public int[] solution(long n) {
        String strNum = String.valueOf(n);
        int[] answer = new int[strNum.length()];
        for(int i=0; i<strNum.length(); i++) {
            answer[i] = Integer.parseInt(String.valueOf(strNum.charAt(strNum.length()-i-1)));
        }
        return answer;
    }
}