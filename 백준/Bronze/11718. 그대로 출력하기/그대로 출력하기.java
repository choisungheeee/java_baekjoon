import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		
		while(stdin.hasNext()) {
			String s = stdin.nextLine(); // 공백을 포함한 문자열도 그대로 출력해야 하기 때문에
			
			System.out.println(s);
		}
	}
}