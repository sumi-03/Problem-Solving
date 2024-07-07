import java.util.HashMap;
import java.util.HashSet;

class Solution {

    static HashMap<String, int[]> rule = new HashMap<>();

    public int solution(String dirs) {

        HashSet<String> answer = new HashSet<>();

        int x = 5;
        int y = 5;

        rule.put("U", new int[]{0, 1});
        rule.put("D", new int[]{0, -1});
        rule.put("R", new int[]{1, 0});
        rule.put("L", new int[]{-1, 0});

        for (int i = 0; i < dirs.length(); i++) {

            int array[] = rule.get(String.valueOf(dirs.charAt(i)));

            int nx = x + array[0];
            int ny = y + array[1];

            if (nx < 0 || nx > 10 || ny < 0 || ny > 10) {

                continue;
            }

            answer.add(x + " " + y + " " + nx + " " + ny);
            answer.add(nx + " " + ny + " " + x + " " + y);

            x = nx;
            y = ny;

        }

        return answer.size() / 2;

    }
}