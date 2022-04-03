package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Class 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\irg\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://ima.policyera.in/policyera/signin.");
		String url = driver.getCurrentUrl();
		System.out.println(url);
		String title = driver.getTitle();
		System.out.println(title);
		
		WebElement textPresent = driver.findElement(By.xpath("//p[text()='Sign into your account']"));
		System.out.println(textPresent.getText());
		
		
		
	}

}
