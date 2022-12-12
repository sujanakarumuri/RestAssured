package CRUDWithBDD;

import java.util.Random;

public class JavaLibrary_RandomNumber {

	
		public int getRandomNumber()
		{
			Random r=new Random();
			int value = r.nextInt(1000);
			return value;
		}

	}


