package testclasses;

import org.testng.annotations.Test;
import appcode.SomeClassToTest;


// It runs by alphabetical order
public class TestAnnotation {
	
	
  @Test
  public void testMethod1() {
	  SomeClassToTest obj = new SomeClassToTest();
	  int result = obj.sumNumber(1, 2);
	  
	  System.out.println("Running Test -> testMethod1");
	  
  }
  
  @Test
  public void testMethod2() {
	  System.out.println("Running Test -> testMethod2");
	  
  }
  
  @Test
  public void testMethod3() {
	  System.out.println("Running Test -> testMethod3");
	  
  }  
  
}
