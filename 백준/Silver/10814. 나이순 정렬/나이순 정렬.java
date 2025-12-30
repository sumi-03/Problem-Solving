import java.io.*;
import java.util.*;

public class Main {

    static class Member {
        int age;
        String name;

        Member(int age, String name) {
            this.age = age;
            this.name = name;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        List<Member> list = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            list.add(new Member(age, name));
        }

        list.sort(Comparator.comparingInt(m -> m.age));

        StringBuilder sb = new StringBuilder();
        for (Member m : list) {
            sb.append(m.age).append(' ').append(m.name).append('\n');
        }
        System.out.print(sb);
    }
}