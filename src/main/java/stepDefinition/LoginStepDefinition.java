//package stepDefinition;
//
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class LoginStepDefinition {
//
//	WebDriver driver;
//	
//	
//	@Given("^User is already on login page$")
//	public void user_already_on_login_page()
//	{
//		String driverpath = "D:\\chromedriver.exe";
//		System.setProperty("webdriver.chrome.driver", driverpath);
//		
//		driver = new ChromeDriver();
//		driver.get("https://www.freecrm.com");
//		driver.manage().window().maximize();
//	}
//	
//	@When("^title of login page is Free CRM$")
//	public void title_of_login_page_is_freeCRM()
//	{
//		String title = driver.getTitle();
//		System.out.println(title);
//	}
//	
//	@Then("^user enters \"(.*)\" and \"(.*)\"$")
//	 public void user_enter_username_and_password(String username, String password){
//	 
//		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("username");
//		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("password");
//	}
//	
//	@Then("^user clicks on login button$")
//	public void user_click_on_login_button()
//	{
//		WebElement loginbtn = driver.findElement(By.xpath("//input[@value='Login' and @class='btn btn-small']"));
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].click();", loginbtn);
//		
//	}
//	
//	@Then("^user is on home page$")
//	public void user_is_on_home_page()
//	{
//		String title1 = driver.getTitle();
//		System.out.println("Home Page Title is "+title1);
//		Assert.assertEquals("CRMPRO",title1);
//	}
//	
//	@Then("^Close the browser$")
//	public void close_the_browser()
//	{
//		driver.quit();
//	}
//	
//}
