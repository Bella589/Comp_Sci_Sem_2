import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
	Random rand = new Random();
int sum = 0; 

while (sum < 100) { 
    int num = rand.nextInt(20)+1;
    System.out.println("Random number " + num);

    sum += num;
       
    System.out.println("Current sum " + sum);
 }
 
 System.out.println("The sum " + sum + " exceeds 100"); 
		}


		
	}

