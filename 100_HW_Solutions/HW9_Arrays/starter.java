import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	    Random rand = new Random();
	    
	   int x [] = new int [20];

    int count = 0; 


	while(count < 20)  {	
		count=count+1;

		x [count]=5;
		

			System.out.print("Your numbers are ");
			System.out.println(x[count] + ",");
			System.out.println(x[count-1]);
			
	 }
	 
	 

	
}
}
