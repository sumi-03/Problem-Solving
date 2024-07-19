import java.util.Stack;
import java.util.HashSet;

class Solution {

    public int[] solution(int n, String[] words) {

        Stack<Character> s = new Stack<>();
        HashSet<String> h = new HashSet<>();

        int array[] = new int[2];
        int people;
        int turn;

        s.push(words[0].charAt(words[0].length() - 1));
        h.add(words[0]);

        for (int i = 1; i < words.length; i++) {

            people = i % n; // 현재 사람의 인덱스
            turn = i / n + 1; // 현재 차례

            if (s.peek() != words[i].charAt(0) || h.contains(words[i])) {

                array[0] = people + 1;
                array[1] = turn;

                return array;
            }

            s.push(words[i].charAt(words[i].length() - 1));
            h.add(words[i]);
        }

        array[0] = 0;
        array[1] = 0;

        return array;
    }
}