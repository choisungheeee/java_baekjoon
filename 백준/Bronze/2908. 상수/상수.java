import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);		
		
		String s[] = new String[2]; // 문자로 받아서
		int n[] = new int[2];       // 숫자로 변환해주기
		
		for(int i=0; i<s.length; i++) {
			s[i] = stdin.next();
			
			n[i] = Character.getNumericValue(s[i].charAt(2)) * 100;
			n[i] += Character.getNumericValue(s[i].charAt(1)) * 10;
			n[i] += Character.getNumericValue(s[i].charAt(0));
			
			/* 
			아스키코드를 이용하여 문자 0을 빼주면 원하는 숫자를 얻을 수 있다.
			n[i] = (s[i].charAt(2) - '0') * 100;
			n[i] += (s[i].charAt(1) - '0') * 10;
			n[i] += s[i].charAt(0) - '0';
			*/
		}		
		
		System.out.print((n[0] > n[1]) ? n[0] : n[1]);		
	}
}