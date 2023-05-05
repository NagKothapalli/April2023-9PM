package coreConcepts;

import org.junit.Test;

public class ConditionalStatements
{
	//Modifier DataType Name = value;
	public int a = 45;
	public int b = 45;
	
	//if(expression -> boolean : true | false){ action }
	
	//Modifier  ReturnType Name(){ body } 
	
	//Assignment Operator :  = 
	//Relational Operator : ==  , < , > , <= , >= , !
	@Test
	public void compareTwoNumbers_if()
	{
		System.out.println("A value :" + a);
		System.out.println("B value :" + b);
		boolean result = (a==b); //true / false
		//if(result == true)
		//if(result)
		if(a==b)
		{
			System.out.println("Both A and B are equal");
		}
	}
	
	@Test
	public void compareTwoNumbers_ifelse()
	{
		System.out.println("A value :" + a);
		System.out.println("B value :" + b);
		if(a==b)
		{ //true
			System.out.println("Both A and B are equal");
		}
		else
		{ //false
			System.out.println("Both A and B are not equal");
		}
	}
	@Test
	public void compareTwoNumbers_ifelse_test()
	{
		compareTwoNumbers_ifelse(44,44);
		compareTwoNumbers_ifelse(84,44);
		compareTwoNumbers_ifelse(-44,-44);
		compareTwoNumbers_ifelse(-84,44);
	}
	//Original Dev code
	//TDD : Test Driven Development   / Unit Testing / White box Testing
	public void compareTwoNumbers_ifelse(int x , int y)
	{
		System.out.println("A value :" + x);
		System.out.println("B value :" + y);
		if(x==y)
		{ //true
			System.out.println("Both X and Y are equal");
		}
		else
		{ //false
			System.out.println("Both X and Y are not equal");
		}
	}
	//WAP to read two integers as input and perform addition if they are equal , do subtraction if a > b , do multiplication if a<b
	@Test
	public void multipleDecisions_test()
	{
		multipleDecisions(22,22);
		multipleDecisions(36,22);
		multipleDecisions(22,42);
	}
	public void multipleDecisions(int num1, int num2)
	{
		System.out.println("Number One value :" + num1);
		System.out.println("Number Two value :" + num2);
		if(num1==num2)
		{
			int sum = (num1+num2);
			System.out.println("Sum of two numbers :" + sum);
		}
		else if(num1>num2)
		{
			int diff = (num1-num2);
			System.out.println("Difference of two numbers : " + diff);			
		}
		else if(num1<num2)
		{
			int prod = num1*num2;
			System.out.println("Product of two numbers : " + prod);
		}
	}
	
	//WAP to read two integers as input and perform the below task if and only if both inputs are above 10
	                 //Task : addition if they are equal , do subtraction if a > b , do multiplication if a<b
	@Test
	public void nestedIfCondition_test()
	{
		nestedIfCondition(8,2);
		nestedIfCondition(8,32);
		nestedIfCondition(28,2);
		nestedIfCondition(88,-42);
		nestedIfCondition(-28,62);
		nestedIfCondition(88,88);
		nestedIfCondition(58,32);
		nestedIfCondition(28,42);
	}
	//code coverage =  (lines of code covered / total lines of code written )  * 100
	//Dev code
	public void nestedIfCondition(int a,int b)
	{
		System.out.println("First Value :" + a);
		System.out.println("Second Value :" + b);
		//   T   and  T -> T
		if((a>10) &&(b>10)) //Outer if  // && : Logical Operator
		{ //T
			//Perform task
			if(a==b)//Nested if  // Inner if // == , >  , <  : Relational Operators
			{
				int sum = (a+b); // = : Assignment Operator
				System.out.println("Sum of two numbers :" + sum);
			}
			else if(a>b)
			{
				int diff = (a-b); // - , + , / : Arithmetic Operators
				System.out.println("Difference of two numbers : "+ diff);			
			}
			else if(a<b)
			{
				int prod = a*b;
				System.out.println("Product of two numbers : " + prod);
			}
		}
		else
		{
			System.out.println("Both A and B or any one of them might be below 10");
		}
	}

	
	
	
	
	
	
	
	
	
	
	
	

}
