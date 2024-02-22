import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int tree[] = new int[n];

        st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < n; i++) {

            tree[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(tree);

        int min = 0;
        int max = tree[tree.length - 1];
        int mid;

        while (min < max) {

            mid = (min + max) / 2;
            long sum = 0;

            for (int i = 0; i < tree.length; i++) {

                // sum → 잘린 길이의 합
                if (tree[i] - mid > 0) {

                    sum += tree[i] - mid;
                }
            }

            if (sum < m) { // 잘라야 하는 양 보다 적게 자른 경우 → 자르는 높이 낮추기

                max = mid;
            }
            else { // 잘라야 하는 양 이상을 자른 경우 → (최대한 나무를 적게 자르기 위해) 자르는 높이 높이기

                min = mid + 1;
            }
        }

        System.out.print(min - 1);
    }
}