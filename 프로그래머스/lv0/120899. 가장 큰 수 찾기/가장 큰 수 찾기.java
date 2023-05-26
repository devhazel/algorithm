class Solution {
    public int[] solution(int[] array) {
        int max = array[0];
        int maxIdx = 0;
        for(int i=1; i<array.length; i++) {
            if(array[i] > max) {
                max = array[i];
                maxIdx = i;
            }
        }
        return new int[] {max, maxIdx};
    }
}