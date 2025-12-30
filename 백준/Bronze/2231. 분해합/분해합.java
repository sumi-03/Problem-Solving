import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int sum=0;
        int result = 1000000;

        for(int i=1;i<n;i++){

            sum+=i;

            int j=i;
            while(j!=0) {
                sum+=j%10;
                j/=10;
            }

            if(sum==n){
                if(result>i){
                    result=i;
                }
            }

            sum=0;
        }

        if(result==1000000){
            System.out.print(0);

        }
        else{
            System.out.print(result);
        }

        scanner.close();
    }
}