package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import websiteLuanch.WebsiteLuanchPage;

public class Sales  extends WebsiteLuanchPage {
	public void sales()throws InterruptedException{
		WebElement sale= driver.findElement(By.xpath("/html[1]/body[1]/div[3]/aside[1]/div[1]/div[4]/div[1]/div[1]/nav[1]/ul[1]/li[3]/a[1]/p[1]"));
		sale.click();
		System.out.println("Sales panel got displayed.");
	}
	public void orders() throws InterruptedException{
		WebElement orders=driver.findElement(By.xpath("/html[1]/body[1]/div[3]/aside[1]/div[1]/div[4]/div[1]/div[1]/nav[1]/ul[1]/li[3]/ul[1]/li[1]/a[1]/p[1]"));
		orders.click();
		System.out.println("Orders page got displayed.");
	}
	public void ordersTable() throws InterruptedException{

		System.out.println("Read orders Table");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20)); // wait for up to 10 seconds
		Thread.sleep(100);
		WebElement table3= driver.findElement(By.xpath("//*[@id=\"orders-grid\"]"));
		System.out.println("table found");
		// Get all rows from the table
		java.util.List<WebElement> rows = table3.findElements(By.tagName("tr"));
		WebElement header3= table3.findElement(By.xpath("//*[@id=\"orders-grid_wrapper\"]/div[1]/div/div/div[1]/div/table/thead/tr"));
		String header3Text = header3.getText();
		System.out.println(header3Text);
		// Iterate over each row
		for (WebElement rows2 : rows) {
			// Get all columns in the current row
			java.util.List<WebElement> columns = rows2.findElements(By.tagName("td"));
			// Iterate over each column in the current row
			for (WebElement columns2 : columns) {
				// Print the text inside the column
				System.out.print(columns2.getText() + "\t");
			}
			System.out.println(); // Move to the next line after printing each row
		}

	}

}
