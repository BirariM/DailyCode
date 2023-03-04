package ds;
import java.util.*;
public class GetInputFromUser {
	
	public static void main(String[] args) {
		
		int a;
		float b;
		String s;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String");
		s = sc.nextLine();
		System.out.println("you entered String"+s);
		System.out.println("Enter float");
		b = sc.nextFloat();
		System.out.println("you entered float"+b);
		System.out.println("Enter int");
		a = sc.nextInt();
		System.out.println("you entered Integer"+a);
	}
}
