package Day_31_Dropdown_Handling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Handling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement country=driver.findElement(By.id("country"));
		//System.out.println("Total number of Options are: "+country.getSize());
		Select select=new Select(country);
		
	//	select.selectByIndex(0);
	//	select.selectByValue("france");
	//	select.selectByVisibleText("Germany");
		
	List<WebElement> name =select.getOptions();
		System.out.println("Number of Options Are: "+name.size());
		//System.out.println("Options Are: "+ name.ge);
		
		System.out.println("Options from dropdown Are: ");
	/*	for(int i=0;i<name.size();i++)
		{
			
			System.out.println(name.get(i).getText());
		} */
		
		for(WebElement x:name)
		{
			x.getText();
		}
	}

}
