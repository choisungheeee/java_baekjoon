import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);		
		
		int m = stdin.nextInt();
		int n = stdin.nextInt();
		
		int sum = 0;
		int min = 10000;
		
		for(int i=m; i<=n; i++) {
			int count = 0;
			
			for(int k=1; k<=i; k++) {
				if(i % k == 0) count += 1;
			}
			
			if(count == 2) {
				sum += i;
				if(i < min) min = i;
			}
		}
		
		if(sum == 0) System.out.print(-1);
		else System.out.print(sum + "\n" + min);
	}
}