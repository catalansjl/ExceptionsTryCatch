import java.util.Random;

public class Dice {		

	int game;		

	public int  Throw (int number) throws Exception
	{		
		for (int i=0; i<number; i++)
		{			
			 game = game + 0 + (int) (Math.random() * 10);
			 if(i  >= 4)			 
				 throw new Exception();		
		}	
		game = game / 	number;
		return 	(game );
	}

	
}