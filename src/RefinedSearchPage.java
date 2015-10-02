import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RefinedSearchPage extends BaseClass {

	String searchResultsLocator = "s-results-list-atf";
	
	public RefinedSearchPage(WebDriver driver) {
		super(driver);
	}

	public RefinedSearchPage getFirstLink() {    
        /* Read BrandNames */
		System.out.println("Getting First link....");
        
		java.util.List<WebElement> categoryList =
        		driver.findElements(By.id(searchResultsLocator)); 	

		System.out.println("Getting First link 1....");
        WebElement ele = categoryList.get(0);
        
        //System.out.println(ele.getText());
        
        /* Hard Coded !!!! */
        ele = ele.findElement(By.id("result_0"));

        ele.findElement(By.tagName("a")).click();;
        
        
        return null;
    }


	
}
