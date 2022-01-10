import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// Your code goes below here

     //int counter = 0
     //while (true);{
     	//System.out.print("");
     	
	// Scanner / system
	Scanner sc = new Scanner(System.in);
			int number = (int)(Math.random() * 1001);
	Scanner input = new Scanner(System.in);
				System.out.println("Guess a magic number between 0 and 1000");
	
	//Guess int
		int guess = -1;
			while (guess != number) {
 
 // statement
		System.out.print("\nEnter your guess: ");
			guess = input.nextInt();
	
		// if staements
	if (guess == number)
		System.out.println("Yes, the number is " + number);

	else if (guess > number)
		System.out.println("Your guess is too high");
		 
	 else
		System.out.println("Your guess is too low");
 } 
 }
}
     
     


		
	

