package websiteLuanch;

import java.util.Properties;
import java.util.Scanner;

import org.junit.BeforeClass;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class WebsiteLuanchPage {

	// Initialize ChromeDriver
	public static WebDriver driver;
	public static JavascriptExecutor js;
	private Properties properties;

	public void browserLaunch(String browser, String url) {
		switch (browser) {
		case "chrome":
			driver= new ChromeDriver();
			break;

		default:
			System.out.println("Invalid Browser.");
			break;

		}


		//	driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		driver.get(url);
		// Maximize the browser window
		driver.manage().window().maximize();

	}

	public JavascriptExecutor getScroll() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		return js;
	}

	public WebDriver getDriver() {
		return driver;
	}

	public Scanner getScanner() {
		return new Scanner(System.in);
	}
	public void teardown() {
		if (driver != null) {
			driver.quit();

		}
	}
}