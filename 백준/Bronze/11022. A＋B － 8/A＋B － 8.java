import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		
		int n = stdin.nextInt();
		String arr[] = new String[n];
		
		for(int i=0; i<n; i++) {
			int a = stdin.nextInt();
			int b = stdin.nextInt();
			
			arr[i] = "Case #" + (i+1) + ": " + a + " + " + b + " = " + (a+b);
		}
		
		for(int i=0; i<n; i++) {
			System.out.println(arr[i]);
		}
	}
}
