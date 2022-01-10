package pkg;
import java.util.Scanner;
import java.util.Random;


public class characterClass {
	String rouge;
	String wizard;
	String warrior;
	String Wizard;
	String Rogue;
	String Warrior;
	

	String Dexterity;
	String Constitution;
	String Charisma;
	String Intelligence;
	String Strength;

public  characterClass() {
	Dexterity = new String ("Dexterity");
	Constitution = new String ("Constitution");
	Charisma = new String("Charisma");
	Intelligence = new String ("Intelligence");
	Strength = new String ("Strength");

	}





public void D (){
		    Scanner sc = new Scanner(System.in);

		System.out.println("What is your name?");
 	    String name = sc.nextLine();
 	  
 	    System.out.println("");
 	    
	 	   System.out.println("Do you want to be Wizard, Warrior, or Rogue?");
 	    String ans = sc.nextLine();

 	    if (ans.equals("rogue") || (ans.equals ("Rogue")))
  	    System.out.println("You chose rogue");
  	    
  	    
  	    if (ans.equals("warrior") || (ans.equals ("Warrior")))
  	    System.out.println("You chose warrior");
  	    
  	    
  	    if (ans.equals("wizard") || (ans.equals("Wizard")))
  	    System.out.println("You chose wizard");
  	    
  	    System.out.println("");
  	    
  	     System.out.println("Okay, " + name + "  Your Characters' triats can the following:");
  		
  	// Info abt. abiliies
  	    System.out.println("Strength: Buff and able to carry larger items!   (ᕙ(⇀‸↼‶)ᕗ");
  	    System.out.println("Dexterity:  Agile and moves quick  (*ΦωΦ*)");
  	    System.out.println("Intelligence: Better at magic spells!   (⇀‸↼‶)⊃━☆ﾟ.*･｡ﾟ");
  	    System.out.println("Constitution: How much health!   ( ˘▽˘)っ♨"); 
  	    System.out.println("Charisma:  How personable!   ( ๑‾̀◡‾́)σ");
  	     System.out.println("How many points do you want for Strength?");
  	         
  	   System.out.println("How many points do you want for Strength?");
  	        int point1 = sc.nextInt();
  	           
 
  	    
  	  
  	 
  	    // Question Dexterity
  	    System.out.println("How many points do you want for dexterity?");
  	          int point2 = sc.nextInt();

  	     
  	    
  	     
  	   // Question Intelligence
  	    System.out.println("How many points do you want for intelligence?");
  	     int point3 = sc.nextInt();
  	
  	     // Question Constitution
  	      System.out.println("How many points do you want for consitution?");
  	       int point4 = sc.nextInt();
  
  	        // Question Charisma
  	      System.out.println("How many points do you want for Charisma?");
  	     int point5 = sc.nextInt();
  	 
  	      
  	    
  	    System.out.println("Congradulations, " + name + ". you just built your character!");
  	    
  	    return;
}

	
}



