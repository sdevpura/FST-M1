//Goal: Opening a page on the browser and testing a to-do list page

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class Project_GoogleChrome {

    AndroidDriver driver;
    WebDriverWait wait;

    //Open the Chrome app on your device.
    @BeforeTest()
    public void setup() throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("android");
        options.setAutomationName("UiAutomator2");
        options.setAppPackage("com.android.chrome");
        options.setAppActivity("com.google.android.apps.chrome.Main");
        options.noReset();

        URL serverURL = new URL("http://localhost:4723/wd/hub");
        driver = new AndroidDriver(serverURL,options);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    }

    @Test()
    public void addTasks(){
        String UiScrollable = "UiScrollable(UiSelector().scrollable(true))";
        String[] taskList = {"Add tasks to list","Get number of tasks","Clear the list"};
        //Go to the following URL: https://www.training-support.net/selenium
        driver.get("https://www.training-support.net/selenium");
        //Scroll to find the To-Do List card and click it.
        driver.findElement(AppiumBy.androidUIAutomator(UiScrollable + ".flingForward()"));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(AppiumBy.xpath("//android.view.View[contains(@text, 'To-Do List')]"))));
        driver.findElement(AppiumBy.xpath("//android.view.View[contains(@text, 'To-Do List')]")).click();
        //Once the page loads, find the input field on the page and enter the following three tasks:
        //i.Add tasks to list
        //ii. Get number of tasks
        //iii. Clear the list
        wait.until(ExpectedConditions.presenceOfElementLocated((AppiumBy.xpath("//android.view.View[1]/android.widget.EditText"))));
        for(int i=0;i<taskList.length;i++){
            driver.findElement(AppiumBy.xpath("//android.view.View[1]/android.widget.EditText")).click();
            driver.findElement(AppiumBy.xpath("//android.view.View[1]/android.widget.EditText")).sendKeys(taskList[i]);
            driver.findElement(AppiumBy.xpath("//android.widget.Button[@text='Add Task']")).click();
        }

        //Click on each of the tasks added to strike them out.
        for(int j=0;j<taskList.length;j++){
            driver.findElement(AppiumBy.xpath("//android.view.View[@text='"+taskList[j]+"']")).click();
        }

        //Finally, clear the list.
        driver.findElement(AppiumBy.xpath("//android.view.View/android.view.View[4]/android.view.View[3]/android.view.View[2]")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated((AppiumBy.xpath("//android.view.View[1]/android.widget.EditText"))));

        //Add assertions to verify that the test has passed or failed.
        driver.get("https://www.training-support.net/selenium/todo-list");
        wait.until(ExpectedConditions.presenceOfElementLocated((AppiumBy.xpath("//android.view.View[1]/android.widget.EditText"))));
        Assert.assertTrue(driver.findElement(AppiumBy.xpath("//android.view.View[contains(@text, 'Add more tasks to this list')]")).isDisplayed());
    }



}
