import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);
        int count = 0;

        List<Integer> gap = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] input2 = br.readLine().split(" ");
            int a = Integer.parseInt(input2[0]);
            int b = Integer.parseInt(input2[1]);

            if (b > a) {
                count++;
                gap.add(b - a);
            }
        }

        Collections.sort(gap);

        if (k - n + count <= 0) {
            System.out.println(0);
            return;
        }

        System.out.print(gap.get(k - n + count - 1));
    }
}