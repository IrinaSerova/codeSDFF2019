import java.util.Scanner;

public class Methods {
	
	// method 1 The power of two numbers	
	public static void powerOfTwo(){
		int power = 1;
		System.out.println("The power of two numbers");
		for (int count = 1; count <= 10; count++) {
			power *= 2;
			System.out.println(power);
		}		
	}
	// method 2 The alarm
	private static Scanner myNumber;
	public static void alarm(int num) {
		myNumber = new Scanner(System.in);
		System.out.println("Enter the number to be checked.");
		num =myNumber.nextInt();
		System.out.println("ALARM");
		for (int count = 1; count <= num; count++) {
			System.out.println("Alarm!");
		}
	}
	// method 3 The sum of integers from 1 to 100
	public static int sum100() {
		int sum = 0;
		for (int count = 1; count <= 100; count++) {
			sum += count;	
			
		}
		System.out.println("The sum of integers from 1 to 100");
		System.out.println("The answer is " + sum);
		return sum;				
	}
	// method 4 The sum of the integers in range
	private static Scanner lowNumber;
	public static int sumRange(int low, int high) {
		lowNumber = new Scanner(System.in);
		System.out.println("Enter the low");
		low =lowNumber.nextInt();
		int sum = 0;
		for (int count = low; count <= high; count++) {
			sum += count;
		}
		System.out.println("The sum of the integers in range");
		System.out.println("The answer is " + sum);
		return sum;
	}
	
// call methods 	
	public static void main (String args[]) {
		powerOfTwo();
		alarm(0);
		sum100();
	}
	

}
