/* 1. Write a program to calculate the monthly salary of an employee : 
	take input for basic salary,
	HRA is 40% of basic salary,
	PF amount to be deducted is 12% of basic,
	Medical allowance is Rs 1200 per month, 
	Traveling allowance is Rs 800 per month,
	Professional tax to be deducted is Rs 300.
 */




import java.util.Scanner;


class Salary{
	
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("Basic Salary: ");
		int basic_salary = input.nextInt();		
		int rent_allowance = (40 * basic_salary)/100;
		int provident_fund = (12 * basic_salary)/100;
		int medical = 1200;
		int travelling =  800;
		int tax = 300;
		
		int total_salary = basic_salary +rent_allowance +medical+travelling-provident_fund-tax;
		
		System.out.println("Monthly Salary is " + total_salary);
	
		
		
		
	}


}