import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		//System.out.print("I love to learn coding remotely."); 
	   
		Scanner sc = new Scanner(System.in);	
		System.out.println("Press enter once you type in your answer");
		System.out.println("What is your name?");
	   	String name = sc.nextLine();
		System.out.println("What is your age?");
		int age = sc.nextInt();
        System.out.println("What month were you born (1-12)");
		int month = sc.nextInt();
		System.out.println("What day of the month were you born? (1-31)");
		int day = sc.nextInt();
		System.out.println("What year were you born");
		int year = sc.nextInt();
		//int year= 2005;
		System.out.println("If I have a dollar and two quarters, how much money do I have? (0.0-#)");
		double money = sc.nextDouble();	
		//double money= 1.5;
		//int money= 1;
		
		System.out.print("Hello, your name is ");
		System.out.println(name);
		System.out.print("Your were born on ");
		System.out.print(month);
		System.out.print("/");
		System.out.print(day);
		System.out.print("/");
		System.out.println(year);
		System.out.print("You are ");
		System.out.print(age);
		System.out.println(" years old");
		System.out.print("You have ");
		System.out.print(money);
		System.out.println(" in your wallet");
		
		

	}
	
	
	
}
