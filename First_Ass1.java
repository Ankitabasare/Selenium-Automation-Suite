package Assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class First_Ass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new EdgeDriver();
		driver.get("https://demo.nopcommerce.com/");
		
		String act_title=driver.getTitle();
		
		if (act_title.equals("nopCommerce demo store")) 
		{
		System.out.println("test passed");	
		}
		else {
			System.out.println("test failed");
		}
	}

}
