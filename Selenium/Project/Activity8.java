package LMS_Activity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity8 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/lms");
		driver.findElement(By.linkText("Contact")).click();
		WebElement FullName=driver.findElement(By.id("wpforms-8-field_0"));
		WebElement Email= driver.findElement(By.xpath("//input[@id='wpforms-8-field_1']"));
		WebElement Subject=driver.findElement(By.xpath("//input[@id='wpforms-8-field_3']"));
		WebElement comment= driver.findElement(By.cssSelector("textarea#wpforms-8-field_2"));
		
		FullName.sendKeys("FST");
		Email.sendKeys("Training@mail.com");
		Subject.sendKeys("Testing");
		comment.sendKeys("Now a days i am enhancing my skill in Full stack testing");
		
		driver.findElement(By.id("wpforms-submit-8")).click();
		
		Thread.sleep(20);
		String Confirmation=driver.findElement(By.id("wpforms-confirmation-8")).getText();
		System.out.println(Confirmation);
		driver.quit();
		
		
	}

}
