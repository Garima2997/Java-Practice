// Compound Interest


import java.lang.Math; 

class CI{
	
	public static void main(String args[]){
		
		double principal, rate, year;
		
		principal = Float.parseFloat(args[0]);
		rate = Float.parseFloat(args[1]);
		year = Float.parseFloat(args[2]);
		
		double r = 1 +(rate/100);
		double n1 = Math.pow(r, year);
		double amount = principal * n1;
		double interest = amount - principal;
		
		System.out.println("Compund interest is " + interest);
		
		
	}


}