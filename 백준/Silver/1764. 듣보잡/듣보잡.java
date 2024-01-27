import java.util.*;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        HashSet<String> v = new HashSet<>();
        Vector<String> answer = new Vector<>();

        int n = sc.nextInt();
        int m = sc.nextInt();

        String noSee = null;

        for (int i = 0; i < n; i++) {

            v.add(sc.next());
        }

        for (int i = 0; i < m; i++) {

            noSee = sc.next();

            if (v.contains(noSee)) {

                answer.add(noSee);
            }
        }

        Collections.sort(answer);

        System.out.println(answer.size());

        for (String ans : answer) {

            System.out.println(ans);
        }
    }
}