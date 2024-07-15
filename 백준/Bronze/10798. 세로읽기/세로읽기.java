import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		
		char[][] arr = new char[5][15];
		int max = -1;
		
		for(int i=0; i<arr.length; i++) {
			String s = stdin.next();
			
			if(s.length() > max) max = s.length();
			
			for(int k=0; k<s.length(); k++) {
				arr[i][k] = s.charAt(k);
			}
		}
		
		for(int i=0; i<max; i++) {
			for(int k=0; k<arr.length; k++) {
				if(arr[k][i] == '\0') continue;
				
				System.out.print(arr[k][i]);
			}
		}
	}
}