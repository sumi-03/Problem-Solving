import java.util.Stack;
import java.util.HashMap;

class Solution {

    public int solution(String s) {

        HashMap<Character, Character> map = new HashMap<>();

        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');

        int answer = 0;
        int n = s.length();
        s += s;

        a: for (int i = 0; i < n; i++) {

            Stack<Character> stack = new Stack<>();

            for (int j = i; j < i + n; j++) {

                char c = s.charAt(j);

                if (!map.containsKey(c)) { // 열리는 괄호

                    stack.push(c);
                }
                else { // 닫히는 괄호

                    if (stack.isEmpty() || !stack.pop().equals(map.get(c))) {

                        continue a;
                    }
                }
            }


            if (stack.isEmpty()) {

                answer++;
            }
        }
        
        return answer;
    }
}