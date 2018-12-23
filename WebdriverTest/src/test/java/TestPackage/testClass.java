package TestPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.setProperty("webdriver.chrome.driver",
		// "C:\\Users\\srini\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\srini\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.officedepot.com");
		driver.findElement(By.className("bx-close-x-adaptive-2")).click();
		driver.findElement(By.xpath("//*[@class='login_state']//*[contains(text(),'Login or Register')]")).click();

	}

}
