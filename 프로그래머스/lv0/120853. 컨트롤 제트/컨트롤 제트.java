import java.util.Stack;

class Solution {
    public int solution(String s) {
        Stack<String> stack = new Stack<>();
        for(String str : s.split(" ")) {
            if("Z".equals(str)) {
                stack.pop();
            } else {
                stack.push(str);
            }
        }
        return stack.stream().mapToInt(Integer::parseInt).sum();
    }
}