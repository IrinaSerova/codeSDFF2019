
public class Methods {
	public static void powerOfTwo(){
		int power = 1;
		for (int count = 1; count <= 10; count++) {
			power *= 2;
			System.out.println(power);
		}
		
	}
	public static void main (String args[]) {
		System.out.println("The first power of two");
		powerOfTwo();
	}
	

}
