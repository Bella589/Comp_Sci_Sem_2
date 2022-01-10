import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
	    Scanner sc = new Scanner(System.in);

System.out.println("Give me an integer");
int ans = sc.nextInt();
 
 int y = ans;
 
 int count = 1;
 while (true){ 
//count = ans-1;

y= y%count;

if ((ans%count!=0)){

 ans = ans%count-1;

}
    count = ans%count+1;
    
    System.out.println(y);
    break;

 }
 if (ans%count!=0){
     System.out.println("Your number is prime!");
 }

else {
    System.out.println("Your number isnt prime");
}
	    
	}
}
