package stepDefinitions;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class greenKartStepDefinitions {
public WebDriver driver; 
private String productName; 
private String topDealsProductName; 

	@Given("User is on GreenCart landing page")
	public void user_is_on_green_cart_landing_page() throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(2500);

	}
	
	@When("User searched for short name {string} and extracted the actual name of the product")
	public void user_searched_for_short_name_and_extracted_the_actual_name_of_the_product(String shortName) {

		driver.findElement(By.xpath("//input[@type='search'")).sendKeys(shortName);
		String productName = driver.findElement(By.cssSelector("h4.product-name")).getText().split("-")[0].trim();
		System.out.println(productName + " is extracted from the search"); 
	}
	
	@Then("User searches for same short name in offersd page to check if the product exists")
	public void user_searches_for_same_short_name_in_offersd_page_to_check_if_the_product_exists() {

		driver.findElement(By.xpath("//a[normalize-space()='Top Deals']")).click();
		String topDealsProductName = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/div/div/table/tbody/tr/td[1]")).getText();
		System.out.println(topDealsProductName + " is extracted from the top deals search"); 
		
	}
	
	@Then("It is verified that both pages display the same product when searching with a short name")
	public void it_is_verified_that_both_pages_display_the_same_product_when_searching_with_a_short_name() {
	
		boolean shortNameSearchMatch = productName.equals(topDealsProductName);
		if (shortNameSearchMatch == true) {
			assertEquals("Product names do match", productName, topDealsProductName);
		}
		else {
		assertEquals("Product names do not match", productName, topDealsProductName);
		}	
	}
}