package basics;
import java.util.Scanner;
public class UserInput {
	public static void main(String[] args) {
		System.out.println("Enter your name:");
		Scanner ob1 = new Scanner(System.in);
		String name = ob1.nextLine();
		
		System.out.println("Enter your age:");
		Scanner ob2 = new Scanner(System.in);
		int age = ob2.nextInt();
		
		System.out.println("Enter your college name:");
		Scanner ob3 = new Scanner(System.in);
		String CollegeName = ob3.nextLine();
		
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("College Name:"+CollegeName);
	}

}
