import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);		
		
		int[] angle = new int[3];
		int sum = 0;
		
		for(int i=0; i<angle.length; i++) {
			angle[i] = stdin.nextInt();
			
			sum += angle[i];
		}
		
		if(sum == 180) {
			if(angle[0] == angle[1] && angle[0] == angle[2]) {
				System.out.print("Equilateral");
			}
			else if(angle[0] == angle[1] || angle[0] == angle[2] || angle[1] == angle[2]) {
				System.out.print("Isosceles");
			}
			else {
				System.out.print("Scalene");
			}
		}
		else {
			System.out.print("Error");
		}
	}
}