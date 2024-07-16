import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
				
		int n = stdin.nextInt();
		int k = stdin.nextInt();
		int count = 0;
		
		for(int i=1; i<=n; i++) {
			if(n % i == 0) count += 1;
			
			if(count == k) {
				System.out.print(i);
				return;
			}
		}
		
		if(count < k) System.out.print(0);
	}
}