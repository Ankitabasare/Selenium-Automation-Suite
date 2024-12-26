package Day_29_Handling_Alert;

import java.time.Duration;

import org.checkerframework.checker.units.qual.s;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Confirmation_Alert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.findElement(By.xpath("//button[@id='confirmBtn']")).click();
		Alert alert=driver.switchTo().alert();
		//alert.dismiss();
		//alert.accept();
		String string=alert.getText();
		System.out.println(string);
		
		String expString="Press a button!";
		
		if (string.equals(expString)) 
		{
			System.out.println("Test Passed");
		}
		else {
			System.out.println("Test Faileds");
		}
		
	}

}
