import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);		
		
		String s = stdin.nextLine();
		StringTokenizer st = new StringTokenizer(s);
		
		int count = 0;
		
		while(st.hasMoreTokens()) {
			st.nextToken();
			count += 1;
		}
		
		System.out.print(count);
	}
}

// .next() : 띄어쓰기(공백) 기준으로 데이터를 입력 받는다.
// .nextLine() : 한 라인마다, 즉 enter 기준으로 데이터를 입력 받는다. 