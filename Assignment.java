package Day_29_Handling_Alert;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://mypage.rediff.com/login/dologin");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Alert alert=driver.switchTo().alert();
		
		String expsString="Please enter captcha";
		String actualString=alert.getText();
		
		if (expsString.equals(actualString)) 
		{
			System.out.println("Test Passed");
		}
		
		alert.accept();
		
		driver.findElement(By.name("captcha")).sendKeys(""); 
		
	}

}
