import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        TreeMap<Integer, Integer> map = new TreeMap<>();

        for (String s : operations) {
            String[] data = s.split(" ");
            String first = data[0];
            int second = Integer.parseInt(data[1]);

            if (first.equals("I")) {
                map.put(second, map.getOrDefault(second, 0) + 1);
            } else if (first.equals("D")) {

                if (map.isEmpty()) {
                    continue;
                }

                int key;

                if (second == 1) {
                    key = map.lastKey();
                } else {
                    key = map.firstKey();
                }

                if (map.get(key) == 1) {
                    map.remove(key);
                } else {
                    map.put(key, map.get(key) - 1);
                }
            }
        }

        if (map.isEmpty()) {
            return new int[]{0, 0};
        }

        return new int[]{map.lastKey(), map.firstKey()};
    }
}