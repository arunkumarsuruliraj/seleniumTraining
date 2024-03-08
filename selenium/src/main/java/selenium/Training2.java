package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Training2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/HTML.html");
		//WebElement name = driver.findElement(By.xpath("//input[@value ='f']"));
		//WebElement name = driver.findElement(By.xpath("//input[contains(@value,'f')]"));
		//WebElement name = driver.findElement(By.partialLinkText("//[contains(text(),'f']"));
		WebElement name = driver.findElement(By.xpath("//input[contains(value(),'f']"));
		//WebElement name = driver.findElement(By.xpath("//input[starts-with(@value,'f')]"));
		name.click();
		

	}

}
