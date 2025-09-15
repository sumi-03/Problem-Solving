import java.util.*;

public class Main {

    public static int MAX = Integer.MIN_VALUE;
    public static int MIN = Integer.MAX_VALUE;
    public static int n;
    public static int[] nums;
    public static int[] operators;

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        nums = new int[n];
        operators = new int[4];

        for (int i = 0; i < n; i++) {

            nums[i] = sc.nextInt();
        }

        for (int i = 0; i < 4; i++) {
            operators[i] = sc.nextInt();
        }

        dfs(nums[0], 1);

        System.out.println(MAX);
        System.out.println(MIN);

        sc.close();
    }

    public static void dfs(int num, int idx) {

        if (idx == n) {
            MAX = Math.max(MAX, num);
            MIN = Math.min(MIN, num);

            return;
        }

        for (int i = 0; i < 4; i++) {

            if (operators[i] > 0) {

                operators[i]--;

                switch (i) {

                    case 0:
                        dfs(num + nums[idx], idx + 1);
                        break;
                    case 1:
                        dfs(num - nums[idx], idx + 1);
                        break;
                    case 2:
                        dfs(num * nums[idx], idx + 1);
                        break;
                    case 3:
                        dfs(num / nums[idx], idx + 1);
                        break;

                }

                operators[i]++;
            }
        }
    }
}