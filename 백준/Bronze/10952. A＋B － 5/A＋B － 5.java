import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);

		while(true) {
			int a = stdin.nextInt();
			int b = stdin.nextInt();
			
			if(a==0 && b==0) break;
			
			System.out.println(a+b);
		}
	}
}
