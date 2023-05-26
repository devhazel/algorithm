class Solution {
    public String solution(String my_string, int num1, int num2) {
        char[] strArray = my_string.toCharArray();
        char tmp = strArray[num1];
        strArray[num1] = strArray[num2];
        strArray[num2] = tmp;
        return String.valueOf(strArray);
    }
}