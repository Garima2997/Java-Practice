// power of number

import java.lang.Math;

class Power{
	
	public static void main(String args[]){
		
	
		
		double number = Float.parseFloat(args[0]);
		double power = Float.parseFloat(args[1]);
		
		double a = Math.pow(number , power);
		
		
		System.out.println("Power of given number is " + a);
	}


}
