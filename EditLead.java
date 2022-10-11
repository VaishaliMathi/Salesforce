package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) throws Throwable {
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
	   driver.findElement(By.xpath("(//span[text()='Advanced']/following::input)[2]")).sendKeys("vaishali");
	   Thread.sleep(1000);
	   driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	   driver.findElement(By.linkText("10930")).click();
	String title=driver.getTitle();
	System.out.println(title);
	if(driver.getTitle().contains("View Lead")) {
		System.out.println("I confirm the title has View Lead");
	}
	else {
		System.out.println("The title doesnot have the word View Lead");
	}
	driver.findElement(By.linkText("Edit")).click();
	driver.findElement(By.id("updateLeadForm_companyName")).clear();
	driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Leaf");
	driver.findElement(By.className("smallSubmit")).click();
	driver.findElement(By.id("viewLead_companyName_sp")).getText();
	driver.close();
	
	
	
	
	
	
	
	
	
	}

}
