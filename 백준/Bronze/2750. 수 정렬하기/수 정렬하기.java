import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);		
		
		int n = stdin.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = stdin.nextInt();
		}
		
		for(int i=0; i<n; i++) {
			for(int k=i+1; k<n; k++) {
				if(arr[i] > arr[k]) {
					int temp = arr[i];
					arr[i] = arr[k];
					arr[k] = temp;
				}
			}
		}
		
		for(int i=0; i<n; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}