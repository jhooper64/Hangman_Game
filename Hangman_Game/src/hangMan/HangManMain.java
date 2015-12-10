
/*package hangMan;


import javax.swing.JOptionPane;
import java.util.Scanner;

public class HangManMain 
{	
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int WrongGuessCount = 0;
		final int MaxWrongGuesses = 6;
		boolean bool = false;
		
		beginGame();
		GameWords word = new GameWords();
		JOptionPane.showMessageDialog(null,"Your Hint is: " + word.getHint());
		UserKeyInput input = new UserKeyInput();
		
	
		
		while (WrongGuessCount < 6 && !word.wordSolved())
		{
			JOptionPane.showMessageDialog(null, word);
			char ch = input.getNewLetter();
			if (!word.update(ch))
			{
				WrongGuessCount = WrongGuessCount + 1;
			}
		}
		if (word.wordSolved())
		{
			JOptionPane.showMessageDialog(null, "You Won!");
			
			String answer = JOptionPane.showInputDialog("\nPlay again? (Y or N)");
					
			//if (answer.equalsIgnoreCase("Y"))
			//{
				//return true;
			//}
			//else if (answer.equalsIgnoreCase("N"));
			//{
				//return false;
			//}
		}
		else
		{
			JOptionPane.showInputDialog(null, "The little guy is hung! Sorry, you lost.");
			display GallowsPic();
			
			JOptionPane.showMessageDialog(null, "You Won!");
			
			String answer = JOptionPane.showInputDialog("\nPlay again? (Y or N)");
					
			//if (answer.equalsIgnoreCase("Y"))
			//{
				//return true;
			//}
			//else if (answer.equalsIgnoreCase("N"));
			//{
				//return false;
			//}
		}

	}
	public static void beginGame()
	{
		JOptionPane.showMessageDialog(null, "Welcome to HangMan! You have six tries before the little fellow is hung. Save him by solving the word or phrase.");
		
		//displayGallowsPic(Start);
	}

}**/
