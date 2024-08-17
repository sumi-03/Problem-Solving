import java.util.*;

class Solution {

    public int[] solution(int[] arr, int divisor) {

        boolean check = false;
        int count = 0;
        int j = 0;
        int answer[];
        boolean array[] = new boolean[arr.length];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % divisor == 0) {

                array[i] = true;
                count++;
                check = true;

            }
        }

        answer = new int[count];

        for (int i = 0; i < array.length; i++) {
            
            if (array[i]) {
                
                answer[j++] = arr[i];
            }

        }

        Arrays.sort(answer);
        
        if (check) {
            
            return answer;
        } 
        else {
            answer = new int[1];
            answer[0] = -1;
            
            return answer;
        }
    }
}