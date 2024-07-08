import java.io.*;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        HashMap<String, Boolean> h = new HashMap<>();

        int n = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 0; i < n; i++) {

            String x = br.readLine();

            if (x.equals("ENTER")) {

                h.clear();
            } 
            else {

                if (!h.containsKey(x)) {

                    h.put(x, true);
                    count++;
                }
            }
        }

        bw.write(String.valueOf(count));
        br.close();
        bw.flush();
        bw.close();
    }
}