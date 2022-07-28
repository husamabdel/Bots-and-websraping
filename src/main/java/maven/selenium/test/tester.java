package maven.selenium.test;

import java.util.*;
import java.io.*;
import java.time.Duration;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.firefox.*;
import io.github.bonigarcia.wdm.*;
import javax.swing.*;
public class tester {

	@BeforeClass
	public static void setupClass() {
		
		WebDriverManager.firefoxdriver().setup();
		
		
	}
	
	@Test
	public static void main(String []args ) throws InterruptedException {
		setupClass();
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://saucedemo.com");

		String title = driver.getTitle();
		JOptionPane.showMessageDialog(null,title,"The title from webpage",JOptionPane.OK_OPTION);
		
		WebElement submitUsername = driver.findElement(By.id("user-name"));
		submitUsername.sendKeys("standard_user");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		WebElement submitPassword = driver.findElement(By.id("password"));
		submitPassword.sendKeys("secret_sauce");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		WebElement clickS = driver.findElement(By.id("login-button"));
		clickS.click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		WebElement addCart = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
		addCart.click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		WebElement checkOut = driver.findElement(By.id("shopping_cart_container"));
		checkOut.click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		WebElement checkOut2 = driver.findElement(By.id("checkout"));
		checkOut2.click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		WebElement nameFeild = driver.findElement(By.id("first-name"));
		nameFeild.sendKeys("John");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		WebElement lastFeild = driver.findElement(By.id("last-name"));
		lastFeild.sendKeys("Doe");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		WebElement zipFeild = driver.findElement(By.id("postal-code"));
		zipFeild.sendKeys("22312");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		WebElement space = driver.findElement(By.id("continue"));
		space.click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		WebElement done = driver.findElement(By.id("finish"));
		done.click();		
		
		JOptionPane.showMessageDialog(null,"The purchase has been complete!","Alert", JOptionPane.OK_OPTION);
		
		Thread.sleep(5000);
		
		driver.quit();
		
	}
	
}
