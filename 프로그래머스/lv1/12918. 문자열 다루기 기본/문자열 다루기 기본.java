class Solution {
    public boolean solution(String s) {
        boolean answer = s.length()==4 || s.length()==6;
        if(answer) {
            for(char c : s.toCharArray()) {
                if(Character.isAlphabetic(c)) {
                    answer = false;
                }
            }    
        }
        return answer;
    }
}