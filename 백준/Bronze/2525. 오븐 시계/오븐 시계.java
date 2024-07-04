import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		
		int h = stdin.nextInt(); // 시
		int m = stdin.nextInt(); // 분
		int time = stdin.nextInt(); // 소요 시간
		
		m += time;
		
		if(m >= 60) {
			h += m/60;
			m %= 60;
			
			if(h >= 24) {
				h -= 24;
			}
		}
		
		System.out.print(h + " " + m);
	}
}
