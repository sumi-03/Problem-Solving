import java.util.HashMap;

class Solution {

    public int solution(String[] want, int[] number, String[] discount) {

        HashMap<String, Integer> wantItem = new HashMap<>();
        HashMap<String, Integer> discountItem;
        int answer = 0;

        for (int i = 0; i < want.length; i++) {

            wantItem.put(want[i], number[i]);
        }

        for (int i = 0; i < discount.length - 9; i++) {

            discountItem = new HashMap<>();

            for (int j = i; j < i + 10; j++) {

                if (wantItem.containsKey(discount[j])) {

                    discountItem.put(discount[j], discountItem.getOrDefault(discount[j], 0) + 1);
                }
            }

            if (discountItem.equals(wantItem)) {

                answer++;
            }
        }

        return answer;
    }
}