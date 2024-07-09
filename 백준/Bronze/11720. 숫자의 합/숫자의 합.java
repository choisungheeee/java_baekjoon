import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		
		int n = stdin.nextInt();
		String s = stdin.next();
		int sum = 0;
		
		for(int i=0; i<n; i++) {
			sum += Integer.parseInt(s.substring(i, i+1));
		}
		
		System.out.print(sum);
	}
}
