import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		
		int t = stdin.nextInt();
		String p[] = new String[t];
		
		for(int i=0; i<t; i++) {
			int r = stdin.nextInt();
			String s = stdin.next();			
			p[i] = "";
			
			for(int j=0; j<s.length(); j++) {
				for(int k=0; k<r; k++) {
					p[i] += s.charAt(j);
				}
			}
		}
		
		for(int i=0; i<p.length; i++) {
			System.out.println(p[i]);
		}
	}
}
