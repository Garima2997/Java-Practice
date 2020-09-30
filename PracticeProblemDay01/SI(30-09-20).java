// 2. Write a java program to calculate simple interest, get the required inputs from command line ?
// SI = (principal * rate * years)/100


import java.util.Scanner;

class SI{
	
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("Calculating Simple Interest. ");
		System.out.println("Enter Principal Amount: ");
		int a = input.nextInt();
		System.out.println("Enter rate : ");
		int b = input.nextInt();
		System.out.println("Enter year : ");
		int c = input.nextInt();
		int interest = (a * b* c)/100;
		System.out.println("Simple Interest is " + interest);
		
		
	}


}