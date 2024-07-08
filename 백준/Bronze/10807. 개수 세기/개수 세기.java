import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		
		int n = stdin.nextInt();
		int arr[] = new int[n];
		int count = 0;
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = stdin.nextInt();
		}
		
		int v = stdin.nextInt();
		
		for(int i=0; i<arr.length; i++) {
			if(v == arr[i]) count += 1;
		}
		
		System.out.print(count);
	}
}
