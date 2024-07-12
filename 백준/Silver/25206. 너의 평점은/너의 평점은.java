import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		
		double credit[] = new double[20];
		double grade[] = new double[20];
		double average = 0;
		double sum = 0;
		
		for(int i=0; i<20; i++) {
			String s = stdin.nextLine();
			StringTokenizer st = new StringTokenizer(s);
			
			st.nextToken();
			
			credit[i] = Double.parseDouble(st.nextToken());
			
			switch(st.nextToken()) {
			case "A+": 
				grade[i] = 4.5;
				break;
				
			case "A0":
				grade[i] = 4.0;
				break;
				
			case "B+": 
				grade[i] = 3.5;
				break;
				
			case "B0":
				grade[i] = 3.0;
				break;
				
			case "C+":
				grade[i] = 2.5;
				break;
				
			case "C0":
				grade[i] = 2.0;
				break;
				
			case "D+": 
				grade[i] = 1.5;
				break;
				
			case "D0": 
				grade[i] = 1.0;
				break;
				
			case "F": 
				grade[i] = 0.0;
				break;
			
			case "P":
				credit[i] = 0;
				break;
			}
			
			sum += credit[i];
			average += credit[i] * grade[i];
		}
		
		average /= sum;
		
		System.out.print(average);
	}
}