import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		
		int arr[] = new int[26];
		String s = stdin.next();		
		
		for(int i=0; i<arr.length; i++) { // a~z 위치 -1로 초기화
			arr[i] = -1;
		}
		
		for(int i=0; i<s.length(); i++) {
			
			int n = (int)s.charAt(i) % 97; // a는 97이므로 
			
			if(arr[n] == -1) arr[n] = i;   // 중복됐을 때 처음 등장하는 위치로 고정
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
