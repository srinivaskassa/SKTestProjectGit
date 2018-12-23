package TestPackage;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTest {
	public WebDriver driver;

	@Test
	public void easyTest() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\srini\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		// driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("http://www.officedepot.com");

	}
}