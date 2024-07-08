import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		
		int arr[] = new int[30];
		
		for(int i=1; i<=arr.length; i++) {
			arr[i-1] = i;
		}
		
		for(int i=0; i<28; i++) {
			int n = stdin.nextInt();
			
			for(int k=0; k<arr.length; k++) {
				if(n == arr[k]) arr[k] = -1;
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] != -1) System.out.println(arr[i]);
		}
	}
}
