import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		
		String s = stdin.next();
		int palin = 1;
		
		for(int i=0; i<s.length()/2; i++) {
			if(s.charAt(i) != s.charAt(s.length()-i-1)) {
				palin = 0;
			}
		}
		
		System.out.print(palin);
	}
}