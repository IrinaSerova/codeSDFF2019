import java.util.Scanner;

public class Methods {
	private static Scanner myNumber;
	public static void powerOfTwo(){
		int power = 1;
		for (int count = 1; count <= 10; count++) {
			power *= 2;
			System.out.println(power);
		}		
	}
	public static void alarm(int num) {
		myNumber = new Scanner(System.in);
		System.out.println("Enter the number to be checked.");
		num =myNumber.nextInt();
		System.out.println("ALARM");
		for (int count = 1; count <= num; count++) {
			System.out.println("Alarm!");
		}
	}
	
	public static void main (String args[]) {
		System.out.println("The first power of two");
		powerOfTwo();
		alarm(0);
	}
	

}
