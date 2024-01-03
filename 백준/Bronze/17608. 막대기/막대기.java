import java.util.Scanner;
import java.util.Stack;

public class Main {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<Integer>();

        int n = scanner.nextInt();
        int array[] = new int[n];
        int count = 1;

        for (int i = 0; i < n; i++) {

            array[i] = scanner.nextInt();
            stack.push(array[i]);
        }

        int standard = stack.pop();

        while (!stack.isEmpty()) {

            int popOne = stack.pop();

            if (popOne > standard) {

                count++;
                standard = popOne;
            }
        }

        System.out.print(count);
    }
}