package Day_31_Dropdown_Handling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
		
	List<WebElement> country_names=driver.findElements(By.id("country-list"));
		System.out.println("Total number of countries are: "+country_names.size());
		
		System.out.println("Options in the list are: ");
		
		for(WebElement x:country_names)
		{
			System.out.println(x.getText());
		}
		driver.manage().window().maximize();
	}

}
