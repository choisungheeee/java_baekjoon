import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);		
		
		int t = stdin.nextInt();
		
		for(int i=0; i<t; i++) {
			int c = stdin.nextInt();
			int q = 0, d = 0, n = 0, p = 0;
			
			while(c != 0) {
				q = c / 25;
				c %= 25;
				
				d = c / 10;
				c %= 10;
				
				n = c / 5;
				c %= 5;
				
				p = c;
				c %= 1;
			}
			
			System.out.println(q + " " + d + " " + n + " " + p);
		}
	}
}