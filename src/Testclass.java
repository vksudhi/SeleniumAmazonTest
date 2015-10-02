import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.ImplicitlyWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

public class Testclass {
	WebDriver driver;
	
	@Before
	public void setup(){
	    System.setProperty("webdriver.chrome.driver", "/Selenium/ChromeDriver/chromedriver.exe");
		driver = new ChromeDriver();
	}
	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}
	
	@Test
	public void testAppleWatch() throws InterruptedException {
		String SearchWord ="apple watch";
		String refinedSearch = "Smart Watches";		
		String ratingVerify = "3.8 out of 5 stars";

		HomePage home = new HomePage(driver);
		ResultsPage resultList = home.searchText(SearchWord);
		RefinedSearchPage refinedPage = resultList.getToRefinedSearchPage(refinedSearch);
		org.junit.Assert.assertTrue(refinedPage != null);
		/* Get the first link */
		ProductPage prdPage = refinedPage.getFirstResult();
		org.junit.Assert.assertTrue(prdPage != null);
		/* Assert on rating.*/;
		org.junit.Assert.assertEquals(ratingVerify, prdPage.getRating());		
	}
}


