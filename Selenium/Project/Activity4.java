package LMS_Activity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Activity4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/lms");
		String title=driver.getTitle();
		System.out.println("Title of the page"+title);
		String SecCourse=driver.findElement(By.xpath("//div[@id='ld_course_list']/div/div/div[2]/article/div[2]/h3")).getText();
		System.out.println("Second most popular course: "+SecCourse);
		Assert.assertEquals(SecCourse, "Email Marketing Strategies");
		System.out.println("Course matched ");
		driver.quit();
		
		
	}

}
