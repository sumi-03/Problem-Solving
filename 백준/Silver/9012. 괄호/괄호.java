import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {

            Stack<Character> stack = new Stack<>();
            String s = sc.next();

            for (int j = 0; j < s.length(); j++) {

                if (s.charAt(j) == '(') {

                    stack.push(s.charAt(j));
                } 
                else {

                    if (stack.empty()) {

                        stack.push(s.charAt(j));
                        break;
                    } 
                    else {
                        
                        stack.pop();
                    }
                }
            }

            if (stack.empty()) {
                
                System.out.println("YES");
            } 
            else {
                
                System.out.println("NO");
            }
        }
    }
}