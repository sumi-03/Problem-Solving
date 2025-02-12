class Solution {
    public String solution(int n) {
        String answer = "";

        String word = "수박";
        String word2 = "수";

        int count = n / 2;

        for (int i = 0; i < count; i++) {

            answer += word;

        }
        if (n % 2 == 1) {

            answer += word2;
        }

        return answer;
    }
}