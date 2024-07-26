import java.util.Collections;
import java.util.HashMap;
import java.io.*;
import java.util.LinkedList;
import java.util.Map;

class Main {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        HashMap<String, Integer> h = new HashMap<>();
        LinkedList<String> list = new LinkedList<>();

        int maxValue = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {

            String str = br.readLine();

            if (h.containsKey(str)) {
                int val = h.get(str);
                h.put(str, val + 1);
            } 
            else {
                h.put(str, 1);
            }
        }

        for (Map.Entry<String, Integer> entry : h.entrySet()) {

            if (entry.getValue() > maxValue) {

                maxValue = entry.getValue();
            }
        }

        for (Map.Entry<String, Integer> entry : h.entrySet()) {

            if (entry.getValue() == maxValue) {

                list.add(entry.getKey());
            }
        }

        Collections.sort(list);

        bw.write(list.get(0));
        bw.close();
        br.close();
    }
}