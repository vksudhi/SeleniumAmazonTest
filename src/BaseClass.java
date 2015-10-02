import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
		WebDriver driver;

		
		public BaseClass(WebDriver driver) {
			this.driver = driver;
		}
		
		public void open (String URL) {
			driver.get(URL);
		}
		public WebElement locateBox(String locator) {
			return driver.findElement(By.id(locator));
		}
		public void enterTextByLocator(String locator, String text){
			locateBox(locator).sendKeys(text);
		}
		
		public void Click(String click){
			driver.findElement(By.className(click)).click();
		}
		
		public String GetPageTitle(){
			return driver.getTitle();
			
		}
		
		public WebElement descriptionList(String descritionLocator) {
			return driver.findElement(By.className(descritionLocator));
			
		}
		
		public WebElement getHeader(String headervalue){
			return driver.findElement(By.id(headervalue));
			
		}
		
 }
		


