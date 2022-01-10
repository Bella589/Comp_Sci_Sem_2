import java.util.Scanner;
import java.util.Random;

public class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
	
 	Scanner sc = new Scanner(System.in);	

	
	// strings y/Y and n/N nd Yes/yes and no/No
	String Yes = new String ("Yes");
	String No =  new String ("No");
	String yes = new String ("Yes");
	String no = new String ("No");
	String y = new String ("y");
	String Y = new String ("Y");
	String N = new String ("N");
	String n = new String ("n");


	
	
	System.out.println("Slot Machine Rules");
	System.out.println("1.  Each player startes with $100");
	System.out.println("2.  Input a cager less than your total amount of money");
	System.out.println("3.  The slot machine will pull 3 numbers from 1 to 10");
	System.out.println("   a. If two numbers mach, you doule your money");
	System.out.println("   b. If three numbers mach, you triple your money");
	System.out.println("   c. If nome match, you lose your money");
	System.out.println("  -------------------------------------------------- ");

    System.out.println("Would you like to play the slots? (Yes/yes/y/y)");
    String ans = sc.nextLine();
    
    if (ans.equals("Y") || (ans.equals("y"))) {
		System.out.println("You have $100, How much would you like to wager? ");
			int	money = sc.nextInt();

 int min = 0; 
 int max = 9;
    for (int i = 0; i < 25; i++) {
        System.out.println();
        

	}

	
/*
	int min = 0;
	int max = 9;
	int random = (Math.random()*(max-min+0)+min); 
	System.out.println("  -------------------------------------------------- ");

	   System.out.println(random + "  |  " + random + "  |  " + random);  
	  
	   	System.out.println("  -------------------------------------------------- ");
	   	||||||
	   	
	   	int max = 9;  

int a = ((Math.random()*(max-min+1)+min ));  
System.out.println(a + " | " );  

int b = ((Math.random()*(max-min+1)+min ));  
System.out.println(b + " | ");  
int c = ((Math.random()*(max-min+1)+min ));  
System.out.println(c + " | ");  

*/




	   
	}
	
}
}


