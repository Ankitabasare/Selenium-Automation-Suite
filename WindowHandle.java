package Day_28_Window_Handle;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		
		Set<String> windowId=driver.getWindowHandles();
		
		List<String> window=new ArrayList(windowId);
		
		String parentId=window.get(0);
		String childId=window.get(1);
		
		//print child window title
		
		driver.switchTo().window(childId);
		System.out.println(driver.getTitle());
		
	//	driver.switchTo().defaultContent();
	//	System.out.println(driver.getTitle()); //Human Resources Management Software | OrangeHRM
		
		driver.switchTo().window(parentId);
		System.out.println(driver.getTitle());
	}

}
