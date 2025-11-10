import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] box = new int[n];

        for (int i = 0; i < n; i++) {
            box[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(box);

        int max = 0;

        for (int i = 0; i < n; i++) {
            max = max > box[i] * (n - i) ? max : box[i] * (n - i);
        }

        System.out.print(max);
    }
}