class Solution {

    public static boolean[] visited;
    public static int[][] maps;
    public static int nn;

    public int solution(int n, int[][] computers) {
        nn = n;
        visited = new boolean[n];
        maps = computers.clone();

        int count = 0;

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(maps, visited, i);
                count++;
            }
        }

        return count;
    }

    public void dfs(int[][] maps, boolean[] visited, int current) {
        visited[current] = true;

        for (int next = 0; next < nn; next++) {
            if (maps[current][next] == 1 && !visited[next]) {
                dfs(maps, visited, next);
            }
        }
    }
}