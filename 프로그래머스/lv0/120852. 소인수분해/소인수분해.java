import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        List<Integer> answer = new ArrayList<>();
        for(int i=2; i<=n; ) {
            if(n%i != 0) {
                i++;
                continue;
            } else if(!answer.contains(i)) {
                answer.add(i);
            }
            n/=i;
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}