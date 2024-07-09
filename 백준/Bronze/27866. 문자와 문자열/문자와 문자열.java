import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		
		String s = stdin.next();
		int n = stdin.nextInt();
		
		System.out.print(s.substring(n-1, n));
	}
}
