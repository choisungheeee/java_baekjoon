import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);		
		
		int n = stdin.nextInt();
		int[] x = new int[n];
		int[] y = new int[n];
		int x_max = -10000, y_max = -10000;
		int x_min = 10000, y_min = 10000;
		
		for(int i=0; i<n; i++) {
			x[i] = stdin.nextInt();
			y[i] = stdin.nextInt();
			
			if(x[i] > x_max) x_max = x[i];
			if(x[i] < x_min) x_min = x[i];
			
			if(y[i] > y_max) y_max = y[i];
			if(y[i] < y_min) y_min = y[i];
		}
		
		System.out.print((x_max-x_min) * (y_max-y_min));
	}
}