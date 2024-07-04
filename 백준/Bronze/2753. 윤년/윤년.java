import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		
		int y = stdin.nextInt();
		
		if((y%4 == 0 && y%100 != 0) || y%400 ==0) {
			System.out.print(1);
		}
		else {
			System.out.print(0);
		}
		
	}
}
