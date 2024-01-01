import java.util.Scanner;

public class Main {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		int m = sc.nextInt();
		int n = sc.nextInt();

		prime(m, n);
	}

	public static void prime(int m, int n) {

		boolean array[] = new boolean[n+1];

		for (int i = 2; i <= n; i++) {

			array[i] = true;
		}

		for (int i = 2; i <= n; i++) {
			
			if (!array[i]) {
				
				continue;
			}
			
			for (int j = i+i; j <= n; j += i) {
				array[j] = false;
			}
		}

		for (int i = m; i <= n; i++) {

			if (array[i]) {
				
				System.out.println(i);
			}
		}
	}
}