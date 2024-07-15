import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		
		int n = stdin.nextInt();
		int m = stdin.nextInt();
		
		short[][] a = new short[n][m];
		short[][] b = new short[n][m];
		short[][] sum = new short[n][m];
		
		for(int i=0; i<n; i++) {
			for(int k=0; k<m; k++) {
				a[i][k] = stdin.nextShort();
			}
		}
		
		for(int i=0; i<n; i++) {
			for(int k=0; k<m; k++) {
				b[i][k] = stdin.nextShort();
			}
		}
		
		for(int i=0; i<n; i++) {
			for(int k=0; k<m; k++) {
				sum[i][k] = (short) (a[i][k] + b[i][k]);
				
				System.out.print(sum[i][k] + " ");
			}
			System.out.println();
		}
	}
}