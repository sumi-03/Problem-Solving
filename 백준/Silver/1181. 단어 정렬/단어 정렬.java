import java.util.*;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String array[] = new String[n];

        for (int i = 0; i < n; i++) {

            array[i] = sc.next();
        }

        Arrays.sort(array, new Comparator<String>() {

            @Override
            public int compare(String s1, String s2) {

                if (s1.length() != s2.length()) {

                    return s1.length() - s2.length();
                } 
                else {

                    int result = sort(s1, s2);

                    return result;
                }
            }
        });

        System.out.println(array[0]);

        for (int i = 1; i < n; i++) {

            if (array[i].equals(array[i - 1])) {

                continue;
            } 
            else {
                
                System.out.println(array[i]);
            }
        }
    }

    public static int sort(String a, String b) {

        for (int i = 0; i < a.length(); i++) {

            if (a.charAt(i) == b.charAt(i)) {

                continue;
            } 
            else {

                if (a.charAt(i) > b.charAt(i)) {

                    return 1;
                } 
                else {

                    return -1;
                }
            }
        }

        return 0;
    }
}