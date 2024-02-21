import java.io.*;

public class Main {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        String array[] = input.split(" ");

        int k = Integer.parseInt(array[0]);
        int n = Integer.parseInt(array[1]);

        int length[] = new int[k];
        long max = 0;

        for (int i = 0; i < k; i++) {

            int tmp = Integer.parseInt(br.readLine());
            length[i] = tmp;

            if (max < tmp) {

                max = tmp;
            }
        }

        max++;
        long min = 0;
        long mid;
        long count;

        while (min < max) {

            count = 0;

            mid = (min + max) / 2;

            for (int i = 0; i < k; i++) {

                count += (length[i] / mid);
            }

            if (count < n) {

                max = mid;
            } 
            else {

                min = mid + 1;
            }
        }

        System.out.print(min - 1);

        br.close();
    }
}