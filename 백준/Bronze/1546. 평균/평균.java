import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		
		int n = stdin.nextInt();
		double arr[] = new double[n];
		double max = 0; // 최댓값
		double sum = 0; // 점수합
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = stdin.nextDouble();
			sum += arr[i];
			
			if(arr[i] > max) max = arr[i];			
		}
				
		System.out.print(sum/max*100/n);
	}
}
