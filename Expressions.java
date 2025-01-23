package basics;
import java.util.Scanner;
public class Expressions {
	public static void main(String[] args) {
		System.out.println("Enter the first number:");
		Scanner ob1 = new Scanner(System.in);
		int x = ob1.nextInt();
		
		System.out.println("Enter the secound number:");
		Scanner ob2 = new Scanner(System.in);
		int y = ob2.nextInt();
		
		//Addition
		int z = x+y;
		System.out.println("Addition:"+z);
		
		//Subtraction
		int a = x-y;
		System.out.println("Subtaction:"+a);
		
		//Multiplication
		int b = x*y;
		System.out.println("Multiplication:"+b);
		
		//Division
		int c = x/y;
		System.out.println("Division:"+c);
		
		//Modulus
		int d = x%y;
		System.out.println("Modulus:"+d);
		
		
		
	}

}
