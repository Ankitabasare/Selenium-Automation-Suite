package Day_32_AutosuggestDropDown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestion2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.bjs.com/");
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("food");
		driver.findElement(By.className("fa fa-search")).click();
		
		List<WebElement> list=driver.findElements(By.xpath("//span[@class='font-weight-normal']"));
		
		System.out.println(list.size());
	}

}
