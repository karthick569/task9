package task9;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question2 {

	public static void main(String[] args)
	{
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.demoblaze.com/");
		 driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	      String title = driver.getTitle();
	      if(title.equals("STORE"))
	      {System.out.println("Page landed on correct website");}
	      else
	      {System.out.println("Page not landed on correct website");}
	     driver.close();

	}

}
