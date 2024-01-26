import java.util.*;

public class Main {

    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int array[] = new int[n];

        for (int i=0;i<n;i++) {

            q.offer(i+1);
        }

        int count = 0;
        
        while (true) {

            if (q.size() == 1) {
                break;
            }

            if (count % 2 == 0) {

                q.poll();
            }
            else {

                q.offer(q.poll());
            }

            count++;
        }
        
        System.out.print(q.peek());
    }
}