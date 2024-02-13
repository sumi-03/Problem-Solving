import java.io.*;
import java.util.*;

public class Main {

    public static void main(String args[]) throws IOException {

        HashMap<String, Integer> h = new HashMap<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        String value[] = br.readLine().split(" ");

        for (int i = 0; i < n; i++) {

            if (h.containsKey(value[i])) {

                h.put(value[i], h.get(value[i]) + 1);
            } 
            else {

                h.put(value[i], 1);
            }
        }

        int m = Integer.parseInt(br.readLine());

        String figure[] = br.readLine().split(" ");

        for (int i = 0; i < m; i++) {

            if (h.containsKey(figure[i])) {

                bw.write(String.valueOf(h.get(figure[i])) + " ");
            } 
            else {

                bw.write("0 ");
            }
        }

        br.close();
        bw.close();
    }
}