import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = 1;
        int m = 1;

        int player[] = new int[10001];

        while (true) {

            String tmp[] = br.readLine().split(" ");

            n = Integer.parseInt(tmp[0]);
            m = Integer.parseInt(tmp[1]);

            if (n == 0 && m == 0) {

                break;
            }

            for (int i = 0; i < n; i++) {

                String tmp2[] = br.readLine().split(" ");

                for (int j = 0; j < m; j++) {

                    player[Integer.parseInt(tmp2[j])]++;
                }
            }

            ArrayList<Integer> list = new ArrayList<>();

            for (int i : player) {

                list.add(i);
            }

            Collections.sort(list);

            for (int i = 0; i < list.size(); i++) {

                if (player[i] == list.get(list.size() - 2)) {

                    System.out.print(i + " ");
                }
            }

            System.out.println();

            for (int i = 0; i < 10001; i++) {

                player[i] = 0;
            }
        }
    }
}