
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String args[]){

        //creating instance of Random() class
        Random rand = new Random();

        //creating a int type variable
        int randomInteger;

        //storing random number in randomInteger variable
        randomInteger = rand.nextInt(10)+1;

        Scanner scanner = new Scanner(System.in);       

        while(true){

            
            System.out.print("User Input:");
            //storing user input in userInput variable
            int userInput = scanner.nextInt();

            //checking conditions and showing messages
            if(userInput==randomInteger){
                System.out.println("Congratulation");
                break;
            }else if(userInput>randomInteger){
                System.out.println("Guess Lower");
            }else{
                System.out.println("Guess Higher");
            }
        }
    }
}