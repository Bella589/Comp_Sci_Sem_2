import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here

	character mycharacter = new character();
	roles myroles = new roles();
 	
   Scanner sc = new Scanner(System.in);


		 System.out.println("What is your name?");
		 String name = sc.nextLine();
  System.out.println("Okay, " + name + " do you want to be Wizard, Warrior, or Rogue?");
     String ans = sc.nextLine();
 	   
  if(ans.equals("Warrior")|| ans.equals("warrior")){ 
  System.out.println("You chose Warrior" );
  }
     if (ans.equals("rogue") || (ans.equals ("Rogue"))){
  	    System.out.println("You chose Rouge");
     }
     if (ans.equals("wizard") || (ans.equals("Wizard"))){
  	    System.out.println("You chose Wizard");
}
	 else{
	 	System.out.println("You chose no roles");
	 }


		
	}
}
