package Day21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class First_Test_Case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		
		String orgTitle=driver.getTitle();
		
		System.out.println(orgTitle);
		String exptitle="Your Store";
		
		if (orgTitle.equals(exptitle))
		{
			System.out.println("Test Passed");
		}
		
		else {
			System.out.println("Test Failed");
		}
		
		driver.findElement(By.partialLinkText("W")).click();
		System.out.println("Executed");
	}

}
