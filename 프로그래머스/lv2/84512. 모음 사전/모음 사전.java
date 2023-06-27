import java.util.ArrayList;
import java.util.List;

class Solution {
    final char[] vowel = {'A', 'E', 'I', 'O', 'U'};
    
    public int solution(String word) {
        List<String> words = new ArrayList<>();
        generateWords("", words);
        return words.indexOf(word);
    }
    
    public void generateWords(String word, List<String> words) {
        words.add(word);
        if(word.length() != 5) {
            for(char c : vowel) {
                generateWords(word+c, words);
            }
        }
        return;
    }
}