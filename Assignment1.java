package Day22;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.demoblaze.com/index.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("Total Links Are: "+ links.size());
		
		List<WebElement> images=driver.findElements(By.tagName("img"));
		System.out.println("Total Images Are:"+images.size());
		
		driver.findElement(By.linkText("Contact")).click();

		//driver.findElement(By.partialLinkText("Home")).click();

	}

}
