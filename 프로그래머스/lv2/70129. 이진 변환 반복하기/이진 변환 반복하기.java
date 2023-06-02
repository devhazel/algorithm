class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        while(!s.equals("1")) {
            answer[0]++;
            int c = s.replace("0", "").length();
            answer[1] += (s.length() - c);
            s = Integer.toString(c, 2);
        }
        return answer;
    }
}