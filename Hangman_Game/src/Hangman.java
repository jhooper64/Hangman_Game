
import java.util.Scanner;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JFrame;


public class Hangman 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		Random randomword = new Random();
		
		
		String [] GameWordsList = {"meadowlark", "ponderosa", "Sapphire", "treasure state", "big sky country", "georgia", "gold", "crabtown", "minnesota"};
		
		final int Maximum_Wrong_Guesses = 6;
		
		int index = randomword.nextInt(GameWordsList.length);
		GameWords = "ponderosa";
		GameWords = GameWordsList[index];
		
		char[] CorrectLetters;
		char[] IncorrectLetters;
	
		int WrongGuessCount = 0;
		
		while (!GameWon(CorrectLetters) && (WrongGuessCount < Maximum_Wrong_Guesses)
				{
			
			
				}
		
	

	}

}
