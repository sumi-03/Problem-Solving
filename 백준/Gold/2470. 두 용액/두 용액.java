import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(array);
        int L = 0;
        int R = n - 1;
        int bestL = array[L];
        int bestR = array[R];

        int abs = Integer.MAX_VALUE;

        while (L < R) {
            int absSum = Math.abs(array[L] + array[R]);
            int sum = array[L] + array[R];
            if (absSum < abs) {
                abs = absSum;
                bestL = array[L];
                bestR = array[R];
            }
            if (sum < 0) {
                L++;
            } else if (sum > 0) {
                R--;
            } else {
                break;
            }
        }

        System.out.print(bestL + " " + bestR);
    }
}