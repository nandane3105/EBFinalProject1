package stepDefination;


import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.EditCustomerDetails;
import pages.Login;
import pages.Sales;
import websiteLuanch.WebsiteLuanchPage;

public class AllNopCommerceSteps {
	WebsiteLuanchPage launchp = new WebsiteLuanchPage();
	Login loginp = new Login(); 
	EditCustomerDetails cust= new EditCustomerDetails();
	Sales salep= new Sales();


	@BeforeSuite

	// @Test (priority= 1)
	@Given("Launch the Website and user navigates to login page")
	public void launch_the_website_and_user_navigates_to_login_page() throws InterruptedException {
			launchp.browserLaunch("chrome", "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");

		//	driver=	launchp.getDriver();
		//		launchp.browserLaunch("chrome", "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		
	}
	
	 
	

	@Test (priority= 2)
	@When("User enters valid username and password")
	public void user_enters_valid_username_and_password() throws InterruptedException {
		loginp.enterEmail();
		loginp.enterPassword();
	}

	@Test (priority= 3)
	@When("Save the credentials and Clicks on login button")
	public void save_the_credentials_and_clicks_on_login_button() throws InterruptedException {
		loginp.login();
	}

	@Test (priority= 4)
	@Then("User is navigated to the Dashboard page")
	public void user_is_navigated_to_the_dashboard_page() throws InterruptedException {
		loginp.dashboard();
	}

	@Test (priority= 5)
	@Given("Click on sales")
	public void click_on_sales() throws InterruptedException {
		salep.sales();
	}

	@Test (priority= 6)
	@When("Click on ordes")
	public void click_on_ordes() throws InterruptedException {
		salep.orders();
	}

	@Test (priority= 7)
	@Then("Read the orders table")
	public void read_the_orders_table() throws InterruptedException {
		salep.ordersTable();
	}

	@Test (priority= 8)
	@Given("Click on customers from dashboard")
	public void click_on_customers_from_dashboard() throws InterruptedException {
		cust.customers();
	}

	@Test (priority= 9)
	@When("Click on edit buttom to change the password for the customer")
	public void click_on_edit_buttom_to_change_the_password_for_the_customer() throws InterruptedException {
		cust.customerDetails();
	}

	@Test (priority= 10)
	@When("Click on add rewards point")
	public void click_on_add_rewards_point() throws InterruptedException {
		cust.addRewardPoint();
	}

	@Test (priority= 11)
	@Then("Add the rewards points to the customer")
	public void add_the_rewards_points_to_the_customer() throws InterruptedException {
		cust.addRewardPoints();
	}

	@Test (priority= 12)
	@Then("Read a table with added rewards points")
	public void read_a_table_with_added_rewards_points() throws InterruptedException {
		cust.readTable();
	}

	@AfterClass
	@Given("Close the browser")
	public void close_the_browser() {
		launchp.teardown();

	}

}
