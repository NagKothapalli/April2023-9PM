package coreConcepts;

import org.junit.Test;

public class StringOperations {
	// Nag ! nag
	String a = "    Selenium With Java           ";
	String b = "JAVA";
	String c = "Selenium With JavA                 ";

	// length , toLowerCase , toUpperCase , trim , contains
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

}
