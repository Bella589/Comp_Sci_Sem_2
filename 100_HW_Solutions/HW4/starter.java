import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
	
	Random rand = new Random();
 	Scanner sc = new Scanner(System.in);
 	
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
	System.out.println("3.  The slot machine will poll 3 numbers from 1 to 10");
	System.out.println("   a. If two numbers mach, you double your money");
	System.out.println("   b. If three numbers mach, you triple your money");
	System.out.println("   c. If none match, you lose your money");
	System.out.println("  -------------------------------------------------- ");

    System.out.println("Would you like to play the slots? (Yes/yes/y/y)");
	String ans = sc.nextLine();
	System.out.print(ans);
	
	if (ans.equals("Y") || (ans.equals("y"))) {
		int total = 100;
	
		while ( total != 0) {
			
			if (total==0){
 	while (true){
 		break;
 	}
 }
			
			
	System.out.println(" ");
	System.out.println(" How much would you like to wager?");
	int wager = sc.nextInt();
	
	
	/*int min1 = 0;
	int max1 = 9;
    int random1 = (int)Math.random()*(max1-min1+9)+max1; 
	  */
	  int random1 = rand.nextInt(9);
	   System.out.print(random1+ " | ");  
	   
	  /* int min2 = 0;
		int max2 = 9;
    int random2 =(int) Math.random()*(max2-min2+9)+max2; 
	   */
	   int random2 = rand.nextInt(9);
	   System.out.print(random2 +  " | ");  
	  
	   /*	int min3 = 0;
		int max3 = 9;
int random3 = (int)Math.random()*(max3-min3+9)+max3; 
	*/
	int random3 = rand.nextInt(9);
	 System.out.println(random3 );  
	
	if ((random1==random2)&&(random1==random3)){
		System.out.print( "You now have " + wager*3);
	}
	else	if ((random1== random2) ||( random1==random3) || (random2==random3)){
			System.out.print("You now have " + wager*2);
		}
		 
	
		else {
		 	System.out.print("You now have " + (total-wager));
		 	

		 

			}
		}
			if (ans.equals("N")||ans.equals("n")){
			while(true){
			System.out.print("Smh");
				break;
			}

	}
	

	
	}
		}
}



	
	
	
	



