import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	   
	    Random rand = new Random();
	 
	   int x [] = new int [20];
	  
	 int count = 0; 


	for(int i=0; i<20; i++){
		count ++;
	//	x [count]=5;
		
			x[i]= rand.nextInt(100);
			
			count=count+1;

			System.out.println("Your numbers are "+ x[i]);
			
			
	 }
	 count =0;
/*	 while(count<20){
	 	System.out.print(x[count]);
	 }
	 */
	 
/*	 for(int i = 0; i <20; i++){
	 	x[i] = 20;
	 	System.out.println(i);
	 }
	
	*/
}
}
