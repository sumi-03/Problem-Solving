import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Queue<Integer> q = new LinkedList<>();

        int check[] = new int[100001];
        Arrays.fill(check, -1);

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        q.offer(n);
        check[n] = 0;

        while (!q.isEmpty()) {

            int cur = q.poll();

            if (cur == k) {

                System.out.println(check[cur]);
                return;
            }

            int next[] = {cur - 1, cur + 1, cur * 2};

            for (int nxt : next) {

                if (nxt < 0 || nxt > 100000) {
                    continue;
                }
                
                if (check[nxt] != -1) {
                    continue;
                }

                check[nxt] = check[cur] + 1;
                q.offer(nxt);
            }
        }
    }
}