import java.util.*;

public class Main {
    public static int n, m;
    public static int[][] snake;
    public static boolean[][] visited;

    public static int[] dx = {0, 1, 0, -1};
    public static int[] dy = {1, 0, -1, 0};

    public static Queue<Position> q = new LinkedList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        snake = new int[n][m];
        visited = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                snake[i][j] = sc.nextInt();
            }
        }

        bfs(0, 0);

        int answer = visited[n - 1][m - 1] ? 1 : 0;
        System.out.print(answer);
    }

    public static void bfs(int x, int y) {
        visited[x][y] = true;
        q.add(new Position(x, y));

        while (!q.isEmpty()) {
            Position cur = q.poll();

            for (int i = 0; i < 4; i++) {
                int nx = cur.x + dx[i];
                int ny = cur.y + dy[i];

                if (nx < 0 || nx >= n || ny < 0 || ny >= m) {
                    continue;
                }

                if (snake[nx][ny] == 1 && !visited[nx][ny]) {
                    visited[nx][ny] = true;
                    q.add(new Position(nx, ny));
                }
            }
        }
    }
}

class Position {
    public int x;
    public int y;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }
}