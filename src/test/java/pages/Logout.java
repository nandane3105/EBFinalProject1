package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import websiteLuanch.WebsiteLuanchPage;

public class Logout extends WebsiteLuanchPage{
	public void logout()
	{
		// Click on logout button
		WebElement logoutButton = driver.findElement(By.xpath("//*[@id=\"navbarText\"]/ul/li[3]/a"));
		logoutButton.click();
	}

	public  void login() 
	{
		// Locate checkbox and login button
		WebElement rememberme= driver.findElement(By.xpath("//*[@id=\"RememberMe\"]"));
		rememberme.click();
		WebElement loginButton= driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button"));
		loginButton.click();
	}
}
