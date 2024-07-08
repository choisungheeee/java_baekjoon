import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		
		int arr[] = new int[10];
		int count = 10;  // 서로 다른 나머지 갯수 체크
		
		for(int i=0; i<arr.length; i++) {
			int n = stdin.nextInt();
			
			arr[i] = n % 42;
		}
		
		for(int i=0; i<arr.length; i++) {
			int k = 0; 
			for(int h=i+1; h<arr.length; h++) {
				if(arr[i] == arr[h]) k = 1; // 나머지가 같다면 
			}
			count -= k;
		}
		
		System.out.print(count); 
	}
}
