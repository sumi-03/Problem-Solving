import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Map<Integer, String> h1 = new HashMap<>();
        Map<String, Integer> h2 = new HashMap<>();

        String input[] = br.readLine().split(" ");

        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        for (int i = 1; i <= n; i++) {

            String one = br.readLine();
            h1.put(i, one);
            h2.put(one, i);
        }

        for (int i = 0; i < m; i++) {

            String query = br.readLine();

            if (isInteger(query)) {

                bw.write(h1.get(Integer.parseInt(query)));
            }
            else {

                bw.write(String.valueOf(h2.get(query)));
            }

            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();
    }

    public static boolean isInteger(String s) {

        try {

            Integer.parseInt(s);
            return true;
        }
        catch (NumberFormatException e) {

            return false;
        }
    }
}