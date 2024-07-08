import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		
		int n = stdin.nextInt();
		int m = stdin.nextInt();
		int arr[] = new int[n];
		
		for(int k=0; k<arr.length; k++) {
			arr[k] = k+1;
		}
		
		for(int k=0; k<m; k++) {
			int i = stdin.nextInt();
			int j = stdin.nextInt();
			
			while(i<j) {
				int temp = arr[i-1];
				arr[i-1] = arr[j-1];
				arr[j-1] = temp;
				
				i++; j--;
			}
		}
		
		for(int k=0; k<arr.length; k++) {
			System.out.print(arr[k] + " ");
		}
	}
}
