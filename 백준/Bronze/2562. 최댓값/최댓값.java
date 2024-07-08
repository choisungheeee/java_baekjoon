import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		
		byte arr[] = new byte[9];
		int max = 0;
		int count = -1;
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = stdin.nextByte();
			
			if(arr[i] > max) {
				max = arr[i];
				count = i + 1;
			}
		}
		
		System.out.print(max + "\n" + count);
	}
}
