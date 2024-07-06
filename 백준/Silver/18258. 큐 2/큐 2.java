import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Queue<Integer> queue = new LinkedList<>();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {

            String[] command = br.readLine().split(" ");
            String order = command[0];

            switch (order) {

                case "push":

                    int value = Integer.parseInt(command[1]);
                    queue.offer(value);
                    break;

                case "pop":

                    if (queue.isEmpty()) {
                        bw.write("-1\n");
                    } else {
                        bw.write(queue.poll() + "\n");
                    }
                    break;

                case "size":

                    bw.write(queue.size() + "\n");
                    break;

                case "empty":

                    if (queue.isEmpty()) {

                        bw.write("1\n");
                    }
                    else {

                        bw.write("0\n");
                    }
                    break;

                case "front":

                    if (queue.isEmpty()) {

                        bw.write("-1\n");
                    }
                    else {
                        
                        bw.write(queue.peek() + "\n");
                    }
                    break;

                case "back":
                    
                    if (queue.isEmpty()) {
                        
                        bw.write("-1\n");
                    } 
                    else {
                        // back 사용 시 LinkedList의 getLast 사용
                        bw.write(((LinkedList<Integer>) queue).getLast() + "\n");
                    }
                    break;
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }
}