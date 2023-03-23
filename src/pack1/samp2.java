package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class samp2 {

	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./Driver/geckodriver.exe");

        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.saucedemo.com/");
		                                By uName = By.id("user-name");
		                                driver.findElement(uName).sendKeys("problem_user");

		                                By pWord = By.id("password");
		                                driver.findElement(pWord).sendKeys("secret");

		                                By loginBtn = By.id("login-button");
		                                driver.findElement(loginBtn).click();

		                                By errorMessage = By.xpath("//h3[@data-test='error']");
		                                String actError = driver.findElement(errorMessage).getText();

		                                if (actError.contains("Epic sadface")) {
		                                                System.out.println("Error Message is present");
		                                                
		                                Thread.sleep(5000);
		                                driver.quit();
		                                }

		                }



}


