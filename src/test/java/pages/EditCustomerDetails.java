package pages;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import websiteLuanch.WebsiteLuanchPage;


public class EditCustomerDetails extends WebsiteLuanchPage {

	public void customers()throws InterruptedException{

		// Test Case 3: Verify customers pages got open and displayed successfully
		WebElement customers= driver.findElement(By.xpath("/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[4]/a/p"));
		customers.click();
		System.out.println("Customer category selected");
		WebElement customer= driver.findElement(By.xpath("/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[4]/ul/li[1]/a/p"));		//*[@id="customers-grid"]/tbody/tr[1]/td[7]/a
		customer.click();
		System.out.println("Customer selected");
	}

	public void customerDetails() throws InterruptedException{
		System.out.println("Read the customer table");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // wait for up to 10 seconds
		Thread.sleep(100);
		getScroll().executeScript("window.scrollBy(0,300)");
		WebElement table = driver.findElement(By.xpath("//*[@id=\"customers-grid\"]")); // Replace 'table_id' with the actual ID of the table
		Thread.sleep(200);
		// Get all rows from the table
		java.util.List<WebElement> rows = table.findElements(By.tagName("tr"));
		WebElement header= table.findElement(By.xpath("//*[@id=\"customers-grid_wrapper\"]/div[1]/div/div/div[1]/div/table"));
		String headerText = header.getText();
		System.out.println(headerText);
		// Iterate over each row
		for (WebElement row : rows) {
			// Get all columns in the current row
			java.util.List<WebElement> columns = row.findElements(By.tagName("td"));
			// Iterate over each column in the current row
			for (WebElement column : columns) {
				// Print the text inside the column
				System.out.print(column.getText() + "\t");
			}
			System.out.println(); // Move to the next line after printing each row
		}

		// Find the row (index starts from 0) and column (index starts from 0) you want
		int targetRow = 0; // Row 1
		int targetColumn = 6; // Column 7

		// Find the cell at the specified row and column
		WebElement cell = table.findElement(By.xpath(".//tr[" + (targetRow + 1) + "]/td[" + (targetColumn + 1) + "]"));
		WebElement element =cell.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/form[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[7]/a[1]"));
		element.click();

		WebElement enterPassword= driver.findElement(By.id("Password"));
		if(enterPassword.isDisplayed()) {
			enterPassword.click();
			System.out.println("Password filed is selected");
		}
		else {
			WebElement custeditd= driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/form[1]/section[1]/div[1]/div[1]/nop-cards[1]/nop-card[1]/div[1]/div[1]"));
			custeditd.click();
		}

		enterPassword.sendKeys("sdvvhfghjkl");
		System.out.println("New Password enterd");
		WebElement changePassword= driver .findElement(By.xpath("//*[@id=\"customer-info\"]/div[2]/div[2]/div[2]/div/div/button"));
		changePassword.click(); 
		System.out.println("Password Changed");
		getScroll().executeScript("window.scrollBy(0,300)");
		System.out.println("Page Scrolling");
	}

	public void addRewardPoint() throws InterruptedException{

		getScroll().executeScript("window.scrollBy(0,300)");
		System.out.println("Page Scrolling");
		WebElement orders= driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/form[1]/section[1]/div[1]/div[1]/nop-cards[1]/nop-card[8]/div[1]/div[1]"));
		WebElement stores= driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/form[1]/section[1]/div[1]/div[1]/nop-cards[1]/nop-card[8]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/table[1]/thead[1]/tr[1]/th[1]"));

		if(stores.isDisplayed()) {
			System.out.println("Add reward catwegory selected");	
		}
		else {
			orders.click();
			System.out.println("Add reward catwegory selected");
		}
	}

	public void addRewardPoints() throws InterruptedException{	
		WebElement add = driver.findElement(By.xpath("//div[contains(text(), 'Reward points')]"));
		add.click();

		System.out.println("Clicked on add rewards points");
		Thread.sleep(2000);

		getScroll().executeScript("window.scrollBy(0,200)");
		System.out.println("Page Scrolling");

		//	WebElement points= driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/form[1]/section[1]/div[1]/div[1]/nop-cards[1]/nop-card[8]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/span[1]/span[1]/span[2]/span[1]/span[1]"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement points = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/div[3]/div[1]/form[1]/section[1]/div[1]/div[1]/nop-cards[1]/nop-card[8]/div[1]/div[2]/div[2]/div[2]/div[1]/div[2]/span[1]/span[1]/span[2]/span[1]/span[1]")));
		points.click();
		points.click();
		points.click();
		points.click();
		System.out.println("Points are added to the user");
		Thread.sleep(30);
		WebElement addreducePoints= driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/form[1]/section[1]/div[1]/div[1]/nop-cards[1]/nop-card[8]/div[1]/div[2]/div[2]/div[2]/div[7]/div[1]/button[1]"));
		addreducePoints.click();
	}

	
	public void readTable() throws InterruptedException {
		System.out.println("Read Rewards Points Table");
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20)); // wait for up to 10 seconds
			Thread.sleep(100);
			WebElement table3= driver.findElement(By.xpath("//*[@id=\"customer-rewardpoints-grid_wrapper\"]/div[1]/div/div"));
			// Get all rows from the table
			java.util.List<WebElement> rows = table3.findElements(By.tagName("tr"));
			WebElement header3= table3.findElement(By.xpath("//*[@id=\"customer-rewardpoints-grid_wrapper\"]/div[1]/div/div/div[1]/div"));
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
		}catch (StaleElementReferenceException e) {
	        // Refresh the reference and retry reading the table
	        readTable();
	    } catch (NoSuchElementException e) {
			// Handle NoSuchElementException
			System.out.println("NoSuchElementException occurred: " + e.getMessage());
	    }
	}
}
