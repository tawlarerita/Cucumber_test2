package Stepdefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObject {
	WebDriver driver;

	public PageObject(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	@FindBy(linkText = "SignIn")
	public WebElement signin;
	@FindBy(name = "userName")
	public WebElement username;
	@FindBy(name = "password")
	public WebElement password;
	@FindBy(name = "Login")
	public WebElement login;
	@FindBy(linkText= "Product")
	public WebElement product;
	
}



