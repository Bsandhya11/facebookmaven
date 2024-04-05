package PageLayer;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;
import UtilityLayer.HandleDropDown;
import UtilityLayer.Wait;

public class RegisterPage extends BaseClass{

	@FindBy (name="firstname")
	private WebElement firstname;
	
	@FindBy (name="lastname")
	private WebElement lname;
	
	@FindBy (name="reg_email__")
	private WebElement emailaddress;
	
	@FindBy (name="reg_passwd__")
	private WebElement password;
	
	@FindBy (name="birthday_day")
	private WebElement Day;
	
	@FindBy (name="birthday_month")
	private WebElement Month;
	
	@FindBy (name="birthday_year")
	private WebElement year;
	
	@FindBys(@FindBy(xpath="//span[@class='_5k_2 _5dba']"))
	private List<WebElement> Gender;
	
	public RegisterPage()
	{
		PageFactory.initElements(driver, this);
	}

	public void fbRegisterPageFunctionality(String fname, String lastname,String email, String pwd )
	{
		Wait.sendKeys(firstname, fname);
		Wait.sendKeys(lname, lastname);
		Wait.sendKeys(emailaddress, email);
		Wait.sendKeys(password, pwd);
		
	}
	public void fbRegisterCredentialFunctionality(String date, String mon, String yr,String gen)
	{
		
		HandleDropDown.selectByVisibleText(Day, date);
		HandleDropDown.selectByVisibleText(Month, mon);
		HandleDropDown.selectByVisibleText(year, yr);
		Wait.selectAnyOption(Gender, gen);
		
	}
	

	
	
	
	
	
	
	
	
}
