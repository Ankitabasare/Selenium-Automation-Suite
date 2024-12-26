package Day_28_Window_Handle;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/\r\n"
				+ "");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("Wikipedia1_wikipedia-search-input")).sendKeys("Games");
		driver.findElement(By.xpath("//input[@class='wikipedia-search-button']")).click();
		
		List<WebElement> links=driver.findElements(By.id("wikipedia-search-result-link"));
		System.out.println("Total links are: "+ links.size());
		for(WebElement x:links)
		{
			System.out.println(x.getText());
			x.click();
		}
		
		Set<String> window=driver.getWindowHandles();
		
		for(String winId:window)
		{
			String title=driver.switchTo().window(winId).getTitle();
			System.out.println(title);
		}
		
	}

}
