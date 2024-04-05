package StepDefinition;

import BaseLayer.BaseClass;
import PageLayer.RegisterPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class RegisterPageSteps extends BaseClass{

	public static RegisterPage regpage;
	@Given("user open a {string} browser")
	public void user_open_a_browser(String browser) {

		BaseClass.initialization(browser);
	}

	@Given("user will be on facebook register page")
	public void user_will_be_on_facebook_register_page() {
	 
		String url = prop.getProperty("Url");
		driver.get(url);
	  
	}

	@When("user enter valid {string} , {string} , {string} , {string} ,")
	public void user_enter_valid(String fname, String lname, String emailaddress, String password) {
	
		 regpage = new RegisterPage();
		 regpage.fbRegisterPageFunctionality(fname, lname, emailaddress, password);
	}

	@When("user select {string}, {string} , {string} and select {string} gender")
	public void user_select_and_select_gender(String date, String month, String year, String gender) {
	   
		regpage.fbRegisterCredentialFunctionality(date, month, year, gender);
		}
	}

	

