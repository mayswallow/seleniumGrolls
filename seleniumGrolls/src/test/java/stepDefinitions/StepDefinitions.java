package stepDefinitions;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

//import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class StepDefinitions {
	
	private WebDriver driver;
	

		@Given("I have entered https:\\/\\/www.grolls.se\\/helags-t-shirt--svart1100099.html")
		public void i_have_entered_https_www_grolls_se_helags_t_shirt_svart1100099_html() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\chromedriver.exe");
		    driver = new ChromeDriver(); // Starta Chrome
		    //driver.manage().window().maximize();
		    driver.get("https://www.grolls.se/helags-t-shirt--svart1100099.html"); // Gå till webbsidan	
		}


		@Given("Select size small")
		public void select_size_small() throws InterruptedException {
			Select dropDown = new Select(driver.findElement(By.id("attribute400")));
			Thread.sleep(3000);
			dropDown.selectByValue("1419");
		}
		
		@Given("Select {int} shirts")
		public void select_shirts(Integer int1) throws InterruptedException {
			Thread.sleep(2000);
			WebElement antal = driver.findElement(By.className("qty-plus"));
			antal.click();
		}
		
		@When("Press buy")
		public void press_buy() throws InterruptedException {
			driver.findElement(By.id("product-addtocart-button")).click();
			Thread.sleep(4000);
			driver.findElement(By.className("showcart")).click();
		}
		
		@Then("Result {int} shirts bought")
		public void result_shirts_bought(Integer int1)  throws InterruptedException {
			WebElement amount= driver.findElement(By.className("item-qty"));
			assertEquals("2", amount.getAttribute("value"));
			Thread.sleep(4000);
			driver.close();
		}
		}

