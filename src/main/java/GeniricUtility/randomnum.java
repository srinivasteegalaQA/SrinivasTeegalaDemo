package GeniricUtility;

import java.util.Random;

public class randomnum {

	public int getRandomNumber()
	{
		Random r=new Random();
		int value = r.nextInt(100);
		return value;	
		
	}
}
