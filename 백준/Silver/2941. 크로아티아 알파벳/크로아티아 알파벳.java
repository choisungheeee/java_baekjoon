import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		
		String s = stdin.nextLine();
		String a = "";
		int count = 0; // 크로아티아 단어 갯수 
		int i = 0;
		
		while(i < s.length()) {
			char c = s.charAt(i);
			
			switch(c) {
			case 'c': case 'l': case 'n': case 's': case 'z':
				if(i+2 <= s.length()) 
					a = s.substring(i, i+2);
				
				switch(a) {
				case "c=": case "c-": case "lj": case "nj": case "s=": case "z=":
					i += 2;					
					break;
					
				default:
					i += 1;
					break;
				}
				count += 1;
				break;
				
				
			case 'd': 
				if(i+2 <= s.length()) 
					a = s.substring(i, i+2);
				
				switch(a) {
				case "d-":
					i += 2;					
					break;
					
				default:
					if(i+3 <= s.length()) 
					 a = s.substring(i, i+3);
					
					switch(a) {
					case "dz=": 
						i += 3;
						break;
						
					default:
						i += 1;
						break;
					}	
					break;
				}
				count += 1;	
				break;						
				
				
			default:
				i += 1;
				count += 1;
				break;
			}
		}
		
		System.out.print(count);
		
	}
}

// == 연산자 : 객체의 주소 비교
// equals() 메서드 : 객제의 내용 비교