package Day_29_checkboxes;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//1)       select specific checkbox
		
		//driver.findElement(By.id("wednesday")).click();
	
		//2)     select all the checkboxes
		
	List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
	
   /*	for(int i=0;i<checkboxes.size();i++)
	{
		checkboxes.get(i).click();   //return value then click
	}
	
	*/
	
/*	for(WebElement checkbox:checkboxes)
	{
		checkbox.click();  //directly click
	}
*/
	
	 //3) Select alternate checkboxes
	
/*	for(int i=1;i<checkboxes.size();i=i+2)
	{
		checkboxes.get(i).click();
	}
	*/
	//4) Select last three checkboxes
	
	//total number of checkboxes - how many chekckbox want to select=starting index 
	 //7-3=4
	/*
	for(int i=4;i<checkboxes.size();i++)
	{
		checkboxes.get(i).click();
	}
	}
	
	for(int i=2;i<checkboxes.size()-2;i=+2)
	{
		checkboxes.get(i).click();
	}
	*/
	
	//5) select first 3 checkboxes
	
/*	for(int i=0;i<3;i++)
	{
		checkboxes.get(i).click();
	}
	*/
	//
	
	//6) unselect checkboxes if they are selected
	for(int i=0;i<3;i++)
	{
		checkboxes.get(i).click();
		
	}
	
	for(int i=0;i<checkboxes.size();i++)
	{
		if(checkboxes.get(i).isSelected())
		{
			checkboxes.get(i).click();
		}
	}
	}
	
	
}
