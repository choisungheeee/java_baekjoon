import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);		
		
		while(true) {
			int n = stdin.nextInt();
			int sum = 0;
			int count = 0;
			
			if(n == -1) return;
			
			for(int i=1; i<n; i++) {
				if(n % i == 0) {
					sum += i; 
					count += 1;
				}
			}
			
			if(sum == n) {
				System.out.print(n + " = ");
				
				for(int i=1; i<n; i++) {
					if(n % i == 0) {
						System.out.print(i);
						count -= 1;
						
						if(count != 0) System.out.print(" + ");
					}					
				}				
				System.out.println();
			}
			else {
				System.out.println(n + " is NOT perfect.");
			}
		}
	}
}