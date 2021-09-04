package week1.day1;

public class Day1Asgnmt_Fibonacci {

	public static void main(String[] args) {
		int num = 10, i=0, op1=0, op2=1, r = 0, tot=0;
		
		System.out.println("Requested series Length : "+ num);
		System.out.print("Fibonacci Series : "+ r);

		for (i=1; i < num; i++ ) {
			
			r = op1 + op2;
			tot = tot + op2;
			System.out.print(","+ op2);
			op1 = op2;
			op2 = r;
		
		}
		System.out.println();	
		System.out.println("Sum of all value : "+ tot);	

	}

}
