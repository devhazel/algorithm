import java.util.*;
import java.lang.*;

class Solution {
    public String solution(String my_string) {
        Set<Character> strSet = new LinkedHashSet<>();
        for(char c : my_string.toCharArray()) {
            strSet.add(c);
        }
        StringBuilder sb = new StringBuilder();
        Iterator<Character> it = strSet.iterator();
        while(it.hasNext()) {
            sb.append(it.next());
        }
        return sb.toString();
    }
}