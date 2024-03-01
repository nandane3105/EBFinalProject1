package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import websiteLuanch.WebsiteLuanchPage;

public class Login extends WebsiteLuanchPage{
	public void enterEmail()throws InterruptedException{
		// Locate email fields
		WebElement emailInput = driver.findElement(By.xpath("//*[@id=\"Email\"]"));

		// Clear the already added value
		emailInput.clear();
		System.out.println("Email field cleared.");
		Thread.sleep(100);

		// Enter valid email address.
		emailInput.sendKeys("admin@yourstore.com");
		System.out.println("Valid Email address entered.");
		Thread.sleep(200);
	}
	public void enterPassword()throws InterruptedException{
		// Locate password fields
		WebElement passwordInput = driver.findElement(By.id("Password"));

		// Clear the already added value
		passwordInput.clear();
		System.out.println("Password field cleared.");
		Thread.sleep(100);

		// Enter username and password
		passwordInput.sendKeys("admin");
		System.out.println("Correct password entered.");
		//Thread.sleep(2000);
	}

	public void login()throws InterruptedException{

		// Locate the remeber me check box and click on it.
		WebElement rememberme = driver.findElement(By.id("RememberMe"));
		rememberme.click();
		Thread.sleep(200);

		// Locate login button
		WebElement loginButton = driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button"));

		// Click on login button
		loginButton.click();
		System.out.println("User logged in successfully.");
	}
	public void dashboard() throws InterruptedException {
		System.out.println("User is navigated the Dashboard page.");
		// Get the actual title of the page
		String actualTitle = driver.getTitle();
		// System.out.println(actualTitle);

		// Define the expected title
		String expectedTitle = "Dashboard / nopCommerce administration";

		// Compare the actual title with the expected title
		Assert.assertEquals(expectedTitle, actualTitle);
		System.out.println("The page title is: "+actualTitle);
	}

}
