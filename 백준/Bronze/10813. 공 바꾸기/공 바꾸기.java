import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);

		int n = stdin.nextInt();
		int m = stdin.nextInt();
		int arr[] = new int[n];  // n 개의 바구니 갯수
		
		for(int h=0; h<arr.length; h++) {
			arr[h] = h+1;
		}
		
		for(int h=0; h<m; h++) {
			int i = stdin.nextInt();
			int j = stdin.nextInt();
			
			int temp = arr[i-1];
			arr[i-1] = arr[j-1];
			arr[j-1] = temp;
		}
		
		for(int h=0; h<arr.length; h++) {
			System.out.print(arr[h] + " ");
		}
	}
}
