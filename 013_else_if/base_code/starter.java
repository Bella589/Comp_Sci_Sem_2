import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
	//	System.out.print("I love to learn coding remotely."); 
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		//System.out.print("I love to learn coding remotely."); 
		Scanner sc = new Scanner(System.in);
	
		String yes = new String("yes");
		String Yes = new String("Yes");
		String no = new String("no");
		String No = new String("No");
	
		System.out.println("Is it raining out?");
		String ans = sc.nextLine();
	 
	   
	   
		if(ans.equals ("yes") || (ans.equals("Yes"))) {
	
		
		System.out.println("Bring an Umbella");
			
		}
 	    else if (ans.equals("no") || (ans.equals ("No"))){
		
		System.out.println("Bring sunscreen");
 	    }
 	    
 	    else {
 	    	System.out.println("error");
 	    }
		
		}
		

	}


}
