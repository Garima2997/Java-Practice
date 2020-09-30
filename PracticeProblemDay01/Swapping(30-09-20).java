// swap 2 numbers



class Swapping{
	
	public static void main(String args[]){
		
		int n1, n2 , temp;
		
		n1 = Integer.parseInt(args[0]);
		n2 = Integer.parseInt(args[1]);
		
		System.out.println("n1 is " + n1);
		System.out.println("n2 is " + n2);
		
		temp = n1;
		n1 = n2;
		n2 = temp;
		
		
		System.out.println("n1 is " + n1);
		System.out.println("n2 is " + n2);
		
	}


}