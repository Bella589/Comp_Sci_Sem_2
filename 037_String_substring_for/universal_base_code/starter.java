import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		 Scanner sc = new Scanner(System.in);

		System.out.println("Give meh a  word that is  6 letters");
		String input = sc.nextLine();
		

		for(int c = 0; c < 5; c++)
		{
			 if (input != null && input.length() > 1) { 
               System.out.println(input.substring(0, Math.min(input.length(), 6)));;
		

			
		}

		
	}
}
}
