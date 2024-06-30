import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean flag = false;

        int n = Integer.parseInt(br.readLine());

        String str = br.readLine();
        String array[] = str.split(" ");

        int array1[] = new int[n];

        for (int i = 0; i < n; i++) {

            array1[i] = Integer.parseInt(array[i]);
        }

        int m = Integer.parseInt(br.readLine());

        str = br.readLine();
        array = str.split(" ");

        int array2[] = new int[m];

        for (int i = 0; i < m; i++) {

            array2[i] = Integer.parseInt(array[i]);
        }

        Arrays.sort(array1);

        for (int i = 0; i < m; i++) {


            if (search(array2[i], array1)) {

                System.out.print("1 ");
            } 
            else {

                System.out.print("0 ");
            }
        }

        br.close();
    }

    public static boolean search(int x, int array[]) {

        int left = 0;
        int right = array.length - 1;
        int mid;

        while (left <= right) {

            mid = (left + right) / 2;

            if (array[mid] == x) {

                return true;
            } 
            else if (array[mid] > x) {

                right = mid - 1;
            } 
            else {

                left = mid + 1;
            }
        }
        return false;
    }
    
}