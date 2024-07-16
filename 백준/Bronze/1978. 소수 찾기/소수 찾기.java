import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);		
		
		int n = stdin.nextInt();
		int count = 0;
		
		for(int i=0; i<n; i++) {
			int m = stdin.nextInt();
			int sosu = 0; 
			
			for(int k=1; k<=m; k++) {
				if(m % k == 0) sosu += 1;
			}
			
			if(sosu == 2) count += 1;
		}
		
		System.out.print(count);
	}
}