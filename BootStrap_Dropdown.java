package Day_31_Dropdown_Handling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrap_Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		
		driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();
		
		//select single option
		
	//	driver.findElement(By.xpath("//input[@value='Java']")).click();
		
		//select multiple options
				List<WebElement> options=driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//label"));
				System.out.println("number of options are :"+ options.size());
				
				//Printing options from a dropdown
				
			/*	for(WebElement x: options)
				{
					System.out.println(x.getText());
				} */
				
				//select multiple options
				for(WebElement x: options)
				{
					 String optionText = x.getText();
			            if (optionText.equals("Python") || optionText.equals("MySQL")) 
			            {
			                x.click();
			            }
				}
	}
	
}

