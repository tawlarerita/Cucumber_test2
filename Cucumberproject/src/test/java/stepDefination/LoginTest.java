package stepDefination;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {
	public static WebDriver driver;
	PageObject po;

	@Given("^Navigate to Home page$")
	public void wheniamonhomepage() throws Throwable {

		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		po = new PageObject(driver);

	}

	@When("^user enters username and password$")
	public void ienterusernameandpassword() throws Throwable {
		po.signin.click();
		po.username.sendKeys("lalitha");
		po.password.sendKeys("Password123");
		po.login.click();

	}

	@Then("^user login successfully$")
	public void iamabletologin() throws Throwable {
		System.out.println("User login successfully");

	}

	@When("Larry searches below product in the search box:")
	public void larry_seraches_below_products_in_the_serach_box(DataTable dt) {
		List<String> product = dt.asList(String.class);
		for (String s : product) {
			driver.findElement(By.name("products")).sendKeys(s);
			driver.findElement(By.xpath("//input[@value='FIND DETAILS']")).click();
			driver.findElement(By.xpath("//a[@href='fetchat.htm']")).click();
		}
	}
	@When("^i enter \"([^\"]*)\" and \"([^\"]*)\"$")
		public void enterusernamepassword123(String username,String password ) {
		po.signin.click();
        po.username.sendKeys(username);
		po.password.sendKeys(password);
        po.login.click();
        po.signin.click();
        driver.findElement(By.xpath("")).click();                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           
			
		}

	@Then("product should be added in the cart if available ")
	public void product_should_be_displayed_if_avaialable_in_TestMeApp() {
	}
}