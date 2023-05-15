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
	//Modifier DataType[]  name = values; - Fixed array
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

}
