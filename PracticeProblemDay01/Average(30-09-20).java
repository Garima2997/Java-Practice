// Write a java program to take three numbers from command line and print the average ?
//> java Avg 5 6 4
//Average=5


class Average{
	
	public static void main(String args[]){
	
	
		float average = (Float.parseFloat(args[0]) + Float.parseFloat(args[1])+ Float.parseFloat(args[2]))/3;
		System.out.println("Average is " + average);
		
		
	}


}

//OR

import java.util.Scanner;

class Average{
	
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int a = input.nextInt();
		System.out.println("Enter second number: ");
		int b = input.nextInt();
		System.out.println("Enter third number: ");
		int c = input.nextInt();
		int average = (a + b+ c)/3;
		System.out.println("Average is " + average);
		
		
	}


}
