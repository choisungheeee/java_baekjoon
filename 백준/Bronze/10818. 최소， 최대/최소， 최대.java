import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		
		int n = stdin.nextInt();
		int arr[] = new int[n];
		int max = -1000000;
		int min = 1000000;
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = stdin.nextInt();
			
			if(arr[i] > max) max = arr[i];
			if(arr[i] < min) min = arr[i];
		}
		
		System.out.print(min + " " + max);	
	}
}
