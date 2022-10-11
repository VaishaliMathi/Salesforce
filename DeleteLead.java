package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
	   driver.findElement(By.linkText("Find Leads")).click();
	   driver.findElement(By.linkText("Phone")).click();
	   driver.findElement(By.name("phoneNumber")).sendKeys("8940279179");
	   driver.findElement(By.linkText("Find Leads")).click();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	   driver.findElement(By.linkText("10930")).click();
	   driver.findElement(By.xpath("//a[@class='subMenuButtonDangerous']")).click();
       driver.findElement(By.linkText("Find Leads")).click();
       Thread.sleep(1000);
	   driver.findElement(By.className("id")).sendKeys("10930");
	   driver.findElement(By.linkText("Find Leads")).click();
	 String text = driver.findElement(By.xpath("//div[contains(@class,'x-toolbar x-small')]/div[1]")).getText();
	System.out.println(text);
	} 

}
