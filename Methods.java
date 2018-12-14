import java.util.Scanner;

public class Methods {
	
	// method 1 The power of two numbers	
	public static void powerOfTwo(){
		int power = 1;
		System.out.println(" Method 1 - The power of two numbers");
		for (int count = 1; count <= 10; count++) {
			power *= 2;
			System.out.println(power);
		}		
	}
	// method 2 The alarm
	private static Scanner myNumber;
	public static void alarm(int num) {
		System.out.println(" Method 2 - ALARM");
		myNumber = new Scanner(System.in);
		System.out.println("Enter the number to be checked.");
		num =myNumber.nextInt();
		for (int count = 1; count <= num; count++) {
			System.out.println("Alarm!");
		}
	}
	// method 3 The sum of integers from 1 to 100
	public static int sum100() {
		System.out.println(" Method 3 - SUM");
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
	// method 5 The larger parameter
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
			System.out.println(result);
			return result;
		} else
			System.out.println(secondNumber);
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
