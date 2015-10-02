import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class RefinedSearchPage extends BaseClass {

	String searchResultsLocator = "s-results-list-atf";
	
	public RefinedSearchPage(WebDriver driver) {
		super(driver);
	}

	public ProductPage getFirstResult() {    
        
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("s-access-image")));
		java.util.List<WebElement> categoryList =
        		driver.findElements(By.id(searchResultsLocator)); 	

        WebElement ele = categoryList.get(0);
        
        /* Hard Coded !!!! */
        ele = ele.findElement(By.id("result_0"));

        ele.findElement(By.tagName("a")).click();;
        
        
        return new ProductPage(driver);
    }


	
}
