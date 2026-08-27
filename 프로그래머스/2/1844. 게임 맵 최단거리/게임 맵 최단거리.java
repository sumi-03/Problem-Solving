import java.util.*;

class Solution {

    public int solution(int[][] maps) {

        int n = maps.length;
        int m = maps[0].length;

        boolean[][] visited = new boolean[n][m];

        int[] moveX = {0, 1, 0, -1};
        int[] moveY = {1, 0, -1, 0};

        Queue<int[]> queue = new LinkedList<>();

        queue.offer(new int[]{0, 0, 1});
        visited[0][0] = true;

        while (!queue.isEmpty()) {

            int[] cur = queue.poll();

            int x = cur[0];
            int y = cur[1];
            int count = cur[2];

            if (x == n - 1 && y == m - 1) {
                return count;
            }

            for (int i = 0; i < 4; i++) {

                int nx = x + moveX[i];
                int ny = y + moveY[i];

                if (nx < 0 || nx >= n || ny < 0 || ny >= m) {
                    continue;
                }

                if (maps[nx][ny] == 0) {
                    continue;
                }

                if (visited[nx][ny]) {
                    continue;
                }

                visited[nx][ny] = true;
                queue.offer(new int[]{nx, ny, count + 1});
            }
        }

        return -1;
    }
}
