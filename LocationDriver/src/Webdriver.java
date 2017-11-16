import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//import org.openqa.selenium.WebDriver;

public class Webdriver {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://takeout.google.com/settings/takeout/custom/location_history");
		driver.findElement(By.linkText("Sign in")).click();
		
		Thread.sleep(20000);
		driver.findElement(By.linkText("CREATE ARCHIVE")).click();

		Thread.sleep(5000);
		List<WebElement> elem1 = driver.findElements(By.cssSelector("div[aria-label='Select none']"));
		if(elem1.size() > 1)
		{
			elem1.get(1).sendKeys(Keys.RETURN);
		}
		else
		{
			elem1.get(0).sendKeys(Keys.RETURN);
		}
	
		driver.findElements(By.cssSelector("div[aria-label='Select Location History']")).get(1).click();
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[text() = 'Next']")).click();;
		
		Thread.sleep(5000);
//		WebElement element = driver.findElement(By.xpath("//*[text() = 'Archive size (max)']"));
//		WebElement dropdown = element.findElement(By.xpath("following-sibling::div"));
//		dropdown.click();
//		driver.findElement(By.cssSelector("div[aria-label=' 50GB']")).click();

		driver.findElement(By.xpath("//*[text() = 'Create archive']")).click();
		
		Thread.sleep(20000);
		driver.findElements(By.xpath("//*[text() = 'Download']")).get(1).click();

		
	}
}
