import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		
		int chess[] = {1, 1, 2, 2, 2, 8};
		int arr[] = new int[6];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = stdin.nextInt();
			
			chess[i] -= arr[i];
		}
		
		for(int i=0; i<chess.length; i++) {
			System.out.print(chess[i] + " ");
		}		
	}
}