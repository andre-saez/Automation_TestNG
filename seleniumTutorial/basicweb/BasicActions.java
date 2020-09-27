package basicweb;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class BasicActions {
	
	WebDriver driver;
	String baseUrl;
		
	@Before
	void setUp() throws Exception {
		//System.setProperty("webdriver.chrome.driver", "C:/Program Files/Libs/Drivers/FirefoxDriver.exe");
		String baseUrl = "https://docs.github.com/";
		WebDriver driver = new FirefoxDriver();
		driver.get(baseUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1500, TimeUnit.SECONDS);

	}

	@Test
	void test() {
		System.out.println("Teste executado");
	}

	@After
	void tearDown() throws Exception {
		Thread.sleep(1500);
		//driver.quit();

	}

}
