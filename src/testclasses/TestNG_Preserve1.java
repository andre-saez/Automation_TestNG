package testclasses;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class TestNG_Preserve1 {
	
	@BeforeClass
	public void beforeClass() {
	
	}

	@AfterClass
	public void afterClass() {
	
	}

	@Test
	public void testMethod1() {
		System.out.println("TestNG_Preserve1 -> testMethod1");
	}
	
	@Test
	public void testMethod2() {
		System.out.println("TestNG_Preserve1 -> testMethod2");
	}
	
}