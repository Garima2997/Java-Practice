// 3. Write a program to enter the age of a person and check whether the person is eligible for voting or not ?


import java.util.Scanner;

class Voting{
	
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Age:");
		int age = input.nextInt();
		
		if(age >= 18)
		{
			System.out.println("Eligible for voting.");
		}
		else
		{
			System.out.println("Not eligible for voting.");
		}
	}
}