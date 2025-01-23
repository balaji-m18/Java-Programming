package basics;
import java.util.*;
public class SwitchCase {
	public static void main(String[] args) {
		System.out.println("Enter the day:");
		Scanner ob1 = new Scanner(System.in);
		String day = ob1.nextLine();
		
		switch(day){
		case"Monday": System.out.println("It is Monday");
		break;
		case"Tuesday": System.out.println("It is Tuesday");
		break;
		case"Wenesday": System.out.println("It is Wenesday");
		break;
		case"Thursday": System.out.println("It is Thursday");
		break;
		case"Friday": System.out.println("It is Friday");
		break;
		case"Saturday": System.out.println("It is Saturday");
		break;
		case"Sunday": System.out.println("It is Sunday");
		break;
		default: System.out.println("Invalid Input");
		}
	}

}
