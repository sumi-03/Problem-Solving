import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Solution {
    public int solution(String[] friends, String[] gifts) {

        HashMap<String, Integer> give = new HashMap<>();
        HashMap<String, Integer> get = new HashMap<>();
        int giveAndTake[][] = new int[friends.length][friends.length];
        int mine[] = new int[friends.length];
        int max = 0;
        List<String> friendsList = Arrays.asList(friends);

        for (int i = 0; i < gifts.length; i++) {

            String tmp[] = gifts[i].split(" ");

            give.put(tmp[0], give.getOrDefault(tmp[0], 0) + 1);
            get.put(tmp[1], get.getOrDefault(tmp[1], 0) + 1);

            int j = friendsList.indexOf(tmp[0]);
            int k = friendsList.indexOf(tmp[1]);

            giveAndTake[j][k]++;

        }

        for (int i = 0; i < friends.length; i++) {

            for (int j = 0; j < friends.length; j++) {

                if (i == j) {
                    continue;
                }

                int a = giveAndTake[i][j];
                int b = giveAndTake[j][i];

                if (a > b) {

                    mine[i]++;
                } 
                else if (a < b) {

                    mine[j]++;
                } 
                else if (a == b || (a == 0 && b == 0)) {

                    if (give.get(friends[i]) == null) {

                        give.put(friends[i], 0);
                    }
                    if (get.get(friends[i]) == null) {

                        get.put(friends[i], 0);
                    }
                    if (give.get(friends[j]) == null) {

                        give.put(friends[j], 0);
                    }
                    if (get.get(friends[j]) == null) {

                        get.put(friends[j], 0);
                    }

                    int value = give.get(friends[i]) - get.get(friends[i]) - give.get(friends[j]) + get.get(friends[j]);

                    if (value > 0) {

                        mine[i]++;
                    } 
                    else if (value < 0) {

                        mine[j]++;
                    }
                }
            }
        }

        for (int i = 0; i < mine.length; i++) {
            
            if (mine[i] > max) {

                max = mine[i];
            }
        }


        return max / 2;
    }
}