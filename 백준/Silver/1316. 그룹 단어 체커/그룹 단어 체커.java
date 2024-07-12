import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		
		int n = stdin.nextInt();
		int count = n;
		
		for(int i=0; i<n; i++) {
			String s = stdin.next();
			char arr[] = new char[s.length()];
			int check = 0;
			
			for(int k=0; k<arr.length; k++) {
				arr[k] = s.charAt(k);
			}
			
			for(int k=0; k<arr.length; k++) {
				for(int h=k+1; h<arr.length; h++) {
					if(arr[k] == arr[h]) {
						char same = arr[k];
						
						for(int g=k; g<=h; g++) {
							if(arr[g] != same) {
								check = 1;
							}
						}
					}
				}
			}
			if(check == 1) count -= 1;
		}
		
		System.out.print(count);
		
	}
}