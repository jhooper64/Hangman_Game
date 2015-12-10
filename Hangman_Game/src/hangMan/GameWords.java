/*package hangMan;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class GameWords 
{
	String hint;
	String visible;
	String thewords;
	
	public GameWords()
	{
	
		
	
		String[] wordList = {"western meadowlark", "ponderosa", "crabtown", "sapphire", "big sky country"};
		String[] HintList = {"Montana State Bird", "Montana State Tree", "The Original Name of Helena", "Gemstone Mined in Montana", "Montana State Slogan"};
	
		int randoms;
		randoms = (int) (Math.random()*6);
	
		thewords = wordList[randoms];
		hint = HintList[randoms];
	
		int wordLength = thewords.length();
		visible = "";
	
		for (int count = 0; count < thewords.length(); count++)
		{
			char ch = thewords.charAt(count);
			if (ch == ' ')
			{
				visible += ch;
			}
			else
			{
				visible += '*';
			}
		}
	}

	public String getHint()
	{
		return hint;
	}
	public String toString()
	{
		return visible;
	}
	public boolean update (char ch)
	{
		char [] thewordsArray = new char [thewords.length()];
		char [] visibleArray = new char [thewords.length()];
		
		String str = "";
		boolean contains = false;
		
		for (int c = 0; c < thewords.length(); c++)
		{
			thewordsArray[c] = thewords.charAt(c);
			visibleArray[c] = visible.charAt(c);
		}
		for (int i = 0; i < thewords.length(); i++)
		{
			if (thewordsArray [i] == ch)
			{
				visibleArray[i] = ch;
				contains = true;
			}
		}
		for (int co = 0; co < thewords.length(); co++)
		{
			str = str + visibleArray[co];
		}
		visible = str;
		return contains;
	}
	public boolean wordSolved()
	{
		return thewords.equalsIgnoreCase(visible);
	}
}**/

