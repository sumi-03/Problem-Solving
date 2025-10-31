import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[][] classInfo = new int[N][5];
        for (int i = 0; i < N; i++) {
            for (int year = 0; year < 5; year++) {
                classInfo[i][year] = sc.nextInt();
            }
        }
        sc.close();

        int bestStudent = 0;
        int maxCount = -1;

        for (int i = 0; i < N; i++) {
            int count = 0;

            for (int j = 0; j < N; j++) {
                if (i == j) continue;

                boolean everTogether = false;
                for (int year = 0; year < 5; year++) {
                    if (classInfo[i][year] == classInfo[j][year]) {
                        everTogether = true;
                        break;
                    }
                }
                if (everTogether) {
                    count++;
                }
            }

            if (count > maxCount) {
                maxCount = count;
                bestStudent = i;
            }
        }

        System.out.println(bestStudent + 1);
    }
}