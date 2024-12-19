package Day_26_Browser_Methods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Conditional_Commands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demo.nopcommerce.com/register");
		driver.manage().window().maximize();
		
		//is Logo displayed
		WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		System.out.println(logo.isDisplayed());
		//System.out.println(logo);
		
		//is Enabled
		WebElement firstname=driver.findElement(By.xpath("//input[@name='FirstName']"));
		System.out.println(firstname.isEnabled());
		//is Selected
		WebElement radio=driver.findElement(By.id("gender-male"));
		System.out.println("Before Selecting "+radio.isSelected());
		
		WebElement radio_Select=driver.findElement(By.id("gender-male"));
		radio_Select.click();
		System.out.println("After Selecting Radio button "+ radio_Select.isSelected());
		
		boolean status=driver.findElement(By.id("Newsletter")).isSelected();
		System.out.println(status);
	}

}
