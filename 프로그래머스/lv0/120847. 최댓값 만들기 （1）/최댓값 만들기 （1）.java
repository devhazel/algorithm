class Solution {
    public int solution(int[] numbers) {
        // 내림차순 정렬 두번 해서 두 수를 곱함
        for(int i=0; i<2; i++) {
            int idx = i;
            for(int j=i; j<numbers.length; j++) {
                if(numbers[j] > numbers[idx]) {
                    idx = j;
                }
            }
            int tmp = numbers[i];
            numbers[i] = numbers[idx];
            numbers[idx] = tmp;
        }
        return numbers[0] * numbers[1];
    }
}