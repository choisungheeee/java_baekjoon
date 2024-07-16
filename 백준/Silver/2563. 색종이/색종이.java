import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		
		int[][] arr = new int[100][100];
		int n = stdin.nextInt();
		int area = 0;
				
		for(int i=0; i<n; i++) {
			int r = stdin.nextInt();
			int c = stdin.nextInt();
			
			for(int k=r; k<r+10; k++) {
				for(int h=c; h<c+10; h++) {
					arr[k][h] = 1;
				}
			}
		}	
		
		for(int i=0; i<arr.length; i++) {
			for(int k=0; k<arr[i].length; k++) {
				area += arr[i][k];
			}
		}
		
		System.out.print(area);
	}
}