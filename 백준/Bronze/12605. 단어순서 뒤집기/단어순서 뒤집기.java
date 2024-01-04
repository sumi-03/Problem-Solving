import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();

        for(int i=0;i<n;i++){

            String sentense = scanner.nextLine();
            StringTokenizer st = new StringTokenizer(sentense,  " ");

            while(st.hasMoreTokens()){

                stack.push(st.nextToken());
            }

            System.out.print("Case #" + (i+1) + ": ");

            while(!stack.isEmpty()){

                System.out.print(stack.pop() + " ");
            }
            
            System.out.print("\n");
        }
    }
}