package pageclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPageFactory {
	WebDriver driver;

	@FindBy(id = "header-history")
	WebElement headerHistory;

	@FindBy(id = "tab-flight-tab")
	WebElement flightsTab;

	@FindBy(id = "flight-origin")
	WebElement originCity;

	@FindBy(id = "flight-destination")
	WebElement destinationCity;

	@FindBy(id = "flight-departing")
	WebElement departureDate;

	@FindBy(id = "flight-returning")
	WebElement returnDate;

	@FindBy(id = "search-button")
	WebElement searchButton;

	public SearchPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickFlightsTab() {
		// headerHistory.click();
		flightsTab.click();
	}

	public void setOriginCity(String origin) {
		originCity.sendKeys(origin);
	}

	public void setDestinationCity(String destination) {
		destinationCity.sendKeys(destination);
	}

	public void setDepartureDate(String date) {
		departureDate.sendKeys(date);
	}

	public void setReturnDate(String date) {
		returnDate.sendKeys(date);
		returnDate.sendKeys(Keys.TAB);
	}

	public void clickSearchButton() {
		searchButton.click();
	}

	public void clearAllFields() {
		driver.findElement(By.id("flight-origin")).clear();
		driver.findElement(By.id("flight-destination")).clear();
		driver.findElement(By.id("flight-departing")).clear();
		driver.findElement(By.id("flight-returning")).clear();
		driver.findElement(By.id("flight-returning")).sendKeys(Keys.TAB);
	}
}