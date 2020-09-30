// 4. Write a program to calculate the factorial of the given number?

import java.util.Scanner;

class Factorial{
	
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number:");
		int number = input.nextInt();
		
		
		if( number ==1 || number == 0){
			System.out.println("Factorial is 1");
		}
		else{
			int n = 1, factorial =1;
			while(n <= number){
				factorial = factorial * n;
				n++;
			}
			System.out.println("Factorial is " + factorial);
		}
		
		
	}
}