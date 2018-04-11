//package stepDefinition;
//
//import java.util.List;
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
//public class DealStepDefinition {
//
//	WebDriver driver; 
//	@Given("^User is already on login page$")
//	public void user_already_on_login_page()
//	{
//		String driverpath = "D:\\chromedriver.exe";
//		System.setProperty("webdriver.chrome.driver", driverpath);
//		
//		driver = new ChromeDriver();
//		driver.get("https://www.freecrm.com");
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//	}
//	
//	@When("^title of login page is Free CRM$")
//	public void title_of_login_page_is_freeCRM()
//	{
//		String title = driver.getTitle();
//		System.out.println(title);
//	}
//	
//	@Then("^user enters username and password$")
//	 public void user_enter_username_and_password(DataTable credentials){
//	 
//		List<List<String>>data = credentials.raw();
//		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(data.get(0).get(0));
//		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(data.get(0).get(1));
//	}
//	
//	@Then("^user clicks on login button$")
//	public void user_click_on_login_button()
//	{
//		WebElement loginbtn = driver.findElement(By.xpath("//input[@value='Login' and @class='btn btn-small']"));
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].click();", loginbtn);
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
//	@Then("^user moves to deal page$")
//	public void user_move_to_new_deal_page()
//	{
//		driver.switchTo().frame("mainpanel");
//		Actions act = new Actions(driver);
//		act.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Deals')]"))).build().perform();
//		driver.findElement(By.xpath("//a[contains(text(),'New Deal')]")).click();
//	}
//	
//	@Then("^user enters deal details$")
//	public void user_enter_deal_details(DataTable dealdata)
//	{
//		List<List<String>> dealvalue = dealdata.raw();
//		WebElement title = driver.findElement(By.xpath("//input[contains(@name,'title')]"));
//		title.sendKeys(dealvalue.get(0).get(0));
//		WebElement amount = driver.findElement(By.xpath("//input[contains(@name,'amount')]"));
//		amount.sendKeys(dealvalue.get(0).get(1));
//		WebElement probability = driver.findElement(By.xpath("//input[contains(@name,'probability')]"));
//		probability.sendKeys(dealvalue.get(0).get(2));
//		WebElement commission = driver.findElement(By.xpath("//input[contains(@name,'commission')]"));
//		commission.sendKeys(dealvalue.get(0).get(3));
//	}
//	
//	@Then("^Close the browser$")
//	public void Close_the_browser()
//	{
//		driver.quit();
//	}
//}
