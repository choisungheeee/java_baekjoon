import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);

		char c = stdin.next().charAt(0);
		
		System.out.print((int)c);
	}
}

// 자바는 char형을 통해 바로 입력받는 방법이 없다. 
// 따라서 String으로 입력 받은 후 charAt(0)을 사용해서 char형으로 바꿔줘야 한다.