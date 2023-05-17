package coreConcepts;

import org.junit.Test;

public class StringOperations {
	// Nag ! nag
	String a = "    Selenium With Java           ";
	String b = "JAVA";
	String c = "Selenium With JavA                 ";

	// length , toLowerCase , toUpperCase , trim , contains , equalsIgnoreCase , equals , chatAt
	@Test
	public void stringFunctions() {
		int len = a.length();
		System.out.println("String length :" + len);
		String aL = a.toLowerCase();
		System.out.println("After lowercase :" + aL);
		String aU = a.toUpperCase();
		System.out.println("After uppercase :" + aU);
		String aT = a.trim();
		int len2 = aT.length();
		System.out.println("length after trim :" + len2);
	}

	@Test
	public void stringContains() {
		// boolean result = a.toLowerCase().contains(b.toLowerCase()); //true | false
		// boolean result = a.toUpperCase().contains(b.toUpperCase()); //true | false
		// if(result == true)
		if (a.toUpperCase().contains(b.toUpperCase())) {
			System.out.println("String A contains String B");
		} else {
			System.out.println("String A does not contains String B");
		}
	}

	@Test  // Both strings must be same in length , same in case , same in char sequence[spelling]
	public void stringComparision() {
		//boolean result = a.equals(c); // true | false
		//boolean result = a.trim().equals(c.trim()); 
		//boolean result = a.trim().toLowerCase().equals(c.trim().toLowerCase()); 
		System.out.println(a);
		System.out.println(c);
		boolean result = a.trim().equalsIgnoreCase(c.trim());
		if (result == true) {
			System.out.println("Both strings are equal");
		} else {
			System.out.println("Both strings are not equal");
		}
	}
	
	//charAt
	//StringIndexOutOfBoundsException
	@Test
	public void characterFunction()
	{
		String str = "    Selenium With Java           ";
		//System.out.println(str.charAt(50));
		System.out.println("Length of the string :"+str.length());
		System.out.println("4th char :" + str.trim().charAt(3));
		
	}
	@Test
	public void findCharacter() //m
	{
		String str = "    Selenium With Java           ";
		String str2 = str.trim();
		int len = str2.length();
		for(int i=0;i<len;i++)
		{
			char mychar = str2.charAt(i);
			System.out.println("all chars :" + mychar);
			if(mychar == 'm')
			{
				System.out.println("Found the Character");
				break;
			}
		}
	}
	@Test
	public void findCharacter_test()
	{
		findCharacter("Selenium With CSharp",'W');
		findCharacter("Selenium With CSharp",'S');
		findCharacter("Selenium With CSharp",'h');
		findCharacter("Selenium With CSharp",'x');
	}
	public void findCharacter(String str,char chartoFind) //m
	{
		boolean flag = false;
		//String str = "    Selenium With Java           ";
		String str2 = str.trim();
		int len = str2.length();
		for(int i=0;i<len;i++)
		{
			char mychar = str2.charAt(i);
			//System.out.println("all chars :" + mychar);
			if(mychar == chartoFind)
			{
				flag = true;
				break;
			}
		}
		if(flag) {
			System.out.println("Found the Character :" + chartoFind);
		}
		else {
			System.out.println("Did not Found the Character :" + chartoFind);
		}
	}
	@Test
	public void findCharacterCount()
	{
		String str = "Selenium With Java";
		int counter = 0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i) == 'i')
			{
				counter++; // counter = counter+1;
			}
		}
		System.out.println("Count of char a :" + counter);
	}
	@Test
	public void subStringOperation()
	{   //            01234
		String str = "Selenium With Java";		
		String s8 = str.substring(8);
		System.out.println("string from 8th char :" + s8);
		String s08 = str.substring(0, 8);
		System.out.println("string from 0-8 :" +s08 );
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
