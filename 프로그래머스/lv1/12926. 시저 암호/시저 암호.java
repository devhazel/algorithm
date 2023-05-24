class Solution {
    public String solution(String s, int n) {
        char[] strArr = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(char c : strArr) {
            if(c == ' ') {
                sb.append(c);
                continue;
            }
            if(c <= 'Z') {
                // 대문자
                sb.append((char) ((c-'A'+n)%26+'A'));
            } else {
                // 소문자
                sb.append((char) ((c-'a'+n)%26+'a'));
            }
        }
        return sb.toString();
    }
}