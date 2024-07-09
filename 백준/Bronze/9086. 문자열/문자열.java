import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);

		int t = stdin.nextInt();
		String arr[] = new String[t];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = stdin.next();
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i].substring(0, 1)); // 첫 글자			
			System.out.println(arr[i].substring(arr[i].length()-1)); // 마지막 글자			
		}
	}
}
