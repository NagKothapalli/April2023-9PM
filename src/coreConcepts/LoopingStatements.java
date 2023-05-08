package coreConcepts;

import org.junit.Test;

public class LoopingStatements
{
	@Test
	public void printNumbers()
	{
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		System.out.println("4");
		System.out.println("5");
		System.out.println("6");
		System.out.println("7"); //...............99 100
	}
	@Test
	public void applyColorToSteps()
	{
		System.out.println("Apply Color to Step 1");
		System.out.println("Apply Color to Step 2");
		System.out.println("Apply Color to Step 3");
		System.out.println("Apply Color to Step 4");
		System.out.println("Apply Color to Step 5");
		System.out.println("Apply Color to Step 6");
		System.out.println("Apply Color to Step 7"); // .............99 100
	}
	
	//starting point , how long , step size , redundant activity - apply color
	//for(int iterator=1;iterator<50;iterator=iterator+1){ Task }
	@Test
	public void applyColor()
	{
		//for(int i=1;i<50;i=i+1) // i=1  1<50  i=2 2<50 i=3 3<50 .....49<50 50<50
		for(int i=1;i<=50;i=i+1)   // 50<=50
		{ //if the expression is true then it will do the task
			//Task
			System.out.println("Apply Color to Step :" + i);
		}
	}
	@Test
	public void applyColorToEvenSteps()
	{
		for(int i=2;i<=50;i=i+2)  // i=2 4 6 8 10 ........
		{
			System.out.println("Apply Green color to even step :" + i);
		}
	}
	
	@Test
	public void applyColorToOddSteps()
	{
		for(int i=1;i<=50;i=i+2)  // i=1 3 5 7 9 ........
		{
			System.out.println("Apply Red color to odd step :" + i);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
