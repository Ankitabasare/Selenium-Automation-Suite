package Day_31_Dropdown_Handling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.jqueryui.com/autocomplete/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		driver.manage().window().maximize();
		
		WebElement frame=driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//input[@id='tags']")).sendKeys("a");
		List<WebElement> options=driver.findElements(By.xpath("//div[@class='ui-menu-item-wrapper']"));
		
		System.out.println("Options are availabe: "+options.size());
		
		for(WebElement x:options)
		{
			System.out.println(x.getText());
		}
		
		System.out.println("Select one option");
		
		for(WebElement x1:options)
		{
			String oneoption=x1.getText();
			if(oneoption.equals("JavaScript"))
			{
				x1.click();
			}
		}
	}

}
