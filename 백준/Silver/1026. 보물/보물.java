import java.util.*;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int n = sc.nextInt();
        int arrayA[] = new int[n];
        int arrayB[] = new int[n];

        for (int i = 0; i < n; i++) {

            arrayA[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {

            arrayB[i] = sc.nextInt();
        }

        Arrays.sort(arrayA);
        Arrays.sort(arrayB);

        for (int i = 0; i < n; i++) {

            sum += (arrayA[i] * arrayB[n - 1 - i]);
        }

        System.out.print(sum);
    }
}