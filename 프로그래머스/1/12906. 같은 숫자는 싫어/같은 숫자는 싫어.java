import java.util.*;

public class Solution {

    public int[] solution(int[] arr) {

        int j = 0;
        Stack<Integer> s = new Stack<>();
        List<Integer> list;
        s.push(arr[0]);
        int answer[];

        for (int i = 1; i < arr.length; i++) {
            
            if (s.peek() != arr[i]) {

                s.push(arr[i]);
            }
        }

        list = new ArrayList<>(s);
        answer = new int[list.size()];

        for (int i : list) {

            answer[j++] = i;
        }

        return answer;
    }
}