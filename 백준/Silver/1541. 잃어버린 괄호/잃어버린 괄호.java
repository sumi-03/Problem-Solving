import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] minusSplit = br.readLine().split("-");
        int result = 0;

        result += sumOfGroup(minusSplit[0]);

        for (int i = 1; i < minusSplit.length; i++) {
            result -= sumOfGroup(minusSplit[i]);
        }

        System.out.print(result);
    }

    private static int sumOfGroup(String s) {
        String[] plusSplit = s.split("\\+");
        int sum = 0;

        for (String num : plusSplit) {
            sum += Integer.parseInt(num);
        }

        return sum;
    }
}