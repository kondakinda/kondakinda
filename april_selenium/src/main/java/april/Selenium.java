package april;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     WebDriver driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://itera-qa.azurewebsites.net/home/automation");
     driver.findElement(By.id("name")).sendKeys("ravi");
     driver.findElement(By.id("phone")).sendKeys("8328343914");
     driver.findElement(By.id("email")).sendKeys("ravi9.marolix@gmail.com");
     driver.findElement(By.id("password")).sendKeys("123456789");
     driver.findElement(By.id("address")).sendKeys("banglore");  
     driver.findElement(By.id("submit")).sendKeys("yes");
     		
	}

} 
