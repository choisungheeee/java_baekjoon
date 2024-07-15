import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		
		byte[][] arr = new byte[9][9];
		byte max = -1;
		int r = 0, c = 0;
		
		for(int i=0; i<9; i++) {
			for(int h=0; h<9; h++) {
				arr[i][h] = stdin.nextByte();
				
				if(arr[i][h] > max) {
					max = arr[i][h];
					r = i + 1;
					c = h + 1;
				}
			}
		}
		
		System.out.println(max);
		System.out.print(r + " " + c);
	}
}