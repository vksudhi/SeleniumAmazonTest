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
		HomePage home = new HomePage(driver);
		String SearchWord ="apple watch";
		String refinedSearch = "Smart Watches";		
		String ratingLocator = "acrPopover";
		String ratingVerify = "3.8 out of 5 stars";

		ResultsPage resultList = home.searchText(SearchWord);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("categoryRefinementsSection")));
		org.junit.Assert.assertTrue(element != null);
		RefinedSearchPage refinedPage = resultList.getToRefinedSearchPage(refinedSearch);
		org.junit.Assert.assertTrue(refinedPage != null);
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("s-access-image")));
		org.junit.Assert.assertTrue(element != null);
		refinedPage.getFirstLink();
		element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(ratingLocator)));
		org.junit.Assert.assertTrue(element != null);
		org.junit.Assert.assertEquals(ratingVerify, element.getAttribute("title"));		
	}
}


