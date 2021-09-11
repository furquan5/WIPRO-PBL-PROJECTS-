package ExceptionHandling;
import java.util.*;
public class Exception1 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter an integer");
		String strNum=s.nextLine();
		try {
			int n=Integer.parseInt(strNum);
			System.out.println("The square value is "+n*n);
			System.out.println("The work has been done successfully");
			
		}catch(Exception e) {
			System.out.println("Entered input is not a valid format for integer");
		}
	}
	
}
