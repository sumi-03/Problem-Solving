import java.util.*;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<>();

        int n = sc.nextInt();

        while (n != 0) {

            a.add(n % 10);
            n /= 10;
        }

        Collections.sort(a);

        for (int j = a.size() - 1; j >= 0; j--) {

            System.out.print(a.get(j));
        }
    }
}