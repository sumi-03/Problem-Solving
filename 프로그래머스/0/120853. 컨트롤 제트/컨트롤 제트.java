import java.util.*;

class Solution {
    public int solution(String s) {
        String[] tmp = s.split(" ");
        Stack<Integer> stack = new Stack<>();

        for (String str : tmp) {
            if (str.equals("Z")) {
                if (!stack.isEmpty()) {
                    stack.pop(); 
                }
            } else {
                stack.push(Integer.parseInt(str)); 
            }
        }

        int answer = 0;
        for (int num : stack) {
            answer += num;
        }

        return answer;
    }
}