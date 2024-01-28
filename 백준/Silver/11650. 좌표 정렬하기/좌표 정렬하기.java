import java.util.*;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int array[][] = new int[n][2];

        for (int i = 0; i < n; i++) {

            array[i][0] = sc.nextInt();
            array[i][1] = sc.nextInt();
        }

        Arrays.sort(array, new Comparator<int[]>() {

            @Override
            public int compare(int[] e1, int[] e2) {

                if (e1[0] == e2[0]) {

                    return e1[1] - e2[1];
                } 
                else {

                    return e1[0] - e2[0];
                }
            }
        });
 
        for (int i = 0; i < n; i++) {

            System.out.print(array[i][0] + " ");
            System.out.println(array[i][1]);
        }
    }
}