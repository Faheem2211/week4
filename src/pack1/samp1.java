package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class samp1 {

	public static void main(String[] args) throws InterruptedException {

	                                System.setProperty("webdriver.chrome.driver","./Driver/geckodriver.exe");

	                                WebDriver driver = new FirefoxDriver();

	                                driver.get("https://www.saucedemo.com/");
	                                
	                                By uName = By.id("user-name");
	                                driver.findElement(uName).sendKeys("problem_user");

	                                By pWord = By.id("password");
	                                driver.findElement(pWord).sendKeys("secret_sauce");

	                                By loginBtn = By.id("login-button");
	                                driver.findElement(loginBtn).click();

	                                Thread.sleep(10000);

	                                By productsTitle = By.className("title");
	                                String actText = driver.findElement(productsTitle).getText();
	                                System.out.println(actText + " Expected Title ");

	                                driver.quit();

	                }

}


