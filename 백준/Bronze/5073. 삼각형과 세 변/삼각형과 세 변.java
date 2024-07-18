import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);		
		
		int[] t = new int[3];		
		
		while(true) {
			int max = -1;
			int sum = 0;
			
			for(int i=0; i<t.length; i++) {
				t[i] = stdin.nextInt();
				sum += t[i];
				
				if(t[i] > max) max = t[i];				
			}
			
			sum -= max;
			
			if(t[0] == 0 && t[1] == 0 && t[2] == 0) return;	// 0 0 0이면 종료		
			
			if(t[0] == t[1] && t[0] == t[2]) {
				System.out.println("Equilateral");
			}			
			else if(sum > max) {				
				if(t[0] == t[1] || t[0] == t[2] || t[1] == t[2]) {
					System.out.println("Isosceles");
				}
				else {
					System.out.println("Scalene");
				}
			}
			else {
				System.out.println("Invalid");  // 세 변의 길이가 삼각형의 조건을 만족하지 못하는 경우
			}			
		}
	}
}