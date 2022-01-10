import java.util.Scanner;
import java.util.Random;


 class dog{
   	    Scanner sc = new Scanner(System.in);

  String breed2;  
  String name2;
   int age2;
       
  String breed;
  String name;
  int age;



	   public dog(){
	       name = new String("Clifford");
	       age = 3;
	       breed= new String("dog dog");
}

public void bark1 ()	{
    System.out.println("Give me a name of your dog");
     name2 = sc.nextLine();
    System.out.println("How old is your dog?");
    age2 = sc.nextInt();
    String t = sc.nextLine();
   System.out.println("What is it's breed?");
    breed2 = sc.nextLine();
    
     System.out.println("Your dog breed is "+ breed2+ " it is "+ age2 +" years old and it's name is "+ name2 + ".");
    return;
    
}
public void bark2(){
    System.out.println("This dog is "+ breed +" it is " + age + " years old, and it's name is " +name + "." );
}

public void isSleeping(){
  String s = new String ("1");
  String a = new String ("2");
  String s1 = new String ("3");
  String a2 = new String ("4");
  System.out.println("To check if your dog is sleeping, type in 1,2,3, OR 4 then press enter");
		String sleep = sc.nextLine();
   if(sleep.equals ("1")|| (sleep.equals("3"))){
    System.out.println("Your dog is sleeping, shhh");
    System.out.println("Clifford is also sleeping soundly(o・┏ω┓・o)");
   }
   else if (sleep.equals("2")||(sleep.equals("4"))) {
    System.out.println("Feed your dog, its a awake and barking man-");
    System.out.println("You woke up Clifford (ᗒᗣᗕ)՞");
    System.out.println("Now Clifford is up and barking, feed him too");
   }
   
}
	
}

