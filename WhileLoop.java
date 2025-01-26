package basics;
import java.util.*;
public class WhileLoop {
	public static void main(String[] args) {
		System.out.println("Enter the number:");
		Scanner ob1 = new Scanner(System.in);
		int num = ob1.nextInt();
		int c;
		int sum = 0;
		while(num>0) {
			c = num%10;
			sum += c;
			num/=10;
		}
		System.out.println(sum);
	}

}
