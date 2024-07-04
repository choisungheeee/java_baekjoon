import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		
		int h = stdin.nextInt(); // 시
		int m = stdin.nextInt(); // 분
		
		if(m < 45) {
			if(h == 0) {
				h = 23;
			}
			else {
				h -= 1;
			}			
			m = m + 60 - 45;
		}
		else {
			m -= 45;
		}
		
		System.out.print(h + " " + m);
	}
}
