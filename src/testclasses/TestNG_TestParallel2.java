package testclasses;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class TestNG_TestParallel2 {

	@Test
	public void testMethod1() throws InterruptedException {
		System.out.println("TestNG_TestParallel2 -> testMethod1");
		Thread.sleep(6000);
		System.out.println("TestNG_TestParallel2 -> testMethod1 -> More Steps");
	}

	@Test
	public void testMethod2() throws InterruptedException {
		System.out.println("TestNG_TestParallel2 -> testMethod2");
		Thread.sleep(6000);
		System.out.println("TestNG_TestParallel2 -> testMethod2 -> More Steps");
	}

}
