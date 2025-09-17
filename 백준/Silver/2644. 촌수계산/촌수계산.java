import java.util.*;

public class Main {

    public static ArrayList<Integer> g[];
    public static boolean v[] = new boolean[101];
    public static int[] array;
    public static int a, b;
    public static int answer = -1;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        array = new int[n];

        a = scanner.nextInt();
        b = scanner.nextInt();
        int m = scanner.nextInt();

        g = new ArrayList[n + 1];

        for (int i = 0; i < n + 1; i++) {

            g[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {

            int x = scanner.nextInt();
            int y = scanner.nextInt();

            g[x].add(y);
            g[y].add(x);
        }

        dfs(a, 0);

        System.out.print(answer);
    }

    static void dfs(int current, int depth) {

        v[current] = true;

        if (current == b) {

            answer = depth;
            return;
        }

        for (int next : g[current]) {

            if (!v[next]) {
                dfs(next, depth + 1);
            }
        }
    }
}