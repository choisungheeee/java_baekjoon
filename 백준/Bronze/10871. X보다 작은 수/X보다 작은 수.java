import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		
		int n = stdin.nextInt();
		int x = stdin.nextInt();
		int arr[] = new int[n];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = stdin.nextInt();
		}
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] < x) {
				System.out.print(arr[i] + " ");
			}
		}
	}
}
