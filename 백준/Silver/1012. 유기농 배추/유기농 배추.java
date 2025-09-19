import java.util.*;

public class Main {

    public static int array[][];
    public static int visited[][];
    public static int n, m;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        for (int tc = 0; tc < t; tc++) {
            m = scanner.nextInt(); // 가로
            n = scanner.nextInt(); // 세로
            int k = scanner.nextInt(); // 배추 개수

            array = new int[n][m]; // 케이스마다 새 배열 생성
            visited = new int[n][m];

            for (int j = 0; j < k; j++) {
                int y = scanner.nextInt(); // 열
                int x = scanner.nextInt(); // 행
                array[x][y] = 1;
            }

            int count = 0; // 케이스마다 초기화

            for (int row = 0; row < n; row++) {
                for (int col = 0; col < m; col++) {
                    if (array[row][col] == 1 && visited[row][col] == 0) {
                        count++;
                        dfs(row, col);
                    }
                }
            }

            System.out.println(count);
        }
    }

    public static void dfs(int x, int y) {
        visited[x][y] = 1; // 현재 위치 방문 표시

        int moveX[] = {0, 0, -1, 1};
        int moveY[] = {1, -1, 0, 0};

        for (int i = 0; i < 4; i++) {
            int nx = x + moveX[i];
            int ny = y + moveY[i];

            if (nx >= 0 && nx < n && ny >= 0 && ny < m) {
                if (array[nx][ny] == 0) continue; // 0이면 그 방향만 무시
                if (visited[nx][ny] == 0) {
                    dfs(nx, ny); 
                }
            }
        }
    }
}