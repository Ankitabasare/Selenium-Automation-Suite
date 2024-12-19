package Day23;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssLocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://demo.nopcommerce.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("mac");
		driver.findElement(By.cssSelector("button.button-1")).click();
		
		driver.findElement(By.cssSelector("button.button-1")).click();
		
		
		//tag attribute
		driver.findElement(By.cssSelector("input[placeholder=\"Search store\"]")).sendKeys("ti");
		
		
	}

}
