package GenericLibrary;

import java.util.Random;

public class JavaUtility {
	
	public int getRandomNumber()
	{
		Random r=new Random();
		int value = r.nextInt(1000);
		return value;
	}

}
