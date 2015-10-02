import java.awt.List;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ResultsPage extends BaseClass {

	String click="title";
	String descriptionLoc="bib_description";
	String headervalue="headervalue";
	String descriptionText;
	String categroyRefinementLocator= "childRefinementLink";
	
	public ResultsPage(WebDriver otherDriver) {
		super(otherDriver);
	}

	/* Return Refined Search Page */	
	public RefinedSearchPage getToRefinedSearchPage(String refinedSearch) {    
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("categoryRefinementsSection")));
        java.util.List<WebElement> categoryList =
        		driver.findElements(By.className(categroyRefinementLocator)); 	

        for(WebElement ele : categoryList) {
        	String description = ele.getText();
        	if (description.equalsIgnoreCase(refinedSearch)) {
        		/* Click on Refined Page */
        		ele.click();
        		return new RefinedSearchPage(driver);
        	}
        } 
        
        return null;
    }
}

