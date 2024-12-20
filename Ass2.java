package Assignments;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ass2 
{
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\pramod.sidhartha.b\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		//EdgeOptions options = new EdgeOptions();
	//	options.addArguments("--guest");
		//WebDriver driver = new EdgeDriver(options);
		WebDriver driver=new ChromeDriver();
		int j=0;
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();
		String[] itemsToBeAdded = {"Brocolli", "Cucumber","Carrot" };
		List<String> itemsToBeAddedList = Arrays.asList(itemsToBeAdded);
		List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));
		for(int i=0;i<=products.size();i++) {
			String[] name = products.get(i).getText().split("-");
			String formattedName=name[0].trim();
		if(itemsToBeAddedList.contains(formattedName))
		{
			j++;
			WebElement addToCartButton = products.get(i)
                    .findElement(By.xpath("./following-sibling::div/button[text()='ADD TO CART']"));
            addToCartButton.click();
			if(j==itemsToBeAdded.length)
			{
				break;
			}
		}
		
		}

	}
}
