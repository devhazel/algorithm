import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        char[] lowerArr = my_string.toLowerCase().toCharArray();
        Arrays.sort(lowerArr);
        return String.valueOf(lowerArr);
    }
}