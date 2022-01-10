import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		//System.out.print("I love to learn coding remotely."); 
 	    Scanner sc = new Scanner(System.in);
 	   
 	    String Wizard = new String("Wizard");
 	    String Warrior = new String ("Warrior");
 	    String Rogue = new String("Rogue");
 	    
 	    String rogue = new String ("rogue");
 	    String warrior = new String("warior");
 	    String wizard = new String ("wizard");
 	   
 	    System.out.println("Do you want to be Wizard, Warrior, or Rogue?");
 	    String ans = sc.nextLine();
 	   
  	    if (ans.equals("rogue") || (ans.equals ("Rogue")))
  	    	System.out.println("You chose rogue");
  	    
  	    
  	else    if (ans.equals("warrior") || (ans.equals ("Warrior")))
  	    System.out.println("You chose warrior");
  	    
  	    
  	 else   if (ans.equals("wizard") || (ans.equals("Wizard")))
  	    System.out.println("You chose wizard");
  	    
  	  
  	   // else {
  	    	
  	    //System.out.println("Your input was wrong");
  	    //}
  	   
  	   
  	   // if (ans.equals(Rogue == rogue))
  	   //System.out.println("You chose Rogue");
  	    //if (ans.equals("Warrior"))
  	   // System.out.println("You chose Warrior");
  	    //if (ans.equals("Wizard"))
  	    //System.out.println("You chose Wizard");
  	    
  	    
  	    //System.out.println(warrior.equals("You chose warrior!"));
  	    //System.out.println(wizard.equals("You chose wizard!"));
  	    //System.out.println(rogue.equals("You chose rogue!"));
  	   


 	    
 	   
	}
	
}
