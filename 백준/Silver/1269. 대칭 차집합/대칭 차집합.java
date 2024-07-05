import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Main {
    
    
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        int a = sc.nextInt();
        int b = sc.nextInt();

        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < a; i++) {

            set1.add(sc.nextInt());
        }
        
        for (int i = 0; i < b; i++) {

            set2.add(sc.nextInt());
        }

        for (int i : set1) {
            
            if (set2.contains(i)) {
                
                count1++;
            }
        }

        for (int i : set2) {
            
            if (set1.contains(i)) {
                
                count2++;
            }
        }
        
        System.out.println(a - count1 + b - count2);
    }
}