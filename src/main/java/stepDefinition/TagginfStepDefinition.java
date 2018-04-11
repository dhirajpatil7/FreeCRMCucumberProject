package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;

public class TagginfStepDefinition {

	WebDriver driver;

	@Given("^User is already on login page$")
	public void user_already_on_login_page() {
//		String driverpath = "D:\\chromedriver.exe";
//		System.setProperty("webdriver.chrome.driver", driverpath);
//
//		driver = new ChromeDriver();
//		driver.get("https://www.freecrm.com");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Given("^This is valid login test$")
	public void This_is_valid_login_test() {
		
//		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("naveenk");
//		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("test@123");
//		WebElement loginbtn = driver.findElement(By.xpath("//input[@value='Login' and @class='btn btn-small']"));
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].click();", loginbtn);
	}

//	@Given("^This is invalid login test$")
//	public void This_is_invalid_login_test() {
//	}

	@Given("^This is a contact test case$")
	public void This_is_a_contact_test_case() {
	
//		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
	}

	@Given("^This is a deal test case$")
	public void This_is_a_deal_test_case() {
//	driver.findElement(By.xpath("//a[contains(text(),'Deals')]")).click();	
	}

	@Given("^This is a task test case$")
	public void This_is_a_task_test_case() {
//		driver.findElement(By.xpath("//a[contains(text(),'Tasks')]")).click();
	}

	@Given("^This is a case test case$")
	public void This_is_a_case_test_case() {
//		driver.findElement(By.xpath("//a[contains(text(),'Cases')]")).click();
	}

	@Given("^Clicking on left panel links$")
	public void Clicking_on_left_panel_links() {
//		driver.findElement(By.xpath("//a[contains(text(),'Pipeline')]")).click();
	}

	@Given("^This is a search deal test$")
	public void This_is_a_search_deal_test() {
		
//		Select S1 = new Select(driver.findElement(By.xpath("//select[@name='quick_search_selector']")));
//		S1.selectByVisibleText("Name this search");
		
		
	}

	@Given("^This is a search contact test$")
	public void This_is_a_search_contact_test() {
//		driver.findElement(By.xpath("//input[@value='Quick Search']")).sendKeys("CRM");
	
	}

	@Given("^This is a search case test$")
	public void This_is_a_search_case_test() {
//		driver.findElement(By.xpath("//input[@type='image']")).click();
	}

//	@Given("^This is a search task test$")
//	public void This_is_a_search_task_test() {
//	}

	@Given("^This is a search call test$")
	public void This_is_a_search_call_test() {
//		driver.findElement(By.xpath("//a[contains(text(),'Call')]")).click();
	}

	@Given("^This is a search email test$")
	public void This_is_a_search_email_test() {
//		driver.findElement(By.xpath("//a[contains(text(),'Email')]")).click();
	}

	@Given("^This is a search docs test$")
	public void This_is_a_search_docs_test() {
//		driver.findElement(By.xpath("//a[contains(text(),'Docs')]")).click();
	}

	@Given("^This is a search forms test$")
	public void This_is_a_search_forms_test() {
//		driver.findElement(By.xpath("//a[contains(text(),'Forms')]")).click();
	}

	@Given("^This is a report test$")
	public void This_is_a_report_test() {
//		driver.findElement(By.xpath("//a[contains(text(),'Reports')]")).click();
	}

	@Given("^This is a logout test$")
	public void This_is_a_logout_test() {
//		driver.findElement(By.xpath("//a[href='https://www.freecrm.com/index.cfm?logout=1']")).click();
	}

}
