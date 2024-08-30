import java.util.HashMap;

class Solution {

    public String solution(String[] participant, String[] completion) {

        HashMap<String, Integer> h = new HashMap<>();

        for (String i : completion) {

            h.put(i, h.getOrDefault(i, 0) + 1);
        }

        for (String i : participant) {

            if (h.getOrDefault(i, 0) == 0) {
                
                return i;
            }
            
            h.put(i, h.get(i) - 1);
        }

        return null;
    }
}