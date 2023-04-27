class Solution {
    public String solution(int age) {
        char[] alphaAge = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
        StringBuilder sb = new StringBuilder();
        while(age > 0) {
            sb.append(alphaAge[age%10]);
            age/=10;
        }
        return sb.reverse().toString();
    }
}