package pkg;
import java.util.Scanner;
import java.util.Random;


public class BaseClass {
	String Strength;
	
	String Dexterity;
	String rouge;
	String Constitution;
	String Charisma;
	String Intelligence;

	public BaseClass() {

	Strength = new String ("Strength");
	Dexterity = new String ("Dexterity");
	Intelligence = new String ("Intelligence");
	Constitution = new String ("Constitution");
	Charisma = new String("Charisma");
		
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
  	    System.out.println("Strength: Buff and able to carry larger items! : 0   (ᕙ(⇀‸↼‶)ᕗ");
  	    System.out.println("Dexterity:  Agile and moves quick  : 0 (*ΦωΦ*)");
  	    System.out.println("Intelligence: Better at magic spells! : 0   (⇀‸↼‶)⊃━☆ﾟ.*･｡ﾟ");
  	    System.out.println("Constitution: How much health! : 0   ( ˘▽˘)っ♨"); 
  	    System.out.println("Charisma:  How personable! : 0   ( ๑‾̀◡‾́)σ");
}

	
}


