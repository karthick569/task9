package task9;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Question1 {

	public static void main(String[] args) throws InterruptedException
	{
       WebDriver driver = new FirefoxDriver();
       driver.get("http://google.com");
       String currentURL = driver.getCurrentUrl();
       System.out.println(currentURL);
       driver.navigate().refresh();
       Thread.sleep(2);
       driver.navigate().refresh();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
       driver.close();
	}

}
