package week1.day1;

public class Day1Asgnmt_PrimeNumber {

	public static void main(String[] args) {
		int n =5, result, halfval;
		halfval = n/2;
		boolean boolval = false;
		
		for (int i=2; i<=halfval; i++) {
			result = n % i;
			if (result == 0) {
				boolval =  true;
				break;
			}
		}
		
		if (boolval == true) {
			System.out.println("Given number " +n+" is not a Prime Number");
		}else {
				System.out.println("Given number " +n+ " is a Prime Number");
		}

	}

}
