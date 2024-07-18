import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);		
		
		int a = stdin.nextInt();
		int b = stdin.nextInt();
		int c = stdin.nextInt();
		
		int max = Math.max(a, Math.max(b, c));
		int sum = (a + b + c) - max;
				
		if(a == b && a == c) System.out.print(a + b + c);
		else {
			if(sum > max) System.out.print(a + b + c);
			else if(sum == max) System.out.print(a + b + c - 1);
			else {
				max = sum - 1;
				System.out.print(sum+max);
			}
		}		
	}
}