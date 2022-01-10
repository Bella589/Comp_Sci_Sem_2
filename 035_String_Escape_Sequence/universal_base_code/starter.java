import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
			    Scanner sc = new Scanner(System.in);

		
	String yes = "yes";
	String Yes = "yes";
	String no= "no";
	String No = "No";
	
	System.out.println("wHy hElLo tHerE");
	System.out.println("Would you like to tal with me");
	String ans = sc.nextLine();
	
	if(ans.equals("yes")||(ans.equals("Yes"))){
		System.out.println("Yay");
		System.out.println("Say somtheing sassy ma dude");
		String sas1 = sc.nextLine();
		System.out.println("Wow, I'm impressed"+ " '" + sas1 + "'" + " You are very sassy, shoud make that a carrer you know");
		System.out.println("Tell me, what's your name?");
		String name = sc.nextLine();
		System.out.println("Ah, nice name, nice name,\n whats my name you ask? \n it's Bella, \n nice to meet you.");
		System.out.println("So tell me about your self,");
		String abt = sc.nextLine();
	}
	
	if(ans.equals("no")||(ans.equals("No")))
	{
		System.out.println("NOH!?");
		System.out.println("Well, imma talk to you anyways man");
		System.out.println("Say somthing sassy");
		String sas2 = sc.nextLine();
		System.out.println("\t eheeheh "+ " '" + sas2 + "'" + " very funny love");
	}
	
	

		
	}
}
