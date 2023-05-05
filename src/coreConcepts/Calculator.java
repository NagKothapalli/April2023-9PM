package coreConcepts;

public class Calculator {

	public static void main(String[] args)
	{
		addition(44,66,20);
		addition();
		addition(44,66);
		
	}
	
	//There is a building having only one gate
	
	public static void openGate()
	{
		System.out.println("Open the Main Gate");
	}
	
	//There is a building with two main gates - gate1 and gate2
	
	public static void openGate(int gateNum)
	{
		System.out.println("Open the Gate" + gateNum);
	}

	
	public static void addition()
	{
		int sum = 22+25; //Hard coded value
		System.out.println("Sum of fixed numbers :"+sum);
	}
	
	public static void addition(int a,int b)
	{
		int sum = a+b;
		System.out.println("Sum of two numbers :"+sum);
	}
	public static void addition(int a,int b,int c)
	{
		int sum = a+b+c;
		System.out.println("Sum of three numbers :"+sum);
	}

	
	
	public static void login(String un,String pw)
	{
		//enter username : un
		//enter password : pw
	}
	

}
