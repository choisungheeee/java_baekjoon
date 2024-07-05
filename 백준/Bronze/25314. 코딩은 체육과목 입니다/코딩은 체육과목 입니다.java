import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		
		int n = stdin.nextInt();
		
		for(int i=0; i<n/4; i++) {
			System.out.print("long ");
		}
		
		System.out.print("int");
	}
}
