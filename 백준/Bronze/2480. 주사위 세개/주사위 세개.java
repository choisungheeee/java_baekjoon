import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		
		int a = stdin.nextInt();
		int b = stdin.nextInt();
		int c = stdin.nextInt();
		int money = 0;
		
		if(a == b && a == c) {           // 같은 눈이 3개인 경우
			money = 10000 + a * 1000;
		}
		else if(a == b || a == c) {      // 같은 눈이 2개인 경우
			money = 1000 + a * 100;
		}
		else if(b == a || b == c) {
			money = 1000 + b * 100;
		}
		else {                           // 모두 다른 눈이 나오는 경우
			if(a > b && a > c) {
				money = a * 100;
			}
			else if(b > a && b > c) {
				money = b * 100;
			}
			else {
				money = c * 100;
			}
		}
		
		System.out.print(money);
	}
}
