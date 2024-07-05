import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = br.readLine();
		int n = Integer.parseInt(s);
		
		for(int i=0; i<n; i++) {
			String s1 = br.readLine();			
			StringTokenizer st = new StringTokenizer(s1);
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			bw.write(String.valueOf(a+b) + "\n");
		}
		
		bw.close();
	}
}
