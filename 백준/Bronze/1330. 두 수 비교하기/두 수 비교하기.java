import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int a, b;        
        a = stdin.nextInt(); 
        b = stdin.nextInt();
        if(a > b) { 
            System.out.println(">"); 
        }
        else if(a < b) { 
            System.out.println("<"); 
        }
        else { 
            System.out.println("==");
        }
        stdin.close();
    }
}
