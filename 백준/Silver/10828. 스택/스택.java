import java.util.*;
import java.io.*;

public class Main {

    public static void main(String args[]) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<Integer> stack = new Stack<>();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {

            String value = br.readLine();
            String array[] = value.split(" ");

            if (array.length > 1 && array[0].equals("push")) {

                stack.push(Integer.parseInt(array[1]));
            } 
            else if (array[0].equals("pop")) {

                if (stack.isEmpty()) {

                    bw.write("-1");
                    bw.newLine();
                } 
                else {

                    bw.write(String.valueOf(stack.pop()));
                    bw.newLine();
                }
            } 
            else if (array[0].equals("size")) {

                bw.write(String.valueOf(stack.size()));
                bw.newLine();
            } 
            else if (array[0].equals("empty")) {

                if (stack.isEmpty()) {

                    bw.write("1");
                    bw.newLine();
                } 
                else {
                    bw.write("0");
                    bw.newLine();
                }
            } 
            else if (array[0].equals("top")) {

                if (stack.isEmpty()) {

                    bw.write("-1");
                    bw.newLine();
                } 
                else {

                    bw.write(String.valueOf(stack.peek()));
                    bw.newLine();
                }
            }
        }

        br.close();
        bw.close();
    }
}