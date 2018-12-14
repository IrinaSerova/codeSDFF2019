import java.util.Scanner;

public class Methods {
	
//	Write a method called powersOfTwo that prints the first 10 powers of 2 
//	(starting with 2). The method takes no parameters and doesn't return anything.
	
	public static void powerOfTwo(){
		int power = 1;
		System.out.println(" Method 1 - The power of two numbers");
		for (int count = 1; count <= 10; count++) {
			power *= 2;
			System.out.println(power);
		}		
	}
	
//	Write a method called alarm that prints the word “Alarm!” multiple times on separate lines. 
//	The method should accept an integer parameter that specifies how many times the output line is printed.
	
	private static Scanner myNumber;
	public static void alarm(int num) {
		System.out.println(" Method 2 - ALARM");
		myNumber = new Scanner(System.in);
		System.out.println("Enter the number");
		num =myNumber.nextInt();
		for (int count = 1; count <= num; count++) {
			System.out.println("Alarm!");
		}
	}
	
// Write a method called sum100 that returns the sum of the integers from 1 to 100.

	public static int sum100() {
		System.out.println(" Method 3 - SUM");
		int sum = 0;
		for (int count = 1; count <= 100; count++) {
			sum += count;			
		}
		System.out.println("The sum of integers from 1 to 100");
		System.out.println(" is " + sum);
		return sum;				
	}
	
//	Write a method called sumRange that accepts two integer parameters that represent a range. 
//	You may assume the first parameter is less than or equal to the second. The method should return 
//	the sum of the integers in that range.

	private static Scanner lowNumber;
	private static Scanner highNumber;
	public static int sumRange(int low, int high) {
		System.out.println(" Method 4 - SUM of the integers");
		System.out.println("Enter the low number");
		lowNumber = new Scanner(System.in);
		System.out.println("Enter the low");
		low =lowNumber.nextInt();
		System.out.println("Enter the high number");
		highNumber = new Scanner(System.in);
		System.out.println("Enter the low");
		high = highNumber.nextInt();	
		int sum = 0;
		for (int count = low; count <= high; count++) {
			sum += count;
		}
		System.out.println("The sum of the integers in range " + low + " and "+ high);
		System.out.println("is " + sum);
		return sum;
	}
	
//	Write a method called maxOfTwo that accepts two integer parameters and returns the larger of the two.
	
	private static Scanner first;
	private static Scanner second;
	public static int maxOfTwo(int firstNumber, int secondNumber) {
		System.out.println(" Method 5 - MAX of the integers");
		first = new Scanner(System.in);
		System.out.println("Enter the first number");
		firstNumber = first.nextInt();
		second = new Scanner(System.in);
		System.out.println("Enter the second number");
		firstNumber = second.nextInt();
		System.out.println("Enter the first number");
		System.out.println("Enter the second number");
		int result = firstNumber;
		if (firstNumber > secondNumber) {
			result = firstNumber;
			System.out.println("The answer is " + result);
			return result;
		} else
			System.out.println("The answer is " + secondNumber);
			return secondNumber;
	}
	
// call methods 	
	public static void main (String args[]) {
		powerOfTwo();
		alarm(0);
		sum100();
		sumRange(0,0);
		maxOfTwo(3,6);
	}
	

}
