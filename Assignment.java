package Day_29_checkboxes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment 
{
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		 String[] labels = {"Smartphone", "Laptop", "Tablet", "Smartwatch", "Wireless Earbuds"};

         // Iterate through the labels and select corresponding checkboxes using XPath
         for (String label : labels) {
             // Dynamically build the XPath
             String xpath = "//td[text()='" + label + "']/preceding-sibling::td/input[@type='checkbox']";

             // Locate the checkbox and click if not already selected
             WebElement checkbox = driver.findElement(By.xpath(xpath));
             if (!checkbox.isSelected()) {
                 checkbox.click();
             }
         }

    
	}
}
