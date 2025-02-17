import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        
        int[] answer = new int[commands.length];
        int[] tmp;
        int k, l = 0;
        for (int i = 0; i < commands.length; i++) {

            tmp = new int[commands[i][1] - commands[i][0] + 1];
            k = 0;

            for (int j = commands[i][0] - 1; j < commands[i][1]; j++) {

                tmp[k++] = array[j];
            }

            Arrays.sort(tmp);

            answer[l++] = tmp[commands[i][2] - 1];
        }

        return answer;
    }
}