import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int array[] = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        Arrays.sort(array);

        int m = scanner.nextInt();

        for (int i = 0; i < m; i++) {

            int x = scanner.nextInt();

            if (search(x, 0, n - 1, array)) {

                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }


    }

    public static boolean search(int x, int low, int high, int[] array) {

        int middle;

        while (low <= high) {

            middle = (low + high) / 2;

            if (x == array[middle]) {
                return true;
            } else if (x > array[middle]) {
                low = middle + 1;
            } else {
                high = middle - 1;
            }
        }
        return false;
    }
}