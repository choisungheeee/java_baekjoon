import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		
		int n = stdin.nextInt();
		int arr[] = new int[n];
		
		for(int i=0; i<n; i++) {
			int a = stdin.nextInt();
			int b = stdin.nextInt();
			
			arr[i] = a+b;
		}
		
		for(int i=1; i<=n; i++) {
			System.out.println("Case #" + i + ": " + arr[i-1]);
		}
	}
}
