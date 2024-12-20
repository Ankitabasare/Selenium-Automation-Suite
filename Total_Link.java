package Day22;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Total_Link {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		
		List <WebElement> images= driver.findElements(By.tagName("img"));
		System.out.println(images.size());
		
		List< WebElement> header_link=driver.findElements(By.className("list-inline-item"));
		System.out.println(header_link.size());
		
		List<WebElement> total_links=driver.findElements(By.tagName("a"));
		System.out.println(total_links.size());
	}

}
