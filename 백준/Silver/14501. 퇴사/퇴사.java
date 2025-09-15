import java.util.*;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] t = new int[n];
        int[] p = new int[n];
        int[] cost = new int[n + 1];

        for (int i = 0; i < n; i++) {

            t[i] = sc.nextInt();
            p[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {

            if (i + t[i] < n + 1) {

                cost[i + t[i]] = Math.max(cost[i + t[i]], cost[i] + p[i]);
            }

            cost[i + 1] = Math.max(cost[i], cost[i + 1]);
        }

        System.out.println(cost[n]);
        sc.close();
    }
}