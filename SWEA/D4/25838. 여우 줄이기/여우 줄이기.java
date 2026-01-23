import java.util.Scanner;
import java.io.FileInputStream;

class Solution {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int n = sc.nextInt();
            String target = sc.next();

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < target.length(); i++) {
                sb.append(target.charAt(i));
                int len = sb.length();
                if (sb.length() >= 3) {
                    if (sb.charAt(len - 1) == 'x' && sb.charAt(len - 2) == 'o' && sb.charAt(len - 3) == 'f') {
                        sb.delete(len - 3, len);
                    }
                }
            }
            System.out.println(sb.length());
        }
    }
}