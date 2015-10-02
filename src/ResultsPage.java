import java.awt.List;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ResultsPage extends BaseClass {

	String click="title";
	String descriptionLoc="bib_description";
	String headervalue="headervalue";
	String descriptionText;
	String categroyRefinementLocator= "childRefinementLink";
	
	public ResultsPage(WebDriver otherDriver) {
		super(otherDriver);
		if (driver == null) {
			System.out.println("Driver Null");
		}
		// TODO Auto-generated constructor stub
	}

		
	public RefinedSearchPage getToRefinedSearchPage(String refinedSearch) {    
        java.util.List<WebElement> categoryList =
        		driver.findElements(By.className(categroyRefinementLocator)); 	

        for(WebElement ele : categoryList) {
        	String description = ele.getText();
        	if (description.equalsIgnoreCase(refinedSearch)) {
        		ele.click();
        		return new RefinedSearchPage(driver);
        	}
        } 
        
        return null;
    }
}

