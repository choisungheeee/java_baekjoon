import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
				
		while(true) {
			int n1 = stdin.nextInt();
			int n2 = stdin.nextInt();
			
			if(n1 == 0 && n2 == 0) return;
			
			if(n2 % n1 == 0) System.out.println("factor");
			else if(n1 % n2 ==0) System.out.println("multiple");
			else System.out.println("neither");
		}
	}
}