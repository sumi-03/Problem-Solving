import java.io.*;


class Main {


    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int a = 1;
        int b = 0;
        int currentA;
        int currentB;

        for (int i = 0; i < n; i++) {

            currentA = a;
            currentB = b;

            a -= currentA;
            a += currentB;
            b += currentA;
        }

        bw.write(a + " " + b);
        bw.close();
        br.close();
    }
}