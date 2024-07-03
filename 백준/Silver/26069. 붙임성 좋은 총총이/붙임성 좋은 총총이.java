import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<String> h = new HashSet<>();

        h.add("ChongChong");

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {

            String str = br.readLine();
            String array[] = str.split(" ");

            if (h.contains(array[0]) || h.contains(array[1])) {

                h.add(array[0]);
                h.add(array[1]);
            }
        }

        System.out.print(h.size());

    }
}