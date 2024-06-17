package NumberGame;
import java.util.Random;
import java.util.Scanner;

public class NumberGuessGame
{
	public static int MIN_RANGE=1;
	public static int MAX_RANGE=100;
	public static int MAX_ATTEMPTS=6;
	public static int MAX_ROUND=3;
	
	public static void main(String[] args) 
	{
		Random random=new Random();
		Scanner sc=new Scanner(System.in);
		int totalScore=0;
		
		System.out.println("Wellcome to NumberGuessing Game \n");
		System.out.println("Total Number Of Rounds 3 \n ");
		System.out.println("No.of.Attempts For Each Reound are 6 \n");
		
		for(int i=1;i<=MAX_ROUND;i++)
		{
			int number=random.nextInt(MAX_RANGE)+MIN_RANGE;
			int current_attempts=0;
			System.out.println("Current Round:"+i+":Guess the number between: "+MIN_RANGE+" to "+MAX_RANGE+" in "+MAX_ATTEMPTS);
			
			while(current_attempts<MAX_ATTEMPTS)
			{
				System.out.println("Enter your guess number:");
				int guess_number=sc.nextInt();
				current_attempts=current_attempts+1;
				
				if(guess_number==number)
				{
					int score=MAX_ATTEMPTS-current_attempts;
					totalScore+=score;
					System.out.println("Congrats! You successfully guessed the number "+" current attempts: "+ current_attempts +" Your score: " +score);
					break;
				}
				else if(guess_number<number)
				{
					System.out.println("the number is greater than guessed number" + " You guessed number is "+ guess_number + " no.of attempts "+(MAX_ATTEMPTS-current_attempts));
					
				}
				else if(guess_number>number)
				{
					System.out.println("the number is less than guessed number" + " Your guessed number is "+ guess_number + " no.of attempts "+(MAX_ATTEMPTS-current_attempts));
					
				}
			}
			if(current_attempts==MAX_ATTEMPTS)
			{
				System.out.println("You loss the round::Attempts=0"+i);
				System.out.println("the random number is="+number);
			}
		}
	System.out.println(" Games Over!! the total score :"+totalScore);
	sc.close();
	
		
	}
}
