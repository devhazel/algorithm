class Solution {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()) {
            sb.append(pushAlphabet(c, n));
        }
        return sb.toString();
    }

    private char pushAlphabet(char c, int n) {
        if(!Character.isAlphabetic(c)) {
            return c;
        }
        int offset = Character.isUpperCase(c) ? 'A' : 'a';
        return (char) ((c-offset+n)%26+offset);
    }
}