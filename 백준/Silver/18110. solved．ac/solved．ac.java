import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        ArrayList<Integer> list = new ArrayList<>();

        int n = Integer.parseInt(br.readLine());

        int except = (int) Math.round(n * 1.0 * 15 / 100);
        int sum = 0;

        for (int i = 0; i < n; i++) {

            list.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(list);

        for (int i = except; i < n - except; i++) {
            sum += list.get(i);
        }

        bw.write(String.valueOf((int) Math.round(sum / (n - 2 * except * 1.0))));
        br.close();
        bw.flush();
        bw.close();
    }
}