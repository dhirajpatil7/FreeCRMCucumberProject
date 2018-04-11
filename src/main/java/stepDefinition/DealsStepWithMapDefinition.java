//package stepDefinition;
//
//import java.util.Map;
//import java.util.concurrent.TimeUnit;
//
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//
//import cucumber.api.DataTable;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class DealsStepWithMapDefinition {
//
//	WebDriver driver;
//
//	@Given("^User is already on login page$")
//	public void user_already_on_login_page() {
//		String driverpath = "D:\\chromedriver.exe";
//		System.setProperty("webdriver.chrome.driver", driverpath);
//
//		driver = new ChromeDriver();
//		driver.get("https://www.freecrm.com");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//	}
//
//	@When("^title of login page is Free CRM$")
//	public void title_of_login_page_is_freeCRM() {
//		String title = driver.getTitle();
//		System.out.println(title);
//	}
//
//	@Then("^user enters username and password$")
//	public void user_enter_username_and_password(DataTable credentials) {
//
//		for (Map<String, String> data : credentials.asMaps(String.class, String.class)) {
//			driver.findElement(By.xpath("//input[@name='username']")).sendKeys(data.get("username"));
//			driver.findElement(By.xpath("//input[@name='password']")).sendKeys(data.get("password"));
//		}
//	}
//
//	@Then("^user clicks on login button$")
//	public void user_click_on_login_button() {
//		WebElement loginbtn = driver.findElement(By.xpath("//input[@value='Login' and @class='btn btn-small']"));
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].click();", loginbtn);
//	}
//
//	@Then("^user is on home page$")
//	public void user_is_on_home_page() {
//		String title1 = driver.getTitle();
//		System.out.println("Home Page Title is " + title1);
//		Assert.assertEquals("CRMPRO", title1);
//	}
//
//	@Then("^user moves to deal page$")
//	public void user_move_to_new_deal_page() {
//		driver.switchTo().frame("mainpanel");
//		Actions act = new Actions(driver);
//		act.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Deals')]"))).build().perform();
//		driver.findElement(By.xpath("//a[contains(text(),'New Deal')]")).click();
//	}
//
//	@Then("^user enters deal details$")
//	public void user_enter_deal_details(DataTable dealdata) {
//
//		for (Map<String, String> data : dealdata.asMaps(String.class, String.class)) {
//			WebElement title1 = driver.findElement(By.xpath("//input[contains(@name,'title')]"));
//			title1.sendKeys(data.get("title"));
//			
//			WebElement amount1 = driver.findElement(By.xpath("//input[contains(@name,'amount')]"));
//			amount1.sendKeys(data.get("amount"));
//			
//			WebElement probability1 = driver.findElement(By.xpath("//input[contains(@name,'probability')]"));
//			probability1.sendKeys(data.get("probability"));
//			
//			WebElement commission1 = driver.findElement(By.xpath("//input[contains(@name,'commission')]"));
//			commission1.sendKeys(data.get("commission"));
//			
//			WebElement save = driver.findElement(By.xpath("//input[@type='submit' and @value='Save']"));
//			save.click();
//			
//			Actions act = new Actions(driver);
//			act.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Deals')]"))).build().perform();
//			driver.findElement(By.xpath("//a[contains(text(),'New Deal')]")).click();
//		}
//
//	}
//
//	@Then("^Close the browser$")
//	public void Close_the_browser() {
//		driver.quit();
//	}
//}
