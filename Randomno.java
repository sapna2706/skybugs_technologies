package randomno;
import java.util.Random;
import java.util.Scanner;

public class Randomno {
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int lowb = 1;
		int upperb = 100;
		int randomNumber = random.nextInt(upperb - lowb +1)+lowb;
		
		System.out.println("Welcome to the number guessing game");
		System.out.println("Try to guess the number between"+lowb +"and"+upperb);
		
		int userGuess;
		int attempts = 0;
		{
		do {
			System.out.println("Enter your guess");
			 userGuess  = sc.nextInt();
			 attempts ++;
			 if (userGuess <randomNumber) {
				 System.out.println("Too low! Try again");
			 }
			 else if(userGuess > randomNumber)
			 {
				 System.out.println("Too high!  Try again");
			 }
			 else {
				 System.out.println("Congratulations! you guessed the number in"+attempts+"attempts");
			 }
		}while(userGuess!=randomNumber);
		
		sc.close();
		}
	}

}
