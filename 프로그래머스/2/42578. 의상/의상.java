import java.util.*;

class Solution {

    public int solution(String[][] clothes) {

        HashMap<String, Integer> h = new HashMap<>();
        int total = 1;

        for (String[] cloth : clothes) {
            
            String category = cloth[1];
            h.put(category, h.getOrDefault(category, 0) + 1);
        }

        for (int count : h.values()) {
            
            total *= (count + 1);
        }

        return total - 1;
    }
}
