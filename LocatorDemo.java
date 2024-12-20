package Day22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		
		//driver.findElement(By.name("search")).sendKeys("mac");
		
		boolean status=driver.findElement(By.id("logo")).isDisplayed();
		System.out.println(status);
		
		driver.findElement(By.linkText("Shopping Cart")).click();
	}

}
