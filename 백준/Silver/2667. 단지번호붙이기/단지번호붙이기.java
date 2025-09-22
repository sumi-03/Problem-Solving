import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static int[][] array;
    public static boolean[][] visited;
    public static int[] count;
    public static int n;
    public static int k = 0;

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        sc.nextLine();

        visited = new boolean[n][n];
        array = new int[n][n];
        count = new int[n * n];

        for (int i = 0; i < n; i++) {


            String oneLine = sc.nextLine();
            for (int j = 0; j < oneLine.length(); j++) {
                array[i][j] = oneLine.charAt(j) - '0';
            }
        }

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                if (!visited[i][j] && array[i][j] == 1) {
                    count[k]++;
                    dfs(i, j, k);
                    k++;
                }
            }

        }

        System.out.println(k);

        Arrays.sort(count);

        for (int i = 0; i < count.length; i++) {
            if (count[i] > 0) {
                System.out.println(count[i]);
            }
        }
    }

    public static void dfs(int row, int col, int k) {

        visited[row][col] = true;

        int moveRow[] = {1, -1, 0, 0};
        int moveCol[] = {0, 0, -1, 1};

        for (int i = 0; i < 4; i++) {

            int newRow = row + moveRow[i];
            int newCol = col + moveCol[i];

            if (newRow >= 0 && newRow < n && newCol >= 0 && newCol < n) {

                if (array[newRow][newCol] == 0) continue;

                if (!visited[newRow][newCol]) {
                    count[k]++;
                    dfs(newRow, newCol, k);
                }
            }
        }
    }
}