import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		//System.out.print("I love to learn coding remotely.");
		//all grey // is for lab 11
		//int jk = 1;
		//int v = 30;
		//int b = 5;
	   //boolean jkv = (1==30);
	    //if(1<30)
		//System.out.println(jk+v);
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Give me a whole number (No desimals).");
		int num1 = sc.nextInt();
		System.out.println("Give me another whole number (No decimals).");
		int num2 = sc.nextInt();
		if (num1 == num2)
		System.out.println(num1+ " and " + num2 + " are equal");
		if (num1 > num2)
		System.out.println(num1 + " is greater than "+ num2 );
		if (num1 < num2)
		System.out.println(num1+ " is less than " + num2 + ".");
	}
	
}
