package basics;
import java.util.*;
public class ifStatements {
	public static void main(String[] args) {
		System.out.println("Enter the no of units used:");
		Scanner ob1 = new Scanner(System.in);
		double units = ob1.nextDouble();
		double rate;
		
		if(units>=0 && units<=100) {
			rate = units*1.50;
			System.out.println("Rate:"+rate);
		}
		else if(units>=101 && units<=200) {
			rate = (units-100)*2.00 + 150;
			System.out.println("Rate:"+rate);
		}
		else if(units>=201) {
			rate = (units-200)*3.00 + 350;
			System.out.println("Rate:"+rate);
		}
		else {
			System.out.println("invalid Input");
		}
	}

}
