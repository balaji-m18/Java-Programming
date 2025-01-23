package basics;
import java.util.*;
//Math.max(a,b) returns maximum value
//Math.min(a,b) returns minimum value
//Math.abs(a) returns absolute value
//Math.sqrt(a) returns square root value
//Math.round(a) returns round off value

public class MathClass {
	public static void main(String[] args) {
		System.out.println("Finding the hypotanuse of a triangle");
		System.out.println("Enter the base lenght of the triangle: ");
		Scanner ob1 = new Scanner(System.in);
		int bl = ob1.nextInt();
		System.out.println("Enter the height of the triangle: ");
		Scanner ob2 = new Scanner(System.in);
		int h = ob2.nextInt();
		
		int a = (bl*bl)+(h*h);
		double b = Math.sqrt(a);
		System.out.println("The Hypotanuse of the triangle is"+b);
	}

}
