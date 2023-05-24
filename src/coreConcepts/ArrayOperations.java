package coreConcepts;

import org.junit.Test;

public class ArrayOperations
{
	int stdNum = 22;
	int std1 = 23;
	int std2 = 55;
	//Array : Group of memory locations with similar data type.
	  
	//Modifier DataType   name = value; 
	  public     int     empNum = 1234;
	//Modifier DataType[]  name = {values..........}; - Fixed array
	//Modifier DataType[] name = new DataType[count]; - Dynamic array
	  public    int[]   empNumbers = {22,24,26,32,34,36,78,44,48};
	  @Test
	  public void fixedIntegerArray()
	  {//                     0   1 2  3  4  5 6  7  8  9   10s
		  int[] stdNumbers = {24,56,23,68,45,5,32,56,78,23};		  
		  int len = stdNumbers.length;
		  System.out.println("Length of the array :" + len);
		  int val = stdNumbers[0];
		  System.out.println("0th :" + val);
		  for(int i=0;i<len;i++) // i =0   0<10 , 1<10 , 2<10,3<10....8<10,9<10 , 10<10->F
		  {
			  System.out.println(stdNumbers[i]); // i=0 1 2 3 4 5 6 7 8 9
		  }
		  
	  }
	  @Test
	  public void findStudent_test()
	  {
		// boolean result = findStudent();
		 int[] stdNumbers = {24,56,23,68,45,5,32,56,78,23};
		 int[] empNumbers = {24,56,23,68,45,12,56,55,5,32,56,78,23,34,56,8,89,3,56,34};
		 String[] students = {"Ram","Ravi","Raj","Nag","Rajesh"};
		 char[] stdGrades = {'A','C','E'};
		 //boolean result = findStudent(empNumbers,89);
		 boolean result = findStudent(students,"Raj");
		 if(result) {
			 System.out.println("Found the Student");
		 }
		 else {
			 System.out.println("Not found the Student");
		 }			 
	  }
	  
	  public boolean findStudent()
	  {
		  //                  0   1 2  3...............
		  int[] stdNumbers = {24,56,23,68,45,5,32,56,78,23};
		  //56
		  boolean flag = false;
		  int len = stdNumbers.length;
		  System.out.println("Length of the array :" + len);
		  for(int i=0;i<len;i++)
		  {
			  if(stdNumbers[i] == 56)
			  {
				  flag = true;
				  break;
			  }
		  }
		  return flag;
	  }
	  
	  public boolean findStudent(int[] stdNumbers,int stdNumber)
	  {		  
		  boolean flag = false;
		  int len = stdNumbers.length;
		  System.out.println("Length of the array :" + len);
		  System.out.println("Student Number :" +stdNumber );
		  for(int i=0;i<len;i++)
		  {
			  if(stdNumbers[i] == stdNumber)
			  {
				  flag = true;
				  break;
			  }
		  }
		  return flag;
	  }
	  
	  public boolean findStudent(String[] stdNames,String stdName)
	  {		  
		  boolean flag = false;
		  int len = stdNames.length;
		  System.out.println("Length of the array :" + len);
		  System.out.println("Student Number :" +stdName );
		  for(int i=0;i<len;i++)
		  {
			  if(stdNames[i] == stdName)
			  {
				  flag = true;
				  break;
			  }
		  }
		  return flag;
	  }

	  //Modifier DataType[] name = new DataType[count]; - Dynamic array
	  //FileNotFoundException - checked | compile time exception 
	  //ArrayIndexOutOfBoundsException - Unchecked | RunTime Exception
	  @Test
	  public void studentMarks()
	  {
		  int[] stdMarks = new int[50]; // i=0 ... 49 = 50
		  int len = stdMarks.length;
		  System.out.println("Array Length : " + len);
		  System.out.println(stdMarks[0]);
		  int marks = stdMarks[0];
		  for(int i=0;i<len;i++) // i = 0 1 2 3 4 5 6 7 8 .... 49  50<=50
		  { //true
			  System.out.print("index value :" + i + " - ");
			  System.out.println(stdMarks[i]);
		  }
		  stdMarks[0] = 555; //writing in to array
		  for(int i=0;i<len;i++)
		  {
			  stdMarks[i] = 555; //sum of all subjects
			  System.out.print("index value :" + i + " - ");
			  System.out.println(stdMarks[i]);
		  }
	  }
	  
	  //Collections -  Arraylist
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  

}
