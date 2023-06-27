import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] answers) {
        int[][] students = { {1,2,3,4,5}, {2,1,2,3,2,4,2,5}, {3,3,1,1,2,2,4,4,5,5} };
        int[] hit = new int[3];
        for(int i=0; i<answers.length; i++) {
            for(int j=0; j<students.length; j++) {
                if(answers[i] == students[j][i%students[j].length]) {
                    hit[j]++;
                }
            }
        }
        int max = findMax(hit);
        List<Integer> answer = new ArrayList<>();
        for(int i=0; i<3; i++) {
            if(hit[i]==max) {
                answer.add(i+1);
            }
        }
        return answer.stream().mapToInt(i->i).toArray();
    }
    
    private int findMax(int[] arr) {
        int max = 0;
        for(int i : arr) {
            if(i>max) {
                max = i;
            }
        }
        return max;
    }
}