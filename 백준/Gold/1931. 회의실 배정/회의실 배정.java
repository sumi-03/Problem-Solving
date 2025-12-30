import java.io.*;
import java.util.*;

public class Main {

    static class Meeting {
        int s, e;
        Meeting(int s, int e) {
            this.s = s;
            this.e = e;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        List<Meeting> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            list.add(new Meeting(
                    Integer.parseInt(st.nextToken()),
                    Integer.parseInt(st.nextToken())
            ));
        }

        list.sort((a, b) -> {
            if (a.e != b.e) return a.e - b.e;
            return a.s - b.s;
        });

        int count = 0;
        int lastEnd = 0;

        for (Meeting m : list) {
            if (m.s >= lastEnd) {
                count++;
                lastEnd = m.e;
            }
        }

        System.out.println(count);
    }
}