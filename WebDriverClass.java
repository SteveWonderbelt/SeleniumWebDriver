import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;

import java.util.concurrent.TimeUnit;
public class WebDriverClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\selenium-java-3.141.59 (1)\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.getTitle();
		driver.navigate().to("https://www.edureka.co/testing-with-selenium-webdriver");
		
		driver.navigate().back();
		driver.navigate().refresh();
		driver.wait(5000);
		
		driver.findElement(By.name("email")).sendKeys("xxx.gmail.com");
		driver.findElement(By.name("pass")).sendKeys("xxxxxxx");
		driver.findElement(By.id("u_0_q")).click();
		
		driver.quit();
	}

}
