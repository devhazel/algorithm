class Solution {
    public int solution(int n) {
        // 3진법 > reverse > 10진법
        return Integer.parseInt(new StringBuilder(Integer.toString(n, 3)).reverse().toString(), 3);
    }
}