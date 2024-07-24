import java.util.Stack;

class Solution {

    public int solution(int[][] board, int[] moves) {

        Stack<Integer> s[] = new Stack[board.length];
        Stack<Integer> b = new Stack<>();
        int answer = 0;

        for (int i = 0; i < s.length; i++) {

            s[i] = new Stack<>();
        }

        for (int i = board.length - 1; i >= 0; i--) {

            for (int j = 0; j < board.length; j++) {

                if (board[i][j] > 0) {

                    s[j].push(board[i][j]);
                }
            }

        }

        for (int move : moves) {

            if (!s[move - 1].isEmpty()) {

                int doll = s[move - 1].pop();

                if (!b.isEmpty() && doll == b.peek()) {

                    b.pop();
                    answer += 2;
                } 
                else {

                    b.push(doll);
                }
            }
        }

        return answer;
    }
}