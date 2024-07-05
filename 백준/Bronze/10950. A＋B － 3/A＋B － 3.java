import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		
		int n = stdin.nextInt();

		for(int i=0; i<n; i++) {
			int a = stdin.nextInt();
			int b = stdin.nextInt();
			
			System.out.println(a+b);
		}
	}
}
