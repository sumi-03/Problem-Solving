import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        String value = br.readLine();
        String valueArray[] = value.split(" ");
        int valueArrayInt[] = new int[n];
        
        int total = Integer.parseInt(br.readLine());
        
        int sum = 0;

        for (int i = 0; i < n; i++) {

            valueArrayInt[i] = Integer.parseInt(valueArray[i]);

            sum += valueArrayInt[i];
        }

        Arrays.sort(valueArrayInt);

        if (sum <= total) {
            
            System.out.print(valueArrayInt[n - 1]);
        }
        else {

            int min = 0;
            int max = valueArrayInt[n - 1];
            int mid = 0;

            while (min < max) {

                int tmp = 0;
                mid = (min + max) / 2;

                for (int i = 0; i < n; i++) {

                    if (mid < valueArrayInt[i]) {

                        tmp += mid;

                    }
                    else {

                        tmp += valueArrayInt[i];
                    }

                }

                if (tmp > total) { // 상한액을 줄여야 하는 경우

                    max = mid;

                } 
                else { // 최대인 상한액을 찾아보기

                    min = mid + 1;
                }
            }

            System.out.print(min - 1);
        }
        
        br.close();
    }
}