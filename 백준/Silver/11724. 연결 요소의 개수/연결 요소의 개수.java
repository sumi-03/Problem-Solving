import java.util.*;

public class Main {
    public static boolean[] visited;
    public static ArrayList<Integer>[] graph;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;

        int n = sc.nextInt();
        int m = sc.nextInt();

        visited = new boolean[n + 1];
        graph = new ArrayList[n + 1];

        for (int i = 0; i < n + 1; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            graph[a].add(b);
            graph[b].add(a);
        }

        for (int i = 1; i <= n; i++) {
            if (!visited[i]) {
                count++;
                dfs(i);
            }
        }

        System.out.print(count);
    }

    public static void dfs(int u) {
        visited[u] = true;
        for (int next : graph[u]) {
            if (!visited[next]) {
                dfs(next);
            }
        }
    }
}