import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		
		int n = stdin.nextInt();
		
		for(int i=0; i<n; i++) {
			for(int k=n-1; k>i; k--) {
				System.out.print(" ");
			}
			for(int h=0; h<i*2+1; h++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=0; i<n-1; i++) {
			for(int k=0; k<=i; k++) {
				System.out.print(" ");
			}
			for(int h=(n-1)*2; h>i*2+1; h--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}