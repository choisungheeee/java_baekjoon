import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		
		int n = stdin.nextInt();
		
		for(int i=1; i<=n; i++) {
			for(int k=n; k>i; k--) {
				System.out.print(" ");
			}
			for(int h=1; h<=i; h++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
