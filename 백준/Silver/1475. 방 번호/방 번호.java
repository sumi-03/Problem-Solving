import java.io.*;

class Main {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int array[] = new int[10];
        int max = 0;

        int input = Integer.parseInt(br.readLine());

        while (input != 0) {

            int number = input % 10;
            array[number]++;
            input = input / 10;
        }

        array[6] = (array[6] + array[9] + 1) / 2;
        array[9] = 0;

        for (int count : array) {

            if (count > max) {

                max = count;
            }
        }

        bw.write(String.valueOf(max));
        bw.close();
        br.close();
    }
}