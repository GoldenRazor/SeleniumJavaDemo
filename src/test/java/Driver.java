import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Driver {

	public static void main(String[] args) {
		
		//initiate firefox driver object
		WebDriver driver = new FirefoxDriver();
		//maximize window
		driver.manage().window().maximize();
		//set time limit of 60 seconds for page to load
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		//set time limit of 20 seconds for objects to load/appear
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//navigate to google.co.in site
		driver.get("https://www.google.com");
		//validate site is loaded successfully
		if (driver.getTitle().equalsIgnoreCase("google")){
			System.out.println(driver.getTitle() + "loaded successfully. Test case pass.");
		}else{
			System.out.println(driver.getTitle() + "is loaded insted of google.co.in. Test case fail.");
		}

		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("Cheese!");
		element.submit();
		System.out.println("Page title is: " + driver.getTitle());

		// Google's search is rendered dynamically with JavaScript.
		// Wait for the page to load, timeout after 10 seconds
		(new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver d) {
				return d.getTitle().toLowerCase().startsWith("cheese!");
			}
		});
		//close & quit the driver instance
		driver.close();
		driver.quit();
	}

}
