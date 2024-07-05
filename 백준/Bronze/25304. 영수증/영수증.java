import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);

		long x = stdin.nextLong();
		int n = stdin.nextInt();
		int sum = 0;
		
		for(int i=0; i<n; i++) {
			int a = stdin.nextInt();
			int b = stdin.nextInt();
			
			sum += a*b;
		}
		
		if(x == sum) System.out.print("Yes");
		else System.out.print("No");
	}
}
