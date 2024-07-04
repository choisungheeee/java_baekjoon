import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		
		int a = stdin.nextInt();
		int b = stdin.nextInt();
		int c[] = new int[3];
		int result = a*b;
		
		for(int i=0; b != 0; i++) {
			c[i] = b % 10;
			b /= 10;
			
			System.out.println(a*c[i]);
		}		
		
		System.out.print(result);		
	}
}
