package task9;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question3 {

	public static void main(String[] args)
	{

		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.wikipedia.org/");
		 driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	     driver.findElement(By.id("searchInput")).sendKeys("Artificial Intelligence",Keys.ENTER);
	     driver.findElement(By.xpath("//span[text()='History']")).click();
	     
	     WebElement title = driver.findElement(By.xpath("//span[text()='History']"));
	     System.out.println(title);


	}

}
