package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class Training {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/HTML.html");
	By maleRadioButton = RelativeLocator.with(By.tagName("input")).toLeftOf(By.xpath("//input[@value = 'f']"));
	//WebElement femaleRadioButton = driver.findElement(By.xpath("//input[@value = 'f']"));
	WebElement maleRadioButton1 = driver.findElement(By.tagName("input"));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(500));
	maleRadioButton1.click();
	
	

	}

}
