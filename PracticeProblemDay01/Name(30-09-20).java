// Use java.util.Scanner class to take "name" as input from User and print "Hello"+<name> on the console?  (String name = scan.next()) 

import java.util.Scanner;

class Name{
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = sc.next();
		
		System.out.println("Hello " + name);
		
		
		
	}


}