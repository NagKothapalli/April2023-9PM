package coreConcepts;


//Signature of class :
		//Modifier   class   Name{ Members : variables / Functions }
		//Access Modifiers : private , default , protected , public
        //Non Access Modifiers : static , final
    //Naming conventions : Class name should always start with Uppercase letter
	// class name should not have any space,special characters
public class BasicConcepts
{	
	// Members : variables / Functions
	
	//Signature of variable :
		//Modifier[opt]  DataType  Name;           //Modifier  DataType  Name = value;
	public int rollNumber=34;
	public int rollNum = 1234; // Type mismatch error
	//integer : byte , short , int , long
	public byte num1 = 16; //1 kg
	public short num2 = 9345;//5 kg
	int num3 =233487989; //10 kg
	public long num4 = 233476658;
	public boolean stdResult= false;
	private double marks = 94.68;
	protected char stdGrade = 'A';
	String name ="Ram123^%&*";
	
	//Signature of function :
	
	  //Modifier  ReturnType  Name(){  body }
	        //If Yes  - DataType
	        //If No  - void
	
	  //Modifier  ReturnType  Name(arguments....){  body }
	                            //Datatype arg1,Datatype arg2,...
	//Naming Conventions for a member of a class : variable , function
	//Member of a class can start with  _ , $ , a-z , A-Z 
	  //It must follow camelCasing 
	 // No spaces are allowed
	
	//int empNum;  int _empNum;
	
	//main function  - psvm
	public static void main(String[] args)
	{
		System.out.println("Welcome to Selenium Java");
		addition();
		subtraction();
		multiplication();
		
	}
	
	//Naming Convention :
	
	  // Member of a class can start with _ , $ , a-z , A-Z
	  // Can not have any spaces , no special chars other than _ and $
	int _empNum; int EmpNum;  int $empNum;  int emp_Num;  int empNum_;
	//int emp Num;
	//int empNum#;
	// 0   0
	public static void addition()
	{
		int sum = 22+25; // int = int+int;
		//System.out.println("Sum of Two Numbers : sum");
		System.out.println("Sum of Two Numbers : "  + sum);
	}
	//0 0
	public static void subtraction()
	{
		int diff = 242-42; // int = int+int;
		System.out.println("Difference of Two Numbers : "  + diff);
	}
	// 0  0
	public static void multiplication()
	{
		int prod = 12*22; // int = int+int;
		System.out.println("Product of Two Numbers : "  + prod);
	}
	
	
	
	
	
	
	
	
	

}
