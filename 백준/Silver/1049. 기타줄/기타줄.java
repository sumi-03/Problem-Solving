import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] array = new int[m][2];
        for (int i = 0; i < m; i++) {
            array[i][0] = sc.nextInt();
            array[i][1] = sc.nextInt();
        }

        int minSet = Integer.MAX_VALUE;
        int minEach = Integer.MAX_VALUE;

        for (int i = 0; i < m; i++) {
            if (array[i][0] < minSet) {
                minSet = array[i][0];
            }
            if (array[i][1] < minEach) {
                minEach = array[i][1];
            }
        }

        int costAllEach = n * minEach;
        int costAllSet = ((n + 5) / 6) * minSet;
        int costMix = (n / 6) * minSet + (n % 6) * minEach;

        int result = Math.min(costAllEach, Math.min(costAllSet, costMix));

        System.out.println(result);
    }
}