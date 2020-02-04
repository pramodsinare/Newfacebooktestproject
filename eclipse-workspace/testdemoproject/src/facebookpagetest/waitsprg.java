package facebookpagetest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class waitsprg {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.get("http://www.facebook.in/");
		driver.get("https://www.google.com/search?q=toolsqa&oq=toolsqa&aqs=chrome..69i57j69i60l3.6786j0j7&sourceid=chrome&ie=UTF-8");
		driver.manage().window().maximize();
		//WebElement idlocators=driver.findElement(By.id("u_0_m"));
		//idlocators.sendKeys("pramod");
		//WebElement nameloators=driver.findElement(By.name("lastname"));
		//nameloators.sendKeys("sinare");
       WebElement element= driver.findElement(By.linkText("ToolsQA"));
       WebElement link=driver.findElement(By.tagName("a"));
       System.out.println("value of links"+link);
       //element.click();
		driver.close();
	}

}
