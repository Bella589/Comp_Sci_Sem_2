import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		 Scanner sc = new Scanner(System.in);

		System.out.println("Give meh a  four letter word");
		String word = sc.nextLine();
		
		System.out.println(word.length() + " is the lenglth of your word.");
		System.out.println(word.substring(0,1));
		System.out.println(word.substring(1,2));
		System.out.println(word.substring(2,3));
		System.out.println(word.substring(3,4));


		
		
	


		
	}
}
