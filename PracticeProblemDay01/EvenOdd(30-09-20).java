//2. Write a program to check whether a given number is EVEN or ODD ?




import java.util.Scanner;


class EvenOdd{
	
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("Checking Even or Odd. ");
		System.out.println("Enter the number to check: ");
		
		int number = input.nextInt();		
		if( (number % 2) == 0)
		{
			System.out.println(number + " is EVEN");
		}
		else
		{
			System.out.println(number + " is ODD");
		}
	}
}