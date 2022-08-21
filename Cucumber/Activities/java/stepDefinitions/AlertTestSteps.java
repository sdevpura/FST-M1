package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AlertTestSteps {

    WebDriver driver;
    WebDriverWait wait;

    Alert alert;
    @Given("^User is on the page$")
    public void launch(){
        driver = new FirefoxDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://www.training-support.net/selenium/javascript-alerts");
    }

    @When("^User clicks the Simple Alert button$")
    public void simpleAlertTest(){
        driver.findElement(By.id("simple")).click();
    }

    @When("^User clicks the Confirm Alert button$")
    public void confirmAlertTest(){
        driver.findElement(By.id("confirm")).click();
    }

    @When("^User clicks the Prompt Alert button$")
    public void promptAlertTest(){
        driver.findElement(By.id("prompt")).click();
    }

    @Then("^Alert opens$")
    public void switchToAlert(){
        alert = driver.switchTo().alert();
    }
    @And("^Read the text from it and print it$")
    public void getAlertText(){
        String alertText = alert.getText();
        System.out.println("Alert Text is: "+alertText);
    }

    @And("^Close the alert$")
    public void closeAlertAccept(){
        alert.accept();
    }

    @And("^Close the alert with Cancel$")
    public void closeAlertDismiss(){
        alert.dismiss();
    }

    @And("^Write a custom message in it$")
    public void writeText(){
        alert.sendKeys("OK");
    }

    @And("^Read the result text$")
    public void getResultText(){
        String alertText = alert.getText();
        System.out.println("Alert Text is: "+alertText);
    }

    @And("^Close Browser$")
    public void quitBrowser(){
        driver.quit();
    }
}
