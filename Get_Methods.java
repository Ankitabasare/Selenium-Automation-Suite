package Day_26_Browser_Methods;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		String title=driver.getTitle();
		System.out.println(title);
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		}

}
