import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		
		String s = stdin.next();
		int small[] = new int[26]; // 소문자
		int big[] = new int[26];   // 대문자
 		int max = 0;               // 많이 사용된 알파벳 위치
		int count = 0;             // max가 여러개 존재 할 경우 체크
		
		for(int i=0; i<26; i++) {  // 배열 초기화
			small[i] = 0;
			big[i] = 0;
		}
		
		for(int i=0; i<s.length(); i++) {
			if((int)s.charAt(i) > 90) { // 소문자
				small[(int)s.charAt(i) % 97] += 1;
			}
			else {  // 대문자
				big[(int)s.charAt(i) % 65] += 1;
			}
		}		
		
		for(int i=0; i<26; i++) {
			big[i] += small[i]; // 하나로 합치기
			
			if(big[i] > big[max]) {
				max = i;
			}
		}
	
		for(int i=0; i<26; i++) { // max 중복 체크
			if(big[max] == big[i]) count += 1;
		}
		
		if(count == 1) {
			System.out.print((char)(max + 65)); 
		}
		else {
			System.out.print("?"); 
		}		
	}
}