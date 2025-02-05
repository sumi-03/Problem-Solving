import java.util.HashMap;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {

        HashMap<String, Integer> h = new HashMap<>();
        int[] answer = new int[photo.length];

        for (int i = 0; i < name.length; i++) {

            h.put(name[i], yearning[i]);
        }

        for (int i = 0; i < photo.length; i++) {

            for (int j = 0; j < photo[i].length; j++) {

                if (h.containsKey(photo[i][j])) {

                    answer[i] += h.get(photo[i][j]);

                }
            }
        }
        
        return answer;
    }
}