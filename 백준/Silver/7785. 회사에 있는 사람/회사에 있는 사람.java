import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, String> h = new HashMap<>();

        int n = Integer.parseInt(br.readLine());
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            String input[] = br.readLine().split(" ");
            String key = input[0];
            String value = input[1];

            h.put(key, value);
        }

        Set<Map.Entry<String, String>> entrySet = h.entrySet();

        for (Map.Entry<String, String> entry : entrySet) {

            if (entry.getValue().equals("enter")) {

                list.add(entry.getKey());
            }
        }

        Collections.sort(list, Collections.reverseOrder());

        for (String s : list) {

            System.out.println(s);
        }
    }
}