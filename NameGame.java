import java.util.Scanner;

public class NameGame {
		
	public static void main(String args[]){
		System.out.println("Enter the number to be checked.");
	Scanner input = new Scanner(System.in);
	
	String bName;
	String fName;
	String mName;
	
	String name = input.nextLine();
	if(name.toLowerCase().startsWith("a") 
	|| name.toLowerCase().startsWith("e") 
	|| name.toLowerCase().startsWith("i") 
	|| name.toLowerCase().startsWith("o") 
	|| name.toLowerCase().startsWith("u")){
		bName = " B" + name.toLowerCase();
		fName = " F" + name.toLowerCase();
		mName = " M" + name.toLowerCase();
	}
	else{
		if(name.toLowerCase().startsWith("b")){
			bName = "-" + name.substring(1, name.length());
		}
		else{
			bName = " B" + name.substring(1, name.length());
		}
 		if(name.toLowerCase().startsWith("f")){
			fName = "-" + name.substring(1, name.length());
    	}
		else{
			fName = " F" + name.substring(1, name.length());
		}
		if(name.toLowerCase().startsWith("m")){
			mName = "-" + name.substring(1, name.length());
		}
		else{
 			mName = " M" + name.substring(1,     name.length());
		}
	}
	
	String output = name + ", " + name + " bo" + bName + ",\n"     + "Bonana fanna fo" + fName + ",\nFee fy mo" 
	+ mName + ",\n" + name + "!";
	
	System.out.print(output);
		
	}


}