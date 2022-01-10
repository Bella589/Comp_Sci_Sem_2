import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		//System.out.print("I love to learn coding remotely."); 
		Random rad = new Random();
		// nextInt(6);
		int min = 0;
		int max = 9;
		System.out.println("Random value of type double between " +min+ " to " +max+ ":");  
		//nextInt(9) + nextDouble ();
	    double random = Math.random()*(max-min+0)+min; 
	   System.out.println(random);  
	   
	    int min1 = 0;
		int max2 = 100;
		System.out.println("Random value of type double between " +min1+ " to " +max2+ ":");  
	    double one = Math.random()*(max-min+2)+min; 
	   System.out.println(one);  
	
		double min3 = 2.5;
		double max4 = 3.5;
		System.out.println("Random value of type double between " +min3+ " to " +max4+ ":");  
    	 double two = Math.random()*(max-min+2.5)+min; 
	     System.out.println(two);
	  
	    //int min5 = 10;
		//int max6 = 589;
		//System.out.println("Random value of type double between " +min5+ " to " +max6+ ":");  
	   ///double three = Math.random()*(max-min+10)+min; 
	    //System.out.println(three);
	    
	    //int min7= 1;
	    //int max8= 100;
	    //2+next int=(6)+nextDouble();
	//	System.out.println("1st Random Number: " + Math.random());   
	//	System.out.println("2nd Random Number: " + Math.random());  
	//	System.out.println("3rd Random Number: " + Math.random());   
	//	System.out.println("4th Random Number: " + Math.random());   
	}
	
}
