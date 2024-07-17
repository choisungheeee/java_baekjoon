import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);		
		
		int x = stdin.nextInt();
		int y = stdin.nextInt();
		int w = stdin.nextInt() - x;
		int h = stdin.nextInt() - y;
		
		System.out.print(Math.min(Math.min(x, y), Math.min(w, h)));	
	}
}