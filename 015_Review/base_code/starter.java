import java.util.Scanner;
import java.util.Random;

	class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
	//	System.out.print("I love to learn coding remotely.");
	    Scanner sc = new Scanner(System.in);
 	   
 	     // Character
 	  
 	    String Wizard = new String("Wizard");
 	    String Warrior = new String ("Warrior");
 	    String Rogue = new String("Rogue");
 	    
 	    String rogue = new String ("rogue");
 	    String warrior = new String("warior");
 	    String wizard = new String ("wizard");
 	   
 	   // Ability 
 	   
 	    String Strength = new String("Strength");
 	    String Dexterity = new String ("Dexterity");
 	    String Intelligence = new String ("Intelligence");
 	    String Constitution = new String ("Constitution");
 	    String Charisma = new String ("Charisma");
 	  
 	  // points 
 	       int points = 25;
 	       

 	 
 	 //Question one  ; NAME
 	    System.out.println("What is your name?");
 	    String name = sc.nextLine();
 	   
 	   // Queston two: CHARACTER
 	   System.out.println("Do you want to be Wizard, Warrior, or Rogue?");
 	    String ans = sc.nextLine();
 	   
 	    if (ans.equals("rogue") || (ans.equals ("Rogue")))
  	    System.out.println("You chose rogue");
  	    
  	    
  	    if (ans.equals("warrior") || (ans.equals ("Warrior")))
  	    System.out.println("You chose warrior");
  	    
  	    
  	    if (ans.equals("wizard") || (ans.equals("Wizard")))
  	    System.out.println("You chose wizard");
  	    
  // Hello name
  	    System.out.println("Okay, " + name + "  Your Characters' triats can the following:");
  		
  	// Info abt. abiliies
  	    System.out.println("Strength: Buff and able to carry larger items    (ᕙ(⇀‸↼‶)ᕗ");
  	    System.out.println("Dexterity:  Agile and moves quick   (*ΦωΦ*)");
  	    System.out.println("Intelligence: Better at magic spells!   (⇀‸↼‶)⊃━☆ﾟ.*･｡ﾟ");
  	    System.out.println("Constitution: How much health    ( ˘▽˘)っ♨"); 
  	    System.out.println("Charisma:  How personable   ( ๑‾̀◡‾́)σ");
  	 
  	 // Intructions
  	    System.out.println("For your triaits, you have a max of 10 pionts each. WITH ONLY 25 POINTS TO SPEND!");
  	  
  	  // Question Strength  
  	    System.out.println("How many points do you want for Strength?");
  	            int point1 = sc.nextInt();
  	            int point11 = points - point1;
  	    System.out.println("Your points are now " + point11);
  	    
  	    if (point1 > points){
  	    System.out.println("Points exceeded limit please emter again");
  	     System.out.println("How many points do you want for Strength?");
  	       
  	       int pointi = sc.nextInt();
  	       int pointii = points-point1;
  	     System.out.println("Your points are now " + pointii);
  	  
  	    }
  	  
  	    // Question Dexterity
  	    System.out.println("How many points do you want for dexterity?");
  	          int point2 = sc.nextInt();
  	          int point22 = point11-point2;
  	     System.out.println("Your points are now " + point22);
  	    
  	     //if 
  	      if (point22 > point11){
  	      	
  	    System.out.println("Points exceeded limit please emter again");
  	     System.out.println("How many points do you want for dexterity?");
  	        int pointj = sc.nextInt();
  	       int pointjj = pointj-point11;
  	     System.out.println("Your points are now " + pointjj);
  	     
  	    }
  	     
  	   // Question Intelligence
  	    System.out.println("How many points do you want for intelligence?");
  	     int point3 = sc.nextInt();
  	     int point33= point22-point3;
  	     System.out.println("Your points are now" + point33);

  	      //if
  	      if (point3 > point2){
  	    System.out.println("Points exceeded limit please emter again");
  	     System.out.println("How many points do you want for consitution?");
  	        int pointy = sc.nextInt();
  	       int pointyy = point3-pointy;
  	     System.out.println("Your points are now " + pointyy);
  	    }
  	     
  	     // Question Constitution
  	      System.out.println("How many points do you want for consitution?");
  	       int point4 = sc.nextInt();
  	       int point44 = point33-point4;
  	     System.out.println("Your points are now " + point44);
  	      //if
  	      if (point44 > point3){
  	    System.out.println("Points exceeded limit please emter again");
  	     System.out.println("How many points do you want for consitution?");
  	       int pointr = sc.nextInt();
  	       int pointrr = point4-pointr;
  	     System.out.println("Your points are now " + pointrr);
  	    
  	    }
  	      
  	        // Question Charisma
  	      System.out.println("How many points do you want for Charisma?");
  	     int point5 = sc.nextInt();
  	     int point55 = point44 - point5;
  	     System.out.println("Your points are now " + point55);
  	    
  	    //if
  	       if (point55 > point4){
  	    System.out.println("Points exceeded limit please emter again");
  	     System.out.println("How many points do you want for charisma?");
  	       
  	       int pointe = sc.nextInt();
  	       int pointee = point5- pointe;
  	     System.out.println("Your points are now " + pointee);
  	       	
  	       }
  	    
  	    System.out.println("Congradulations, " + name + ". you just built your character!");
  	    
  	    
	}
  	     
  	     
  	     
  	     
  	     
  	    

  	    
  	    
  	    
  	    
  	    
	
	
	}

