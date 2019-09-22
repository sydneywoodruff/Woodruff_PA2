import java.util.Scanner;

public class Woodruff_p1 {
	public static void main(String[] args) { 
	    Scanner in = new Scanner(System.in);

		//encrypted
		
	        System.out.println("Enter 4 integers: ");
	        
	        int user = in.nextInt();
	        
	        int num1 = user / 1000;
	        int num2 = (user % 1000) / 100;
	        int num3 = (user % 100) / 10;
	        int num4 = user % 10;
	        
	        num1 = (num1 + 7) % 10;
	        num2 = (num2 + 7) % 10;      
	        num3 = (num3 + 7) % 10;
	        num4 = (num4 + 7) % 10;
	   
	        System.out.print("Ecrypted integer: ");
	        System.out.printf("%d%d%d%d", num3, num4, num1, num2 );
	        System.out.println("");
	   
	        in.close();
	  }
	
}
