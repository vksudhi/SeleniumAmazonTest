import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.thoughtworks.selenium.webdriven.commands.GetTitle;

public class HomePage extends BaseClass {
	String URl ="http://www.amazon.com/";
	String searchLocator ="twotabsearchtextbox"; // Search box
	String clickButton="nav-input"; //Click button
	
	HomePage(WebDriver driver) throws InterruptedException{
		super(driver);
		open(URl);
	}
	
	public ResultsPage searchText(String text) {
		enterTextByLocator(searchLocator, text);
		Click(clickButton);
		return new ResultsPage(driver);
	}
	
	
	
}
