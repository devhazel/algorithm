class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        for(int i=0; i<emergency.length; i++) {
            int order = 0;
            for(int j : emergency) {
                if(emergency[i] < j) {
                    order++;
                }
            }
            answer[i] = order+1;
        }
        return answer;
    }
}