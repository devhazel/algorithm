import java.util.List;

class Solution {
    public String solution(String letter) {
        List<String> mos = List.of(".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--..");
        
        StringBuilder sb = new StringBuilder();
        for(String s : letter.split(" ")) {
            sb.append((char) (mos.indexOf(s)+'a'));
        }
        return sb.toString();
    }
}