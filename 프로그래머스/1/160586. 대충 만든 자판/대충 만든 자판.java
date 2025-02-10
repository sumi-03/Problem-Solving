import java.util.HashMap;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        
        int[] answer = new int[targets.length];
        HashMap<Character, Integer> h = new HashMap<>();

        for (String s : keymap) {

            for (int j = 0; j < s.length(); j++) {

                char tmp = s.charAt(j);

                if (h.containsKey(tmp)) {

                    int former = h.get(tmp);
                    h.put(tmp, Math.min(former, j + 1));
                } 
                else {

                    h.put(tmp, j + 1);
                }

            }
        }

        for (int i = 0; i < targets.length; i++) {

            int sum = 0;

            for (int j = 0; j < targets[i].length(); j++) {

                char tmp = targets[i].charAt(j);
                
                if (h.containsKey(tmp)) {
                    
                    sum += h.get(tmp);
                } 
                else {
                    
                    sum = -1;
                    break;
                }

            }
            answer[i] = sum;
        }
        return answer;
    }
}