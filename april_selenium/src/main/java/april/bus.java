package april;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {
	{

public static void main(String[]args)

	// TODO Auto-generated method stub

    WebDriver driver = new ChromeDriver();

    driver.manage().window().maximize();
    
    driver.get("https://itera-qa.azurewebsites.net/home/automation");
    
    driver.findElement(By.id("class=\"form-group mb-0\"")).sendKeys("hyderabad");
    
    
    
    


}


}